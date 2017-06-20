package element;

import java.awt.Image;
import java.awt.Point;

import model.BoulderdashModel;
import model.Dimension;

public class Mobile extends Element {

	private int speed;
	
	public Mobile(Direction direction, Position position, int speed, String image){
		super();
	}
	
	public Direction getDirection(){
		return null;
	}
	
	public void setDirection(Direction direction){
		
	}
	
	public Point getPosition(){
		return null;
	}
	
	public Dimension getDimension(){
		return null;
	}
	
	public int getSpeed(){
		return 0;
	}
	
	public void move(){
		
	}
	
	public boolean isPlayer(int player){
		return false;
	}
	
	private void moveUp(){
		
	}
	
	private void moveRight(){
		
	}
	
	private void moveDown(){
		
	}
	
	private void moveLeft(){
		
	}
	
	public boolean hit(){
		return false;
	}
	
	public void die(){
		
	}
	
	public Image getImage(){
		return null;
	}
	
	public void setBoulderdashModel(BoulderdashModel boulderdashModel){
		
	}
	
	public void doNothing(){
		
	}
	
	public int getX(){
		return 0;
		
	}
	
	public int getY(){
		return 0;
		
	}
	
	public void decideMove(){
		
	}
}
