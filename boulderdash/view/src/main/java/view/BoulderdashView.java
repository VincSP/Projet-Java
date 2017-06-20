package view;

import java.lang.Runnable;

import javax.swing.JOptionPane;

import gameframe.GameFrame;


public class BoulderdashView implements Runnable{
	
	public BoulderdashView (IOrderPerformer orderPerformer, IBoulderdashModel boulderdashModel, Observable observable){
	}
	
	private void run(){
	   
	}
	
	public void displayMessage(String message){
		JOptionPane.showMessageDialog(null, message);
	}
	
	public void closeAll(){
		
	}

}
