package element;

public class Air extends MotionlessElement {

	Air() {
		super(SPRITE, Permeability.BLOCKING);
	}

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('A', "air.png");
	
}

