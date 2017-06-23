package main;

import java.io.IOException;
import java.sql.SQLException;

import controller.Audio;
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
     * @throws SQLException 
     * @throws IOException 
     */
    public static void main(final String[] args) throws SQLException, IOException {
    	
    	Thread playWave=new Audio("/bouldermusic.wav");

        playWave.start();
    	
    	BoulderdashView view = new BoulderdashView();
//    	view.setSize(800, 600);
    	
    	BoulderdashModel model = new BoulderdashModel();
   		
        final BoulderdashController controller = new BoulderdashController (view, model);
       
        controller.play();
       
    }

}
