package controller;

import java.io.IOException;

import model.IBoulderdashModel;
import view.IBoulderdashView;

/**
 * <h1>The Class BoulderdashController provides a facade of the Controller component.</h1>
 *
 * @version 1.0
 */
public class BoulderdashController implements IBoulderdashController {

    /** The view. */
    private final IBoulderdashView  view;

    /** The model. */
    private final IBoulderdashModel model;
    
    private static final int Time_sleep = 30;
    
    private Direction stackOrder;

    
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
        this.clearStackOrder();
    }

   
    private void clearStackOrder() {
        this.stackOrder = Direction.NOTHING;
		
	}


	public void play() {
	        while (this.getModel().getMinor().isAlive()) {
	            Thread.sleep(Time_sleep);
	            switch (this.getStackOrder()) {
	                case RIGHT:
	                    this.getModel().getMinor().moveRight();
	                    break;
	                case LEFT:
	                    this.getModel().getMinor().moveLeft();
	                    break;
	                case UP:
	                	this.getModel().getMinor().moveUp();
	                
	                case DOWN:
	                	this.getModel().getMinor().moveDown();
	                
	                case NOTHING:
	                default:
	                    this.getModel().getMinor().doNothing();
	                    break;
	            }
	            this.clearStackOrder();
	            if (this.getModel().getMinor().isAlive()) {
	                this.getModel().getMinor().doNothing();
	            }
	        }
	        gameLoop();
    	
    }
    
    public final void orderPerform(final Direction userOrder) throws IOException {
        this.setStackOrder(userOrder);
    }
    
    private Direction getStackOrder() {
    	return this.stackOrder;
    }
    private void setStackOrder(final Direction stackOrder) {
    	this.stackOrder = stackOrder;
     }
    private void gameLoop() {
    	/*while(!notFinished)
    	{
    		//if touch gauche
    		//if touch droite
    			model.setPlayerPosition(x+1, 0);
    			
    		model.updateRocks();
    		
    		//List<Sprite> sprites = model.GetObjects()
    		view.draw();
    	}*/
    }
    
    //public void setViewSystem(IViewSystem viewSystem) {
    //	IViewSystem = viewSystem;
   //}
    

	/**
     * Gets the view.
     *
     * @return the view
     */
    public IBoulderdashView getView() {
        return this.view;
    }
    
    private void setView(final IBoulderdashView view) {
        this.view = view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IBoulderdashModel getModel() {
        return this.model;
    }
    
    private void setModel(final IBoulderdashModel model) {
        this.model = model;
    }
}
