package dto.map;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

import dto.element.Element;
import dto.element.Position;
import dto.element.Sprite;

public class GameMap extends Observable {

	private Map<Position, Element> map;
	
	private int xMax;
	
	private int yMax;
	
	private Element miner;
	
	private Element door;

	private boolean doorOpened;
	
	private boolean finish;
	
	private int diamondCount = 0;

	private boolean die = false;

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
	
	public void changeElement(Position position, Element element) {
		try {
			element.getSprite().loadImage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.map.put(position, element);
		this.setChanged();
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

	public void setMiner(Element miner) {
		this.miner = miner;
	}
	
	public Element getMiner() {
		return miner;
	}

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}

	public void initInView() {
		this.setChanged();
	}

	public void pickupDiamond() {
		this.diamondCount++;
	}

	public int getDiamondCount() {
		return diamondCount;
	}
	
	public void setDoor(Element door) {
		this.door = door;
	}

	public void openDoor() throws IOException {
		this.doorOpened = true;
		this.door.setSprite(new Sprite('D', "door.png"));
		this.door.getSprite().loadImage();
		this.setChanged();
	}
	
	public boolean isDoorOpen() {
		return doorOpened;
	}
	
	public void SetIsDead(boolean die) {
		this.die  = die;
	}
}