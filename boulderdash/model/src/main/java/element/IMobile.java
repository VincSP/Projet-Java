package element;

import java.awt.Image;
import java.awt.Point;
import model.BoulderdashModel;
import model.Dimension;

public interface IMobile {

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
