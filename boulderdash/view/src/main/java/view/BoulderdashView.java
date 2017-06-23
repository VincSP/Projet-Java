
package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Observable;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

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
 * @author Juliette, Vincent, Clement and Marine
 */
public class BoulderdashView implements IBoulderdashView, KeyListener, Runnable
{	
	private BoardFrame boardFrame;
	
	private GameMap gameMap;
	
	private IBoulderdashController boulderdashController;
	
	/**
	 * @return
	 */
	public GameMap getGameMap() {
		return gameMap;
	}

	/* (non-Javadoc)
	 * @see view.IBoulderdashView#setGameMap(dto.map.GameMap)
	 */
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
    
    /**
     * @param closeView
     */
    public void setCloseView(Rectangle closeView) {
		this.closeView = closeView;
	}
    
    /**
     * Instantiates a new view facade.
     */
    public BoulderdashView() {
        super();
    }
    
    /* (non-Javadoc)
     * @see view.IBoulderdashView#setSize(int, int)
     */
    public void setSize(int x, int y) {
    }
    
    /* (non-Javadoc)
     * @see view.IBoulderdashView#draw()
     */
    public void draw() {
        SwingUtilities.invokeLater(this);
    }

    /* (non-Javadoc)
     * @see view.IBoulderdashView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    /**
     * @param orderPerformer
     * @param boulderdashModel
     * @param observable
     */
    public BoulderdashView (IOrderPerformer orderPerformer, IBoulderdashModel boulderdashModel, Observable observable){

    }
	
    JLabel Count;
    JLabel Time;
    
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
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
        
        
        JPanel HUDPanel = new JPanel();
        Count = new JLabel();
        Count.setText("Diamond Count = 0");
        
        HUDPanel.add(Count);
        boardFrame.add(HUDPanel);
       
        boardFrame.setVisible(true);
        
        JPanel HUDPanel2 = new JPanel();
        Time = new JLabel();
        Time.setText("Time Left = 300");
        
        HUDPanel2.add(Time);
        boardFrame.add(HUDPanel2);
       
        boardFrame.setVisible(true);
	}
	
	/* (non-Javadoc)
	 * @see view.IBoulderdashView#setDiamondCount(int)
	 */
	public void setDiamondCount(int i)
	{
		Count.setText("Diamond Count : " + i);
	}
	
	/* (non-Javadoc)
	 * @see view.IBoulderdashView#setTimeLeft(int)
	 */
	public void setTimeLeft(int t)
	{
		Time.setText("Time Left : " + t);
	}
	/* (non-Javadoc)
	 * @see view.IBoulderdashView#loadMap()
	 */
	public void loadMap() {
        for (int x = 0; x < this.getGameMap().getxMax(); x++) {
            for (int y = 0; y < this.getGameMap().getyMax(); y++) {
                boardFrame.addSquare(this.getGameMap().getElementsByPosition(new Position(x, y)), x, y);
            }
        }
	}

	/**
	 * 
	 */
	public void closeAll(){
		
	}

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
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
	
	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see view.IBoulderdashView#setOrderPerformer(controller.IBoulderdashController)
	 */
	@Override
	public void setOrderPerformer(IBoulderdashController boulderdashController) {
		this.boulderdashController = boulderdashController;
	}
}