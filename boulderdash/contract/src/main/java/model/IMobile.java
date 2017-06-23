package model;

import java.awt.Image;
import java.awt.Point;

/**
 * @author Juliette, Vincent, Clement and Marine
 *
 * @param <BoulderdashModel>
 * @param <Dimension>
 * @param <Direction>
 */
public interface IMobile<BoulderdashModel, Dimension, Direction> {

	/**
	 * @return
	 */
	public Direction getDirection();
	/**
	 * @param direction
	 */
	public void setDirection(Direction direction);
	/**
	 * @return
	 */
	public Point getPosition();
	/**
	 * @return
	 */
	public Dimension getDimension();
	/**
	 * @return
	 */
	public int getWidth();
	/**
	 * @return
	 */
	public int getHeight();
	/**
	 * @return
	 */
	public int getSpeed();
	/**
	 * @return
	 */
	public Image getImage();
	/**
	 * 
	 */
	public void move();
	/**
	 * @param player
	 * @return
	 */
	public boolean isPlayer(int player);
	/**
	 * 
	 */
	public void die();
	/**
	 * @return
	 */
	public boolean hit();
	/**
	 * @param boulderdashModel
	 */
	public void setBoulderdashModel(BoulderdashModel boulderdashModel);
}
