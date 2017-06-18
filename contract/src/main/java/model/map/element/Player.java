package model.map.element;

import model.map.Position;

public class Player extends Cell {

	public Player(Position position) {
		super(position);
	}

	@Override
	public String getImage() {
		return "P";
	}
	
}
