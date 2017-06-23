package gameframe;

import java.awt.event.*;
import java.util.Observable;

/**
 * @author Juliette, Vincent, Clement and Marine
 *
 */
public class GameFrame implements IEventPerformer, KeyListener{
	
	/**
	 * @param title
	 * @param performer
	 * @param graphicBuilder
	 * @param observable
	 */
	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable){
		
	}
	
	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	public void keyPressed(KeyEvent keyEvent){
		
	}
	
	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	public void keyReleased(KeyEvent keyEvent){
		
	}
	
	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	public void keyTyped(KeyEvent keyEvent){
		
	}

	/* (non-Javadoc)
	 * @see gameframe.IEventPerformer#eventPerfomer(java.awt.event.KeyEvent)
	 */
	@Override
	public void eventPerfomer(KeyEvent keyCode) {
		// TODO Auto-generated method stub
		
	}
		
}

