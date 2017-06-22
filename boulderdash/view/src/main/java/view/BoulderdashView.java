package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import controller.IBoulderdashController;
import controller.IOrderPerformer;
import controller.Order;
import dto.element.Position;
import dto.map.GameMap;
import fr.exia.showboard.BoardFrame;
import model.IBoulderdashModel;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class BoulderdashView implements IBoulderdashView, KeyListener, Runnable
{	
//	private JFrame window; 
	
	private BoardFrame boardFrame;
	
	private GameMap gameMap;
	
	private IBoulderdashController boulderdashController;
	
	public GameMap getGameMap() {
		return gameMap;
	}

	public void setGameMap(GameMap gameMap) throws IOException {
		this.gameMap = gameMap;
		if (boardFrame != null) {
			this.getGameMap().addObserver(boardFrame.getObserver());
		}
		for (int x = 0; x < this.getGameMap().getxMax(); x++) {
			for (int y = 0; y < this.getGameMap().getyMax(); y++) {
				this.gameMap.getElementsByPosition(new Position(x, y)).getSprite().loadImage();
			}
		}
	}

    /** The Constant closeView. */
    private Rectangle        closeView;

    /** The Constant roadView. */
    private static final int roadView   = 22;
    
    /** The Constant squareSize. */
    private static final int squareSize = 32;
    
    public void setCloseView(Rectangle closeView) {
		this.closeView = closeView;
	}
    
    /**
     * Instantiates a new view facade.
     */
    public BoulderdashView() {
        super();
    }
    
    public void setSize(int x, int y) {
//    	window.setSize(x,y);
    }
    
    public void draw() {

        SwingUtilities.invokeLater(this);
        

//        boardFrame.addPawn(this.getMyVehicle());

//        this.getGameMap().addObserver(boardFrame.getObserver());
//        this.followMyVehicle();

    	
//    	this.run();
//    	window.revalidate();
//    	window.repaint();
    }

    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    public BoulderdashView (IOrderPerformer orderPerformer, IBoulderdashModel boulderdashModel, Observable observable){

    }
	
	public void run(){
    	boardFrame = new BoardFrame("Boulder Dash");
        boardFrame.setDimension(new Dimension(this.getGameMap().getxMax(), this.getGameMap().getyMax()));
        this.setCloseView(new Rectangle(0, 0, 40, roadView));

        boardFrame.setDisplayFrame(this.closeView);
        boardFrame.setSize(this.closeView.width * squareSize, this.closeView.height * squareSize);
        boardFrame.setHeightLooped(true);
        boardFrame.addKeyListener(this);
        boardFrame.setFocusable(true);
        boardFrame.setFocusTraversalKeysEnabled(false);

        loadMap();
        this.getGameMap().addObserver(boardFrame.getObserver());
        
        boardFrame.setVisible(true);
//        
//        window = new JFrame("Boulder Dash");
//        window.setVisible(true);
        //window.dispatchEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSING));
	}
	
	public void loadMap() {
        for (int x = 0; x < this.getGameMap().getxMax(); x++) {
            for (int y = 0; y < this.getGameMap().getyMax(); y++) {
                boardFrame.addSquare(this.getGameMap().getElementsByPosition(new Position(x, y)), x, y);
            }
        }
	}

	public void closeAll(){
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyCode() == 37) {
			boulderdashController.moveMiner(Order.LEFT);
		}
		if(arg0.getKeyCode() == 38) {
			boulderdashController.moveMiner(Order.UP);
		}
		if(arg0.getKeyCode() == 39) {
			boulderdashController.moveMiner(Order.RIGHT);
		}
		if(arg0.getKeyCode() == 40) {
			boulderdashController.moveMiner(Order.DOWN);
		}
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setOrderPerformer(IBoulderdashController boulderdashController) {
		this.boulderdashController = boulderdashController;
	}
}