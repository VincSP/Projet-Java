package element;

import java.awt.Image;

public class Sprite {

private Image image;
private String imageName;
private char consoleImage;
public Sprite(char character, String imageName) {
		
	}

	public Image getImage(){
		return image;
	}
	
	public void loadImage(){
		return;
	}
	
	public char getConsoleImage(){
		return consoleImage;
	}
	
	@SuppressWarnings("unused")
	private void getImage(Image image){
		
	}
	
	@SuppressWarnings("unused")
	private void getConsoleImage(char consoleImage){
		
	}
	
	public String getImageName(){
		return imageName;
	}
	
	@SuppressWarnings("unused")
	private void setImageName(String imageName){
		
	}
	
	public boolean isImageLoaded(){
		return false;
	}
	
	public void setImageLoaded(){
		
	}
}
