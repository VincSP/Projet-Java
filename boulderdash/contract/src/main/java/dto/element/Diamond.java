package dto.element;

/**
 * @author Marine Juliette, Vincent, Clement and Marine
 *
 */
public class Diamond extends Mobile{

	/**
	 * @param position
	 * permit to recover the position, the sprite and the permeability of the element 'Diamond'
	 */
	public Diamond(Position position){
		super(position, new Sprite('D', "diamond.png"), Permeability.PENETRABLE);
	}
	
	/* (non-Javadoc)
	 * @see dto.element.Mobile#move()
	 */
	public void move(){
		return;
	}
}
