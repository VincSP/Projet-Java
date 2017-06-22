package dto.element;

public class Mud extends MotionlessElement {

	public Mud(Position position){
		super(position, new Sprite('M', "mud.png"),Permeability.PENETRABLE);
	}
	
}
