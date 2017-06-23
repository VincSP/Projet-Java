package view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

import gameframe.IGraphicsBuilder;

/**
 * @author Juliette, Vincent, Clement and Marine
 *
 */
public class GraphicsBuilder implements IGraphicsBuilder {

	/* (non-Javadoc)
	 * @see gameframe.IGraphicsBuilder#applyModelToGraphics(java.awt.Graphics, java.awt.image.ImageObserver)
	 */
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer){
	}
	
	/**
	 * @return
	 */
	public int getGlobalWidth(){
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see gameframe.IGraphicsBuilder#getGlobalHeight()
	 */
	public int getGlobalHeight(){
		return 0;	
	}

	/* (non-Javadoc)
	 * @see gameframe.IGraphicsBuilder#getGlobalWidht()
	 */
	@Override
	public int getGlobalWidht() {
		// TODO Auto-generated method stub
		return 0;
	}
}
