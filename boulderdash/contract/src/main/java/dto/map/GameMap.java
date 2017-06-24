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
	 * get the elements by position
	 * @param position
	 * @return the position
	 */
	public Element getElementsByPosition(Position position) {
		return map.get(position);
	}
	
	/**
	 * change the element
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
	 * set the map
	 * @param map
	 */
	public void setMap(Map<Position, Element> map) {
		this.map = map;
	}

	/**
	 * get the x max
	 * @return the x max
	 */
	public int getxMax() {
		return xMax;
	}

	/**
	 * set the x max
	 * @param xMax
	 */
	public void setxMax(int xMax) {
		this.xMax = xMax;
	}

	/**
	 * get the y max
	 * @return the y max
	 */
	public int getyMax() {
		return yMax;
	}

	/**
	 * set the y max
	 * @param yMax
	 */
	public void setyMax(int yMax) {
		this.yMax = yMax;
	}

	/**
	 * set the miner
	 * @param miner
	 */
	public void setMiner(Element miner) {
		this.miner = miner;
	}
	
	/**
	 * get the miner
	 * @return the miner
	 */
	public Element getMiner() {
		return miner;
	}
	
	/**
	 * @return finish
	 */
	public boolean isFinish() {
		return finish;
	}

	/**
	 * set finish
	 * @param finish
	 */
	public void setFinish(boolean finish) {
		this.finish = finish;
	}


	public void initInView() {
		this.setChanged();
	}

	/**
	 * count of diamonds picked up
	 */
	public void pickupDiamond() {
		this.diamondCount++;
	}

	/**
	 * get the count of diamonds
	 * @return number of diamonds
	 */
	public int getDiamondCount() {
		return diamondCount;
	}
	
	/**
	 * set the door
	 * @param door
	 */
	public void setDoor(Element door) {
		this.door = door;
	}

	/**
	 * @throws IOException
	 * for open the door
	 * door is open
	 * set the sprite of the door
	 * get the sprite and load image
	 * indicated changement
	 */
	public void openDoor() throws IOException {
		this.doorOpened = true;
		this.door.setSprite(new Sprite('D', "door.png"));
		this.door.getSprite().loadImage();
		this.setChanged();
	}
	
	/**
	 * door open
	 * @return door opened
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
	 * set the die
	 * @param die
	 */
	public void setDie(boolean die) {
		this.die = die;
	}
	
	/**
	 * add monster in list if instanceof monster
	 * @return monsters
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