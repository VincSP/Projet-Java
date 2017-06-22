package dto.element;

public class Wall extends MotionlessElement {

	public Wall(Position position){
		super(position, new Sprite('W', "wall.png"), Permeability.BLOCKING);
	}
	
}
