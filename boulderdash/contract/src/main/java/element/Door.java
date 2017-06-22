package dto.element;

public class Door extends MotionlessElement {

	public Door(Position position){
		super(position, new Sprite('D', "air.png"), Permeability.PENETRABLE);
	}
	
}
