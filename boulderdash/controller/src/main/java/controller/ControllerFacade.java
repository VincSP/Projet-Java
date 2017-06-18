package controller;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.Timer;

import model.IModel;
import model.map.GameMap;
import model.map.Position;
import model.map.element.Cell;
import model.map.element.Empty;
import model.map.element.Player;
import model.map.element.Rock;
import utils.PlayerMove;
import view.IView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController {

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;
    
    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IView view, final IModel model) {
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
    public void start() throws SQLException {
    	
    	JFrame fenetre = new JFrame("Boudler Dash");
        Timer timer=new Timer(500, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					drawGamePanel(fenetre);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
    	fenetre.setSize(600, 600);
    	fenetre.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				System.out.println("keyTyped" + arg0.getKeyCode());
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				System.out.println("keyReleased" + arg0.getKeyCode());
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				System.out.println("keyPressed" + arg0.getKeyCode());
				if(arg0.getKeyCode() == 27) {
					fenetre.setVisible(false);
					System.exit(0);
				}
				if(arg0.getKeyCode() == 37) {
					movePlayer(PlayerMove.LEFT);
				}
				if(arg0.getKeyCode() == 38) {
					movePlayer(PlayerMove.UP);
				}
				if(arg0.getKeyCode() == 39) {
					movePlayer(PlayerMove.RIGHT);
				}
				if(arg0.getKeyCode() == 40) {
					movePlayer(PlayerMove.DOWN);
				}
			}
		});

    	currentLevel = this.getModel().getGameMapByLevel(1);
    	drawGamePanel(fenetre);
    	fenetre.setFocusable(true);
    	fenetre.setVisible(true);
    	timer.start();
        
    }
    
    public GameMap currentLevel;
    
    private List<Component> btns = new ArrayList<>();
    
    private void drawGamePanel(JFrame fenetre) throws SQLException {
    	fenetre.setLayout(new GridLayout(currentLevel.getxMax(), currentLevel.getyMax()));

    	for (Component component : btns) {
        	fenetre.remove(component);
		}
        btns = new ArrayList<>();

		for (int j = 0; j < currentLevel.getyMax(); j++) {
			for (int i = 0; i < currentLevel.getxMax(); i++) {
				Position position = new Position(i, j);

				Cell cell = currentLevel.getCellByPosition(position);
				Component btn = null;
				if (cell.getImage().equals("W")) {
					btn = new Button("W");
					btn.setBackground(Color.BLACK);
				} else if (cell.getImage().equals("P")) {
					currentPlayer = (Player) cell;
					btn = new Button("Player");
					btn.setBackground(Color.CYAN);
				} else if (cell.getImage().equals("R")) {
					btn = new Button("Rock");
					btn.setBackground(Color.ORANGE);
				} else if (cell.getImage().equals("E")) {
					btn = new Button("");
					btn.setBackground(Color.WHITE);
				}
				btns.add(btn);
				fenetre.add(btn);
			}
		}
    	fenetre.revalidate();
		fenetre.repaint();
    }

    private Player currentPlayer;
    
    private void movePlayer(PlayerMove move) {
    	Position nextellPosition = null;
    	
    	switch (move) {
		case DOWN:
    		nextellPosition = new Position(getCurrentPlayer().getPosition().getX(), getCurrentPlayer().getPosition().getY()+1);
			break;
		case UP:
    		nextellPosition = new Position(getCurrentPlayer().getPosition().getX(), getCurrentPlayer().getPosition().getY()-1);
			break;
		case RIGHT:
    		nextellPosition = new Position(getCurrentPlayer().getPosition().getX()+1, getCurrentPlayer().getPosition().getY());
			break;
		case LEFT:
    		nextellPosition = new Position(getCurrentPlayer().getPosition().getX()-1, getCurrentPlayer().getPosition().getY());
			break;
		default:
			break;
		}
		if(nextellPosition != null && canMove(getCurrentPlayer().getPosition(), nextellPosition)) {
			move(getCurrentPlayer().getPosition(), nextellPosition);
		}
    }
    
    private void move(Position position, Position wantedPosition) {
    	currentLevel.getMap().put(position, new Empty(position));
		currentPlayer = new Player(wantedPosition);
    	currentLevel.getMap().put(wantedPosition, currentPlayer);
	}

	/**
	 * return false if the player cannot move.
	 * 
	 * @param playerPosition
	 * @param wantedPosition
	 * @return
	 */
	private boolean canMove(Position playerPosition, Position wantedPosition) {
    	if(currentLevel.getMap().get(wantedPosition).getImage().equals("W")) {
    		return false;
    	}
    	return true;
    }
    
    public Cell getCurrentPlayer() {
    	return currentPlayer;
    }
    
    /**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }
}
