package gameframe;

public interface IGraphicsBuilder {

	public void applyModelToGraphics(Graphics graphics, ImageObserver observer);
	public int getGlobalWidht();
	public int getGlobalHeight();
}
