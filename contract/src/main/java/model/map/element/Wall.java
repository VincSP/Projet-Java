package model.map.element;

import model.map.Position;

public class Wall extends Cell {

	public Wall(Position position) {
		super(position);
	}

	@Override
	public String getImage() {
		return "W";
	}
	
}
