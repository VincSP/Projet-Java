package model;


import java.sql.SQLException;

import map.GameMap;

public interface IBoulderdashModel {

	public void getGameMapByLevel(int level) throws SQLException;
	
	public GameMap getCurrentMap();

	public void addMobile (IMobile Mobile);
	
	public void removeMobile (IMobile Mobile);
	
	public IMobile getMobileByPlayer(int player);
	
	public void setMobilesHavesMoved();
}
	