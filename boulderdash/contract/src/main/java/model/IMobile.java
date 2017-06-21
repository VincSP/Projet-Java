package model;

import java.awt.Image;
import java.awt.Point;

public interface IMobile<BoulderdashModel, Dimension, Direction> {

	public Direction getDirection();
	public void setDirection(Direction direction);
	public Point getPosition();
	public Dimension getDimension();
	public int getWidth();
	public int getHeight();
	public int getSpeed();
	public Image getImage();
	public void move();
	public boolean isPlayer(int player);
	public void die();
	public boolean hit();
	public void setBoulderdashModel(BoulderdashModel boulderdashModel);
}
