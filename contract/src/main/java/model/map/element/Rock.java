package model.map.element;

import model.map.Position;

public class Rock extends Cell {

	public Rock(Position position) {
		super(position);
	}

	@Override
	public String getImage() {
		return "R";
	}
	
}
