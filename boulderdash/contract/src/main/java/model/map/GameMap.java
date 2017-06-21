package model.map;

import java.util.HashMap;
import java.util.Map;

import javax.lang.model.element.Element;
import javax.swing.text.Position;

public class GameMap {

	private Map<Position, Element> map;
	
	private int xMax;
	
	private int yMax;

	public GameMap(int x, int y) {
		xMax = x;
		yMax = y;
		map = new HashMap<>();
	}
	
	public GameMap(int x, int y, Map<Position, Element> elements) {
		xMax = x;
		yMax = y;
		map = elements;
	}
	
	public Element getElementsByPosition(Position position) {
		return map.get(position);
	}
	
	public Map<Position, Element> getMap() {
		return map;
	}
	
	public void setMap(Map<Position, Element> map) {
		this.map = map;
	}

	public int getxMax() {
		return xMax;
	}

	public void setxMax(int xMax) {
		this.xMax = xMax;
	}

	public int getyMax() {
		return yMax;
	}

	public void setyMax(int yMax) {
		this.yMax = yMax;
	}
}