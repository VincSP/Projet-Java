package dto.element;

/**
 * @author Juliette, Vincent, Clement and Marine
 */

public class Air extends MotionlessElement {

	/**
	 * @param position
	 * permit to recover the position, the sprite and the permeability of the element 'Air'
	 */
	public Air(Position position){
		super(position, new Sprite('A', "air.png"), Permeability.PENETRABLE);
	}
	
}
