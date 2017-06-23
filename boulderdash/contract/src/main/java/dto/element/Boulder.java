package dto.element;

public class Boulder extends Mobile {

	public Boulder(Position position){
		super(position, new Sprite('B', "boulder.png"), Permeability.BLOCKING);
	}
}
