package gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import javax.swing.JFrame;
import java.awt.HeadlessException;


public class GameFrame implements IEventPerformer, KeyListener{
	
	
	public GameFrame(final String title,final IEventPerformer performer,final IGraphicsBuilder graphicBuilder, final Observable observable){
		
		
	}
	
	public void keyPressed(final KeyEvent keyEvent){

	}
	
	public void keyReleased(KeyEvent keyEvent){
		
	}
	
	public void keyTyped(KeyEvent keyEvent){
		
	}

	@Override
	public void eventPerfomer(KeyEvent keyCode) {
		// TODO Auto-generated method stub
		
	}

		
}

