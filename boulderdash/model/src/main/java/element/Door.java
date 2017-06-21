package element;

public class Door extends MotionlessElement {

	Door() {
		super(SPRITE, Permeability.BLOCKING);
	}

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('D', "door.png");
}
