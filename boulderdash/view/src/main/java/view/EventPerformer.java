package view;

import java.awt.event.KeyEvent;

import controller.IOrderPerformer;
import controller.UserOrder;
import gameframe.IEventPerformer;


public class EventPerformer implements controller.IOrderPerformer, IEventPerformer{
	
	public EventPerformer(IOrderPerformer orderPerformer){
		
	}
	
	public void eventPerform(KeyEvent keyCode){
		
	}
	
	private UserOrder keyCodeToUser(int keyCode){
		return null;
	}

	@Override
	public void eventPerfomer(KeyEvent keyCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orderPerformer(UserOrder userOrder) {
		// TODO Auto-generated method stub
		
	}
}
