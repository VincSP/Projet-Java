package dto.element;

/**
 * @author Juliette, Vincent, Clement and Marine
 *
 */
public abstract class MotionlessElement extends Element {

	/**
	 * return parameters
	 * @param position
	 * @param sprite
	 * @param permeability
	 */
	public MotionlessElement(Position position, Sprite sprite, final Permeability permeability){
		super(position, sprite, permeability);
	}
}
