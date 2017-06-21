
package view;

import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class BoulderdashView implements IBoulderdashView 
{	
	private JFrame window; 
	
    /**
     * Instantiates a new view facade.
     */
    public BoulderdashView() {
        super();
        
        window = new JFrame("Boulder Dash");
        window.setVisible(true);
        //window.dispatchEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSING));
    }
    
    public void setSize(int x, int y) {
    	window.setSize(x,y);
    }
    
    public void draw() {
    	window.revalidate();
    	window.repaint();
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
public BoulderdashView (IOrderPerformer orderPerformer, IBoulderdashModel boulderdashModel, Observable observable){
	}
	
	private void run(){
	   
	}
	
	public void displayMessage(String message){
		JOptionPane.showMessageDialog(null, message);
	}
	
	public void closeAll(){
		
	}
}