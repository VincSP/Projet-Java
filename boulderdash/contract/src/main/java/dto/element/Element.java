package dto.element;

import java.awt.Image;

import fr.exia.showboard.ISquare;

public abstract class Element implements ISquare {

	private Sprite sprite;
	private Position position;
	private Permeability permeability;
	
	public Element(Position position, Sprite sprite, final Permeability permeability) {
		this.position = position;
		this.sprite = sprite;
		this.permeability = permeability;
	}
	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}
	
	public Sprite getSprite() {
		return sprite;
	}

	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	
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
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "[E]" + this.getClass() + "Position : " + this.getPosition();
    }
}
