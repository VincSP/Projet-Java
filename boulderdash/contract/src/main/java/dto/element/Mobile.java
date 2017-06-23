package dto.element;

/**
 * @author Juliette, Vincent, Clement and Marine
 *
 */
public class Mobile extends Element {

	protected static int speed;
	
	/**
	 * @param position
	 * @param sprite
	 * @param permeability
	 */
	public Mobile(Position position, Sprite sprite, final Permeability permeability){
		super(position, sprite, permeability);
	}
	
	/**
	 * @return
	 */
	public Direction getDirection(){
		return null;
	}
	
	/**
	 * @param direction
	 */
	public void setDirection(Direction direction){
	}
	
	/**
	 * @return
	 */
	public int getSpeed(){
		return 0;
	}
	
	/**
	 * 
	 */
	public void move(){
	}
	
	/**
	 * @param player
	 * @return
	 */
	public boolean isPlayer(int player){
		return false;
	}
	
	
	/**
	 * @return
	 */
	public boolean hit(){
		return false;
	}
	
	/**
	 * 
	 */
	public void die(){
	}
	
	/**
	 * 
	 */
	public void doNothing(){
	}
	
	/**
	 * @return
	 */
	public int getX(){
		return 0;
	}
	
	/**
	 * @return
	 */
	public int getY(){
		return 0;
	}
	
	/**
	 * 
	 */
	public void decideMove(){
	}
}
