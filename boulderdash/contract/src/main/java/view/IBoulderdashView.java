package view;

import java.io.IOException;

import controller.IBoulderdashController;
import dto.map.GameMap;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author Juliette, Vincent, Clement and Marine
 */

public interface IBoulderdashView {

    /**
     * Display message.
     *
     * @param message
     *            the message
     */
    void displayMessage(String message);
    
    /**
     * Set internal size
     *
     * @param x
     * 		width of the view
     * @param y 
     * 		height of the view
     */
    /**
     * @param x
     * @param y
     */
    void setSize(int x, int y);
    
    /**
     * 
     */
    void draw();
    
    /**
     * @param gameMap
     * @throws IOException
     */
    public void setGameMap(GameMap gameMap) throws IOException;

	/**
	 * @param boulderdashController
	 */
	void setOrderPerformer(IBoulderdashController boulderdashController);
	
	/**
	 * @param i
	 */
	void setDiamondCount(int i);
	
	/**
	 * @param t
	 */
	void setTimeLeft(int t);
	
	/**
	 * 
	 */
	public void loadMap();
}
