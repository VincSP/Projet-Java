package gameframe;

import java.util.Observer;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Observable;
import gameframe.IGraphicsBuilder;

/**
 * @author Juliette, Vincent, Clement and Marine
 *
 */
public class GamePanel implements Observer, IGraphicsBuilder{
	
	/**
	 * @param graphicBuilder
	 */
	public void gamePanel(IGraphicsBuilder graphicBuilder){
		
	}
	
	/**
	 * @param observable
	 */
	public void update(Observable observable){
		
	}
	
	/**
	 * @param graphic
	 */
	public void paintComponent(Graphics graphic){
		
	}

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see gameframe.IGraphicsBuilder#getGlobalWidht()
	 */
	@Override
	public int getGlobalWidht() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see gameframe.IGraphicsBuilder#getGlobalHeight()
	 */
	@Override
	public int getGlobalHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see gameframe.IGraphicsBuilder#applyModelToGraphics(java.awt.Graphics, java.awt.image.ImageObserver)
	 */
	@Override
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer) {
		// TODO Auto-generated method stub
		
	}
}
