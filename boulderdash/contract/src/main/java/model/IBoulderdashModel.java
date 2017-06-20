package model;

import java.awt.Dimension;
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

	public void getArea();
	
	public void buildArea(Dimension dimension);
    
	public void addMobile (IMobile Mobile);
	
	public void removeMobile (IMobile Mobile);
	
	public void getMobiles(ArrayList<IMobile>);
	
	public int getMobileByPlayer(int player);
	
	public void setMobilesHavesMoved();
	
	public GameMap getGameMapByLevel(int level) throws SQLException;
}
