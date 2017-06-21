package gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import javax.swing.JFrame;
import java.awt.HeadlessException;


public class GameFrame implements IEventPerformer, KeyListener{
	
	private static final long 		serialVersionUID	= -1112124206501543946L;
	private final IEventPeformer	eventPerformer;
	
	public GameFrame(final String title,final IEventPerformer performer,final IGraphicsBuilder graphicBuilder, final Observable observable)
		throws HeadlessException{
		
			this.eventPerfomer = eventPerformer;
			
			this.setTitle(title);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.addKeyListener(this);
			this.setVisible(true);
			
			final GamePanel gamePanel = new GamePanel(graphicsBuilder);
			this.setContentPane(gamePanel);
			this.setSize(graphicsBuilder.getGlobalWidth() + this.getInsets().left + this.getInsets().right,
					graphicsBuilder.getGlobalHeight() + this.getInsets().top + this.getInsets().bottom);
			this.setLocationRelativeTo(null);
			observable.addObserver(gamePanel);
			
			this.setVisible(true);
		
		
	}
	
	public void keyPressed(final KeyEvent keyEvent){
		this.eventPerformer.eventPerform(keyEvent);
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

