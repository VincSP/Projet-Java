package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.lang.model.element.Element;
import javax.swing.text.Position;

import com.mysql.cj.jdbc.CallableStatement;

import element.Boulder;
import element.Minor;
import element.Wall;
import model.GameMap;


/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class GameMapDAO extends AbstractDAO {

	public static GameMap getGameMapByLevel(int level) throws SQLException {

        final CallableStatement callStatement = (CallableStatement) prepareCall("select * from map where level = (?)");
        callStatement.setInt(1, level);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();

    		GameMap gameMap = new GameMap(40,22);
            for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) {
				Position position = new Position(result.getInt(2), result.getInt(3));
				Element element = null;
				if("B".equals(result.getString(4))) {
					element = new Boulder(position);
				} else if ("M".equals(result.getString(4))) {
					element = new Minor(position);
				} else if ("W".equals(result.getString(4))) {
					element = new Wall(position);
				}
				gameMap.getMap().put(position, element);
            }
            result.close();
            return gameMap;
        }
        return null;       
	}
}
