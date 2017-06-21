package model;


import java.awt.Dimension;

public interface IBoulderdashModel {


	public void getArea();
	
	public void buildArea(Dimension dimension);
    
	public void addMobile (IMobile Mobile);
	
	public void removeMobile (IMobile Mobile);
	
	public void getMobiles(ArrayList<IMobile>);
	
	public int getMobileByPlayer(int player);
	
	public void setMobilesHavesMoved();
	

