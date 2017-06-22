package element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {

private Image image;
private String imageName;
private char consoleImage;
private boolean imageLoaded;

	public Sprite(char character, String imageName) {
		this.setConsoleImage(character);
		this.setImageName(imageName);
	}

	public Image getImage(){
		return this.image;
	}
	
	public void loadImage() throws IOException{
		this.getImage(ImageIO.read(new File("image/" + this.getImageName())));
	}
	
	public final char getConsoleImage(){
		return this.consoleImage;
	}
	
	
	private final Image getImage(Image image){
		return this.image;
	}
	
	
	
	private void setConsoleImage(char consoleImage){
		this.consoleImage = consoleImage;
	}
	
	public String getImageName(){
		return imageName;
	}
	
	
	private void setImageName(String imageName){
		this.imageName = imageName;
	}
	
	public final boolean isImageLoaded(){
		return this.imageLoaded;
	}
	
	public void setImageLoaded(final boolean isImageLoaded){
		this.imageLoaded = isImageLoaded;
	}
}
