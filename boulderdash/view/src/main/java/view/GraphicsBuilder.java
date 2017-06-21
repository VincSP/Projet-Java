package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.ImageObserver;

import gameframe.IGraphicsBuilder;
import model.IMobile;


public class GraphicsBuilder implements IGraphicsBuilder, model.IBoulderdashModel {

	public GraphicsBuilder(model.IBoulderdashModel dogfightModel){
		
	}
	
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer){
		
	}
	
	private void buildEmptyGameMap(){
		
	}
	
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer){
		
	}
	
	public int getGlobalWidth(){
		return 0;
		
	}
	
	public int getGlobalHeight(){
		return 0;
		
	}

	@Override
	public int getGlobalWidht() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildArea(Dimension dimension) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMobile(IMobile Mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMobile(IMobile Mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IMobile getMobileByPlayer(int player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMobilesHavesMoved() {
		// TODO Auto-generated method stub
		
	}
}
