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

	/** 	get the direction	 */

	public Direction getDirection();
	/**
	 * set the direction
	 * @param direction
	 */
	public void setDirection(Direction direction);
	/** 	get the position	 */
	public Point getPosition();

	/**	 get the image	 */
	public Image getImage();

	public void move();

	public boolean isPlayer(int player);

	public void die();

	public boolean hit();

	public void setBoulderdashModel(BoulderdashModel boulderdashModel);
}
