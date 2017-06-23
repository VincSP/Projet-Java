package dto.element;

/**
 * @author Juliette, Vincent, Clement and Marine
 *
 */
public class Miner extends Mobile {

	/**
	 * @param position
	 */
	public Miner(Position position){
		super(position, new Sprite('M', "downMinor.png"), Permeability.PENETRABLE);
	}
	
	/* (non-Javadoc)
	 * @see dto.element.Mobile#move()
	 */
	public void move(){
		
	}
	
	/* (non-Javadoc)
	 * @see dto.element.Mobile#die()
	 */
	public void die(){
		super.die();
	}
}
