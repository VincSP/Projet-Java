package dto.element;

/**
 * @author Juliette, Vincent, Clement and Marine
 */

public class Mud extends MotionlessElement {

	/**
	 * @param position
	 * permit to recover the position, the sprite and the permeability of the element 'Mud'
	 */
	public Mud(Position position){
		super(position, new Sprite('M', "mud.png"),Permeability.PENETRABLE);
	}
	
}
