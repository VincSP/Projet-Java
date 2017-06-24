package dto.element;

import controller.Order;

/**
 * @author Juliette, Vincent, Clement and Marine
 *
 */
public class Monster extends Mobile {
	
	private Order currentMove = Order.LEFT;
	
	/**
	 * return parameter of position
	 * @param position
	 */
	public Monster(Position position){
		super(position, new Sprite('M', "monsterPenguinSimple.png"), Permeability.PENETRABLE);
	}

	/* (non-Javadoc)
	 * @see dto.element.Mobile#move()
	 */
	public void move(){
		return;
	}
	
	/** set the current move
	 * @param currentMove
	 */
	public void setCurrentMove(Order currentMove) {
		this.currentMove = currentMove;
	}
	
	/**	get the current move
	 * @return the current move
	 */
	public Order getCurrentMove() {
		return currentMove;
	}
}
