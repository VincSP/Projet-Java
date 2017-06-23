package dto.element;

/**
 * @author Juliette, Vincent, Clement and Marine
 */

public class Wall extends MotionlessElement {

	/**
	 * @param position
	 * permit to recover the position, the sprite and the permeability of the element 'wall'
	 */
	public Wall(Position position){
		super(position, new Sprite('W', "wall.png"), Permeability.BLOCKING);
	}
	
}
