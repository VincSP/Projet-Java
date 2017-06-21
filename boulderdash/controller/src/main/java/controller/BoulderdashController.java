package controller;

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

   
    public void play() {
    	
    	// Initialize the game
    	gameLoop();
    	
    }
			
    //public void orderPerform(UserOrder userOrder){
  
    //}
    
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

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IBoulderdashModel getModel() {
        return this.model;
    }
}
