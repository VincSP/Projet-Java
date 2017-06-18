package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.map.GameMap;
import model.map.Position;
import model.map.element.Cell;
import model.map.element.Player;
import model.map.element.Rock;
import model.map.element.Wall;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class GameMapDAO extends AbstractDAO {

	public static GameMap getGameMapByLevel(int level) throws SQLException {

        final CallableStatement callStatement = prepareCall("select * from map where level = (?)");
        callStatement.setInt(1, level);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();

    		GameMap gameMap = new GameMap(10,10);
            for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) {
				Position position = new Position(result.getInt(2), result.getInt(3));
				Cell cell = null;
				if("R".equals(result.getString(4))) {
					cell = new Rock(position);
				} else if ("P".equals(result.getString(4))) {
					cell = new Player(position);
				} else if ("M".equals(result.getString(4))) {
					cell = new Wall(position);
				}
				gameMap.getMap().put(position, cell);
            }
            result.close();
            return gameMap;
        }
        return null;
        
		
//		GameMap gameMap = new GameMap(10,10);
//
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				Position position = new Position(i, j);
//				
//				Rock rock = new Rock(position);
//				
//				gameMap.getMap().put(position, rock);
//			}
//		}
//		return gameMap;
	}
}
