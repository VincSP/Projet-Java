package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.Timer;

import dto.element.Air;
import dto.element.Boulder;
import dto.element.Diamond;
import dto.element.Door;
import dto.element.Element;
import dto.element.Miner;
import dto.element.Monster;
import dto.element.Permeability;
import dto.element.Position;
import model.IBoulderdashModel;
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
    
    private Order moveOrder = Order.NOP;
    
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

    private int currentLevel = 1;
    
    /**
     * Load the first level then start the game loop.
     * 
     * @throws SQLException
     * @throws IOException 
     */
    public void play() throws SQLException, IOException {

		this.reloadLevel(currentLevel);
//    	reloadLevel(1);
    	// Initialize the game
    	this.getView().setOrderPerformer(this);
    	this.getView().draw();

        Timer timer=new Timer(2, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					gameLoop();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
        timer.start();
    }

    private void gameLoop() throws IOException {
    	if(checkDiamondCount() || movePlayerAction()) {
    		if(this.getModel().getCurrentMap().isFinish()) {
    			reloadLevel(++currentLevel);
    			this.getModel().getCurrentMap().initInView();
    		}
    		this.getView().loadMap();
    	}
		this.getModel().getCurrentMap().notifyObservers();
    }

	private boolean checkDiamondCount() throws IOException {
		if(!this.getModel().getCurrentMap().isDoorOpen() && this.getModel().getCurrentMap().getDiamondCount() > 2) {
			this.getModel().getCurrentMap().openDoor();
		}
		return false;
	}

	private void reloadLevel(int levelNumber) {
    	try {
			this.getModel().getGameMapByLevel(levelNumber);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	try {
			this.getView().setGameMap(this.getModel().getCurrentMap());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private boolean movePlayerAction() {
		if(!moveOrder.equals(Order.NOP)) {
			Element miner = this.getModel().getCurrentMap().getMiner();
			Position nextPosition = null;
			switch (moveOrder) {
			case UP:
				nextPosition = new Position(miner.getPosition().getX(), miner.getPosition().getY()-1);
				break;
			case DOWN:
				nextPosition = new Position(miner.getPosition().getX(), miner.getPosition().getY()+1);
				break;
			case RIGHT:
				nextPosition = new Position(miner.getPosition().getX()+1, miner.getPosition().getY());
				break;
			case LEFT:
				nextPosition = new Position(miner.getPosition().getX()-1, miner.getPosition().getY());
				break;
			default:
				break;
			}
			
			if(this.getModel().getCurrentMap().getElementsByPosition(nextPosition).getPermeability() == Permeability.PENETRABLE) {
				if(this.getModel().getCurrentMap().getElementsByPosition(nextPosition) instanceof Diamond) {
					this.getModel().getCurrentMap().pickupDiamond();
				}
				if(this.getModel().getCurrentMap().getElementsByPosition(nextPosition) instanceof Door && this.getModel().getCurrentMap().getDiamondCount() > 2) {
					this.getModel().getCurrentMap().setFinish(true);
				} else if (this.getModel().getCurrentMap().getElementsByPosition(nextPosition) instanceof Door) {
					clearStackOrder();
					return false;
				}
				move(miner.getPosition(), nextPosition);
				clearStackOrder();
				return true;
			}
		}
		return false;
	}

    private void move(Position position, Position wantedPosition) {
    
    	this.getModel().getCurrentMap().changeElement(position, new Air(position));
    	
    	Miner currentPlayer = new Miner(wantedPosition);
    	if(this.getModel().getCurrentMap().getElementsByPosition(wantedPosition) instanceof Monster){
    		this.getModel().getCurrentMap().SetIsDead(true);
    		System.exit(currentLevel);
    	}
		this.getModel().getCurrentMap().changeElement(wantedPosition, currentPlayer);
		this.getModel().getCurrentMap().setMiner(currentPlayer);
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


	@Override
	public void moveMiner(Order moveOrder) {
		this.moveOrder = moveOrder;
	}

    /**
     * Clear stack order.
     */
    private void clearStackOrder() {
        this.moveOrder = Order.NOP;
    }
}
