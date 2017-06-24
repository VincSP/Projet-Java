package dto.element;

/**
 * @author Juliette, Vincent, Clement and Marine
 */
public class Door extends MotionlessElement {

	/**
	 * @param position
	 * permit to recover the position, the sprite and the permeability of the element 'Door'
	 */
	public Door(Position position){
		super(position, new Sprite('D', "air.png"), Permeability.PENETRABLE);
	}
}
