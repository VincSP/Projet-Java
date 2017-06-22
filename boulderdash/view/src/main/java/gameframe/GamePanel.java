package gameframe;

import java.util.Observer;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Observable;
import javax.swing.JPanel;
import javax.swing.JFrame;
import gameframe.IGraphicsBuilder;

public class GamePanel implements Observer, IGraphicsBuilder{
	
	public void gamePanel(final IGraphicsBuilder graphicBuilder){
	}
	
	public void update(Observable observable){
		
	}
	
	public void paintComposant(Graphics graphic){
		
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getGlobalWidht() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getGlobalHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer) {
		// TODO Auto-generated method stub
		
	}
	
	
}
