package model.map.element;

import model.map.Position;

public class Empty extends Cell {

	public Empty(Position position) {
		super(position);
	}

	@Override
	public String getImage() {
		return "E";
	}
	
}
