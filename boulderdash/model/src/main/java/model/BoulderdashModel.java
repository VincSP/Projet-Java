package model;


import java.sql.SQLException;
import java.util.ArrayList;

import element.Element;
import model.dao.GameMapDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @version 1.0
 */
public class BoulderdashModel implements IBoulderdashModel {

	private GameMapDAO mapLevel;
		
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
    
    public void buildArea(Dimension dimension) {

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

	public Element getElementByXY(int x, int y){
		return  ;
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildArea(java.awt.Dimension dimension) {
		// TODO Auto-generated method stub
		
	}
}


