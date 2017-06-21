package model;

import java.sql.SQLException;
import java.util.List;

import model.dao.ExampleDAO;
import model.dao.GameMapDAO;
import model.map.GameMap;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @version 1.0
 */
public class BoulderdashModel implements IBoulderdashModel {

	private GameMap mapLevel;
		
	// player
	// enemies
	
    /**
     * Instantiates a new model facade.
     */
    public BoulderdashModel() {
        super();
    }

    public void setGameLevel(int level) {
    	try {
			mapLevel = GameMapDAO.getGameMapByLevel(level);
		} catch (SQLException e) {
			System.out.println("Map not found!");
		}
    }
    
    public void setPlayerPosition(int x, int y) {
    	// player.position = new Vector2(x,y)
    }
    
    private void rebuildMap() {
    	
    }
    
    @Override
	public GameMap getGameMapByLevel(int level) throws SQLException {
		return GameMapDAO.getGameMapByLevel(level);
	}
}
