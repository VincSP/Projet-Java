package model;

import java.sql.SQLException;
import java.util.List;

import model.map.GameMap;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IBoulderdashModel {

	public GameMap getGameMapByLevel(int level) throws SQLException;
}
