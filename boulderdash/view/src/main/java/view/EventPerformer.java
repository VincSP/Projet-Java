package view;

import java.awt.event.KeyEvent;

import controller.IOrderPerformer;
import controller.UserOrder;
import gameframe.IEventPerformer;


/**
 * @author Juliette, Vincent, Clement and Marine
 *
 */
public class EventPerformer implements controller.IOrderPerformer, IEventPerformer{
	
	/**
	 * @param orderPerformer
	 */
	public EventPerformer(IOrderPerformer orderPerformer){
		
	}
	
	/**
	 * @param keyCode
	 */
	public void eventPerform(KeyEvent keyCode){
		
	}

	/* (non-Javadoc)
	 * @see gameframe.IEventPerformer#eventPerfomer(java.awt.event.KeyEvent)
	 */
	@Override
	public void eventPerfomer(KeyEvent keyCode) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see controller.IOrderPerformer#orderPerformer(controller.UserOrder)
	 */
	@Override
	public void orderPerformer(UserOrder userOrder) {
		// TODO Auto-generated method stub
		
	}
}
