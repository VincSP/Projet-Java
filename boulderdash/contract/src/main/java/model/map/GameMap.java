package model.map;

import java.util.HashMap;
import java.util.Map;

import model.map.element.Cell;

public class GameMap {

	private Map<Position, Cell> map;
	
//	private Cell[][] map2;
	
	private int xMax;
	
	private int yMax;

	public GameMap(int x, int y) {
		xMax = x;
		yMax = y;
//		map2 = new Cell[x][y];
		map = new HashMap<>();
	}
	
	public GameMap(int x, int y, Map<Position, Cell> cells) {
		xMax = x;
		yMax = y;
		map = cells;
	}
	
	public Cell getCellByPosition(Position position) {
		return map.get(position);
	}
	
	public Map<Position, Cell> getMap() {
		return map;
	}
	
	public void setMap(Map<Position, Cell> map) {
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
