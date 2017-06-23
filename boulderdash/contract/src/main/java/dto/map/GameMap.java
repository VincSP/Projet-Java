package dto.map;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;

import dto.element.Element;
import dto.element.Monster;
import dto.element.Position;
import dto.element.Sprite;

/**
 * @author Juliette, Vincent, Clement and Marine
 *
 */
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

	/**
	 * @param x
	 * @param y
	 */
	public GameMap(int x, int y) {
		xMax = x;
		yMax = y;
		map = new HashMap<>();
	}
	
	/**
	 * @param x
	 * @param y
	 * @param elements
	 */
	public GameMap(int x, int y, Map<Position, Element> elements) {
		xMax = x;
		yMax = y;
		map = elements;
	}
	
	/**
	 * @param position
	 * @return
	 */
	public Element getElementsByPosition(Position position) {
		return map.get(position);
	}
	
	/**
	 * @param position
	 * @param element
	 */
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
	
	/**
	 * @return
	 */
	public Map<Position, Element> getMap() {
		return map;
	}
	
	/**
	 * @param map
	 */
	public void setMap(Map<Position, Element> map) {
		this.map = map;
	}

	/**
	 * @return
	 */
	public int getxMax() {
		return xMax;
	}

	/**
	 * @param xMax
	 */
	public void setxMax(int xMax) {
		this.xMax = xMax;
	}

	/**
	 * @return
	 */
	public int getyMax() {
		return yMax;
	}

	/**
	 * @param yMax
	 */
	public void setyMax(int yMax) {
		this.yMax = yMax;
	}

	/**
	 * @param miner
	 */
	public void setMiner(Element miner) {
		this.miner = miner;
	}
	
	/**
	 * @return
	 */
	public Element getMiner() {
		return miner;
	}
	
	/**
	 * @return
	 */
	public boolean isFinish() {
		return finish;
	}

	/**
	 * @param finish
	 */
	public void setFinish(boolean finish) {
		this.finish = finish;
	}

	/**
	 * 
	 */
	public void initInView() {
		this.setChanged();
	}

	/**
	 * 
	 */
	public void pickupDiamond() {
		this.diamondCount++;
	}

	/**
	 * @return
	 */
	public int getDiamondCount() {
		return diamondCount;
	}
	
	/**
	 * @param door
	 */
	public void setDoor(Element door) {
		this.door = door;
	}

	/**
	 * @throws IOException
	 */
	public void openDoor() throws IOException {
		this.doorOpened = true;
		this.door.setSprite(new Sprite('D', "door.png"));
		this.door.getSprite().loadImage();
		this.setChanged();
	}
	
	/**
	 * @return
	 */
	public boolean isDoorOpen() {
		return doorOpened;
	}

	/**
	 * @return the die
	 */
	public boolean isDie() {
		return die;
	}

	/**
	 * @param die the die to set
	 */
	public void setDie(boolean die) {
		this.die = die;
	}
	
	/**
	 * @return
	 */
	public List<Monster> getMonsters() {
		List<Monster> monsters = new ArrayList<>();
		for(Map.Entry<Position,Element> entry : this.getMap().entrySet())
		{
			if(entry.getValue() instanceof Monster) {
				monsters.add((Monster)entry.getValue());
			}
			
		}
		return monsters;
 	}

}