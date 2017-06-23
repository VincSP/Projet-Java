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
 * @author Juliette, Vincent, Clement and Marine
 *
 */
public class BoulderdashModel implements IBoulderdashModel {

	private GameMap currentMap;
    /**
     * Instantiates a new model facade.
     */
    public BoulderdashModel() {
        super();
    }
    
    /**
     * @param x
     * @param y
     */
    public void setPlayerPosition(int x, int y) {
    	// player.position = new Vector2(x,y)
    }
    
    
	/**
	 * 
	 */
	public void addMobile() {
		return;
	}

	/* (non-Javadoc)
	 * @see model.IBoulderdashModel#removeMobile(model.IMobile)
	 */
	@SuppressWarnings("rawtypes")
	public void removeMobile(IMobile Mobile) {
	
	}

	/**
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public ArrayList<IMobile> getMobiles(){
		return null;
	}

	/* (non-Javadoc)
	 * @see model.IBoulderdashModel#getMobileByPlayer(int)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public IMobile getMobileByPlayer(int player){
		return null;
	
	}

	/* (non-Javadoc)
	 * @see model.IBoulderdashModel#setMobilesHavesMoved()
	 */
	public void setMobilesHavesMoved(){
		return;
	}

	/**
	 * 
	 */
	public void operation(){
		return;
	}

	/* (non-Javadoc)
	 * @see model.IBoulderdashModel#addMobile(model.IMobile)
	 */
	@SuppressWarnings("rawtypes")
	public void addMobile(IMobile Mobile){
		return;
	}

	/* (non-Javadoc)
	 * @see model.IBoulderdashModel#getCurrentMap()
	 */
	public GameMap getCurrentMap() {
		return currentMap;
	}

	/**
	 * @param x
	 * @param y
	 * @return
	 */
	public Element getElementByXY(int x, int y){
		return currentMap.getElementsByPosition(new Position(x, y));
	}

	/* (non-Javadoc)
	 * @see model.IBoulderdashModel#getGameMapByLevel(int)
	 */
	@Override
	public void getGameMapByLevel(int level) throws SQLException {
		currentMap = GameMapDAO.getGameMapByLevel(level);
	}
}
