package model;


import java.sql.SQLException;
import java.util.ArrayList;

import dto.element.Element;
import dto.element.Position;
import dto.map.GameMap;
import model.dao.GameMapDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @version 1.0
 */
public class BoulderdashModel implements IBoulderdashModel {

	private GameMap currentMap;
		
	// player
	// enemies
	
    /**
     * Instantiates a new model facade.
     */
    public BoulderdashModel() {
        super();
    }
    
    public void setPlayerPosition(int x, int y) {
    	// player.position = new Vector2(x,y)
    }
    
    private void rebuildMap() {
    	
    }
    
	public void addMobile() {
		return;
	}

	public void removeMobile(IMobile Mobile) {
	
	}

	public ArrayList<IMobile> getMobiles(){
		return null;
	
	}

	public IMobile getMobileByPlayer(int player){
		return null;
	
	}

	public void setMobilesHavesMoved(){
		return;
	}

	public void operation(){
		return;
	}

	public void addMobile(IMobile Mobile){
		return;
	}

	public GameMap getCurrentMap() {
		return currentMap;
	}

	public Element getElementByXY(int x, int y){
		return currentMap.getElementsByPosition(new Position(x, y));
	}

	@Override
	public void getGameMapByLevel(int level) throws SQLException {
		currentMap = GameMapDAO.getGameMapByLevel(level);
	}
	

}


