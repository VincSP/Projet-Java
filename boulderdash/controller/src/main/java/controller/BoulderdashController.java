package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import javax.swing.Timer;

import dto.element.Air;
import dto.element.Boulder;
import dto.element.Diamond;
import dto.element.Door;
import dto.element.Element;
import dto.element.Miner;
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
    private float timeLeft = 300;
   
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
    	
    	timeLeft--;
    	if(checkDiamondCount() || movePlayerAction()) {
    		if(this.getModel().getCurrentMap().isFinish()) {
    			reloadLevel(++currentLevel);
    			this.getModel().getCurrentMap().initInView();
    		}
    	}
		this.getModel().getCurrentMap().notifyObservers();
		this.getView().loadMap();
		this.getView().setDiamondCount(this.getModel().getCurrentMap().getDiamondCount());
		//this.getView().setTimeLeft(this.getModel().getCurrentMap().());
		applyGravity();
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

	private void applyGravity()
	{
		Map<Position,Element> map = this.getModel().getCurrentMap().getMap();
		
		if(map == null)
			return;
		
		for(Map.Entry<Position,Element> entry : map.entrySet())
		{
			Position curPos = entry.getKey();
			Element e = entry.getValue();
			
			if(e instanceof Boulder 
			|| e instanceof Diamond)
			{
				Position nextPosBottom = new Position(curPos.getX(), curPos.getY()+1);
				//Position nextPosLeft = new Position(curPos.getX()-1, curPos.getY());
				//Position nextPosRight = new Position(curPos.getX()+1, curPos.getY());
				
				if(IsAir(nextPosBottom))
					SwapElements(curPos, nextPosBottom);
				/*else if(IsAir(nextPosLeft))
					SwapElements(curPos, nextPosLeft);
				else if(IsAir(nextPosRight))
					SwapElements(curPos, nextPosRight);*/
			}
		}
	}

	public boolean IsAir(Position pos)
	{
		Element e = this.getModel().getCurrentMap().getElementsByPosition(pos);
		if(e == null)
			return false;
		
		return e instanceof Air;
	}
	
	public void SwapElements(Position posA, Position posB)
	{
		Element elementA = this.getModel().getCurrentMap().getElementsByPosition(posA);
		this.getModel().getCurrentMap().changeElement(posA, new Air(posA));
		this.getModel().getCurrentMap().changeElement(posB, elementA);
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
    	//Boulder allBoulders = new Boulder(wantedPosition);
		this.getModel().getCurrentMap().changeElement(wantedPosition, currentPlayer);
		this.getModel().getCurrentMap().setMiner(currentPlayer);
		//this.getModel().getCurrentMap().setBoulder(allBoulders);
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
