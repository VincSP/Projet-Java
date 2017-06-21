package element;

import java.awt.Image;

public abstract class Element {

	private Sprite sprite;
	
	private Permeability permeability;
	
	/**
	 * Instantiates a new element.
	 *
	 * @param sprite
	 *            the sprite
	 * @param permeability
	 *            the permeability
	 */
	public Element(final Sprite sprite, final Permeability permeability){
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}

	public final Sprite getSprite() {
		return this.sprite;
	}
	
	/**
	 * Sets the sprite.
	 *
	 * @param sprite
	 *            the new sprite
	 */
	protected final void setSprite(final Sprite sprite) {
		this.sprite = sprite;
	}
	
	public final Permeability getPermeability() {
		return this.permeability;
	}
	
	/**
	 * Sets the permeability.
	 *
	 * @param permeability
	 *            the new permeability
	 */
	private void setPermeability(final Permeability permeability) {
		this.permeability = permeability;
	}
	
	public final Image getImage() {
		return this.getSprite().getImage();
	}
}
