package controller;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
//import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//import java.awt.image.BufferedImage;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.Timer;

import model.IBoulderdashModel;

import model.map.GameMap;
import model.map.Position;
import model.map.element.Cell;
import model.map.element.Empty;
import model.map.element.Player;
//import model.map.element.Rock;
import utils.PlayerMove;
import view.IBoulderdashView;


/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @version 1.0
 */
public class BoulderdashController implements IBoulderdashController {

    /** The view. */
    private final IBoulderdashView  view;

    /** The model. */
    private final IBoulderdashModel model;
    
    private static int Time_sleep = 30;
    
    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public BoulderdashController(final IBoulderdashView view, final IBoulderdashModel model) {
        super();
        this.view = view;
        this.model = model;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void play() throws SQLException {
    	
    }
			
    public void orderPerform(UserOrder userOrder){
  
    }
    
    private void gameLoop() {
    	
    }
    
    public void setViewSystem(IViewSystem viewSystem) {
    	IViewSystem = viewSystem;
    }
    
    public static int getTime_sleep() {
		return Time_sleep;
	}

	public static void setTime_sleep(int time_sleep) {
		Time_sleep = time_sleep;
	}

	/**
     * Gets the view.
     *
     * @return the view
     */
    public IBoulderdashView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IBoulderdashModel getModel() {
        return this.model;
    }
}
