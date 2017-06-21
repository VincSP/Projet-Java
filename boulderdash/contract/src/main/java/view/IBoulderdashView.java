package view;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IBoulderdashView {

    /**
     * Display message.
     *
     * @param message
     *            the message
     */
    void displayMessage(String message);
    
    /**
     * Set internal size
     *
     * @param x
     * 		width of the view
     * @param y 
     * 		height of the view
     */
    void setSize(int x, int y);
    
    void draw();
}
