package model;


import java.sql.SQLException;

import dto.map.GameMap;

/**
 * @author Juliette, Vincent, Clement and Marine
 *
 */
public interface IBoulderdashModel {

	/**
	 * get the game map by level
	 * @param level
	 * @throws SQLException
	 */
	public void getGameMapByLevel(int level) throws SQLException;
	
	/** get the current map	 */
	public GameMap getCurrentMap();

	/**
	 * add the mobile
	 * @param Mobile
	 */
	public void addMobile (IMobile<?, ?, ?> Mobile);
	
	/**
	 * remove the mobile
	 * @param Mobile
	 */
	public void removeMobile (IMobile<?, ?, ?> Mobile);
	
	/**
	 * @param player
	 * @return
	 */
	public IMobile<?, ?, ?> getMobileByPlayer(int player);
	
	/**
	 * set mobiles havec moved
	 */
	public void setMobilesHavesMoved();
}
	

