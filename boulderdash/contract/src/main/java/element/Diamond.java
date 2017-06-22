package dto.element;

public class Diamond extends Mobile{

	public Diamond(Position position){
		super(position, new Sprite('D', "diamond.png"), Permeability.PENETRABLE);
	}
	
	public void move(){
		return;
	}
}
