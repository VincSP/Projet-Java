package dto.element;

/**
 * @author Juliette, Vincent, Clement and Marine
 *
 */
public class Mobile extends Element {

	protected static int speed;
	
	/**
	 * return parameters of the mobile
	 * @param position
	 * @param sprite
	 * @param permeability
	 */
	public Mobile(Position position, Sprite sprite, final Permeability permeability){
		super(position, sprite, permeability);
	}
			
	/**
	 * @param player
	 * @return false
	 */
	public boolean isPlayer(int player){
		return false;
	}
	
	
	/**
	 * @return false
	 */
	public boolean hit(){
		return false;
	}
	
	public void die(){
	}
	
	public void doNothing(){
	}
	
	/**
	 * get the x
	 * @return 0
	 */
	public int getX(){
		return 0;
	}
	
	/**
	 * get the y
	 * @return 0
	 */
	public int getY(){
		return 0;
	}
	
	public void decideMove(){
	}
}
