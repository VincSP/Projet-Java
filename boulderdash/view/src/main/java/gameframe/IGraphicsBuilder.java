package gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {

	public void applyModelToGraphics(Graphics graphics, ImageObserver observer);
	public int getGlobalWidht();
	public int getGlobalHeight();
}
