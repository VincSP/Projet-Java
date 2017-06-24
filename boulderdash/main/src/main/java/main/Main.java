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
 * @author Juliette, Vincent, Clement and Marine
 *
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws SQLException 
     * @throws IOException
     * 
     */
    public static void main(final String[] args) throws SQLException, IOException {
    	
    	Thread playWave = new Audio("music/bouldermusic.wav");

        playWave.start();
    	
    	BoulderdashView view = new BoulderdashView();
    	
    	BoulderdashModel model = new BoulderdashModel();
   		
        final BoulderdashController controller = new BoulderdashController (view, model);
       
        controller.play();
       
    }

}
