package element;

import java.awt.Image;

public abstract class Element {

	private String sprite;
	private Position position;
	
	public Element(Position position) {
		this.position = position;
	}
	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	public char getSprite(){
		return 0;
	}
	
	public char setSprite(char sprite){
		return sprite;
	}
	
	public Image getImage(){
		return null;
	}
}
