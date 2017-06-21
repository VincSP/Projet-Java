package element;

public class Wall extends MotionlessElement {

	Wall() {
		super(SPRITE, Permeability.BLOCKING);
	}

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('W', "wall.png");
	
	/* PERMEABILITY = BLOCKING
	 * 
	 */
}
