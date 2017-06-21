package element;

public class Mud extends MotionlessElement {

	Mud() {
		super(SPRITE, Permeability.BLOCKING);
	}

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('U', "mud.png");
	
}
