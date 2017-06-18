package model.map.element;

import model.map.Position;

public abstract class Cell {

	private Position position;

	private String type;
	
	public Cell(Position position) {
		this.position = position;
	}
	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public abstract String getImage();
	
}
