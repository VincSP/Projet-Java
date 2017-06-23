package dto.element;

import java.awt.Image;

import fr.exia.showboard.ISquare;

/**
 * @author Juliette, Vincent, Clement and Marine
 *
 */
public abstract class Element implements ISquare {

	private Sprite sprite;
	private Position position;
	private Permeability permeability;
	
	/**
	 * @param position
	 * @param sprite
	 * @param permeability
	 */
	public Element(Position position, Sprite sprite, final Permeability permeability) {
		this.position = position;
		this.sprite = sprite;
		this.permeability = permeability;
	}
	
	/**
	 * @return
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * @param position
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

	/**
	 * @param sprite
	 */
	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}
	
	/**
	 * @return
	 */
	public Sprite getSprite() {
		return sprite;
	}

	/**
	 * @param permeability
	 */
	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	
	/**
	 * @return
	 */
	public Permeability getPermeability() {
		return permeability;
	}
	
    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.IElement#getImage()
     */
    @Override
    public final Image getImage() {
        return this.getSprite().getImage();
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "[E]" + this.getClass() + "Position : " + this.getPosition();
    }
}
