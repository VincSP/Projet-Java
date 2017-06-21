package element;

import java.awt.Image;
import java.awt.Point;

import model.BoulderdashModel;
import model.Dimension;
import model.IMobile;

public class Mobile extends Element implements IMobile{
 
	/**
     * The x.
     */
    private Point   position;

    /** The alive. */
    private Boolean alive = true;

//    /** The road. */
//    private IRoad   road;
//
//    /** The board. */
//    private IBoard  board;

 
    /**
     * Instantiates a new mobile.
     *
     * @param sprite
     *            the sprite
     * @param permeability
     *            the permeability
     * @param x
     * 			  the x
     * @param y
     * 			  the y
     */
    Mobile(final int x, final int y, final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
        this.position = new Point();
        this.setX(x);
        this.setY(y);
    }
        
    
	public Direction getDirection(){
		return null;
	}
	
	public void setDirection(Direction direction){
		
	}
	
	public Point getPosition(){
		return this.position;
	}
	
    public Boolean isAlive() {
        return this.alive;
    }
	
    public Boolean isCrashed() {
        return this.getRoad().getOnTheRoadXY(this.getX(), this.getY()).getPermeability() == Permeability.BLOCKING;
    }
    
	public void move(){
		
	}
	
	private void moveUp(){
		this.setY(this.getY() - 1);
	}
	
	private void moveRight(){
		this.setX(this.getX() + 1);
	}
	
	private void moveDown(){
		 this.setY(this.getY() + 1);
	}
	
	private void moveLeft(){
		this.setX(this.getX() - 1);
	}
	
	public boolean hit(){
		return false;
	}
	
    protected void die() {
        this.alive = false;
        
    }
	
	public Image getImage(){
		return null;
	}
	
	public void setBoulderdashModel(BoulderdashModel boulderdashModel){
		
	}

    private void setHasMoved() {
        this.getRoad().setMobileHasChanged();
    }
	
	public void doNothing() {
        this.setHasMoved();
    }
	
	public int getX(){
		 return this.getPosition().x;
	}
	
    public final void setX(final int x) {
        this.getPosition().x = x;
        if (this.isCrashed()) {
            this.die();
        }
    }
	
    public final int getY() {
        return this.getPosition().y;
    }
	
    public final void setY(final int y) {
        this.getPosition().y = (y + this.getRoad().getHeight()) % this.getRoad().getHeight();
        if (this.isCrashed()) {
            this.die();
        }
    }

}
