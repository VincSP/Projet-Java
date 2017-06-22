package dto.element;

public class Air extends MotionlessElement {

	public Air(Position position){
		super(position, new Sprite('A', "air.png"), Permeability.PENETRABLE);
	}
	
}
