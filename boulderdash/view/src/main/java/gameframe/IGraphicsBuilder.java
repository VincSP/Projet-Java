package gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

/**
 * @author Juliette, Vincent, Clement and Marine
 *
 */
public interface IGraphicsBuilder {

	/**
	 * @param graphics
	 * @param observer
	 */
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer);
	/**
	 * @return
	 */
	public int getGlobalWidht();
	/**
	 * @return
	 */
	public int getGlobalHeight();
}
