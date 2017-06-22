package dto.element;

public class Mobile extends Element {

	protected static int speed;
	
	public Mobile(Position position, Sprite sprite, final Permeability permeability){
		super(position, sprite, permeability);
	}
	
	public Direction getDirection(){
		return null;
	}
	
	public void setDirection(Direction direction){
		
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
