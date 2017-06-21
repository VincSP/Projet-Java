package main;

import java.sql.SQLException;

import controller.BoulderdashController;
import model.BoulderdashModel;
import view.BoulderdashView;

/**
 * <h1>The Class Main.</h1>
 *
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
    	
    	BoulderdashView view = new BoulderdashView();
    	view.setSize(800, 600);
    	
    	BoulderdashModel model = new BoulderdashModel();
   		
        final BoulderdashController controller = new BoulderdashController (view, model);
       
        controller.play();
       
    }

}
