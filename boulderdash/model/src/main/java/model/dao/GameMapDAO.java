package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

import dto.element.Air;
import dto.element.Boulder;
import dto.element.Diamond;
import dto.element.Door;
import dto.element.Element;
import dto.element.Miner;
import dto.element.Monster;
import dto.element.Mud;
import dto.element.Position;
import dto.element.Wall;
import dto.map.GameMap;


/**
 * <h1>DOA for load map.</h1>
 */
public abstract class GameMapDAO extends AbstractDAO {

	/**
	 * Get map by level
	 * 
	 * @param level of the map
	 * @return the map
	 * @throws SQLException
	 */
	public static GameMap getGameMapByLevel(int level) throws SQLException {

        final CallableStatement callStatement = (CallableStatement) prepareCall("select s.x, s.y, t.Name from Square s inner join Type t on s.IDTypeCase = t.ID where s.Level = (?)");
        callStatement.setInt(1, level);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();

    		GameMap gameMap = new GameMap(40,22);
            for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) {
				Position position = new Position(result.getDouble(1), result.getDouble(2));
				Element element = null;
				if("boulder".equals(result.getString(3))) {
					element = new Boulder(position);
				} else if ("miner".equals(result.getString(3))) {
					element = new Miner(position);
					gameMap.setMiner(element);
				} else if ("wall".equals(result.getString(3))) {
					element = new Wall(position);
				} else if ("mud".equals(result.getString(3))) {
					element = new Mud(position);
				} else if ("monster".equals(result.getString(3))) {
					element = new Monster(position);
				} else if ("diamond".equals(result.getString(3))) {
					element = new Diamond(position);
				} else if ("door".equals(result.getString(3))) {
					element = new Door(position);
					gameMap.setDoor(element);
				} else if ("air".equals(result.getString(3))) {
					element = new Air(position);
				}
				gameMap.getMap().put(position, element);
            }
            result.close();
            return gameMap;
        }
        return null;       
	}
}
