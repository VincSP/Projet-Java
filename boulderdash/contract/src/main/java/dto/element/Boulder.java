package dto.element;

/**
 * @author Juliette, Vincent, Clement and Marine
 */

public class Boulder extends Mobile {

	/**
	 * @param position
	 * permit to recover the position, the sprite and the permeability of the element 'Boulder'
	 */

	public Boulder(Position position){
		super(position, new Sprite('B', "boulder.png"), Permeability.BLOCKING);
	}

	/* (non-Javadoc)
	 * @see dto.element.Mobile#move()
	 */
	public void move(){
		return;
	}
	
}
