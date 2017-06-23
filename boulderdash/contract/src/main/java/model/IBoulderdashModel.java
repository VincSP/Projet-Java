package model;


import java.sql.SQLException;

import dto.map.GameMap;

/**
 * @author Juliette, Vincent, Clement and Marine
 *
 */
public interface IBoulderdashModel {

	/**
	 * @param level
	 * @throws SQLException
	 */
	public void getGameMapByLevel(int level) throws SQLException;
	
	/**
	 * @return
	 */
	public GameMap getCurrentMap();

	/**
	 * @param Mobile
	 */
	public void addMobile (IMobile<?, ?, ?> Mobile);
	
	/**
	 * @param Mobile
	 */
	public void removeMobile (IMobile<?, ?, ?> Mobile);
	
	/**
	 * @param player
	 * @return
	 */
	public IMobile<?, ?, ?> getMobileByPlayer(int player);
	
	/**
	 * 
	 */
	public void setMobilesHavesMoved();
}
	

