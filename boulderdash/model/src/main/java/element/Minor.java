package element;

import java.io.IOException;

public class Minor extends Mobile {

	private Sprite spriteDown = new Sprite('M', "downMinor.png");
	private Sprite spriteUp = new Sprite('M', "upMinor.png");
	private Sprite sprite = new Sprite('M', "simpleMinor.png");
	private Sprite spriteLeft = new Sprite('M', "leftMinor.png");
	private Sprite spriteRight = new Sprite('M', "rightMinor.png");
	private Sprite spriteDie = new Sprite('M', "dieMinor.png");
	
	public Minor(int x, int y, IRoad road) throws IOException {
		super(x, y, road);
	}
	
	public void die(){
		
	}
	
	/* Aller à droite (moveRight)
	 * Aller à gauche (moveLeft)
	 * Aller en haut (moveUp)
	 * Aller en bas (moveDown)
	 * Mourir (die) (si il est écrasé par un rocher, écrasé par un diamant, touché par un monstre)
	 * MOURIR, lorsqu'il y a une explosition, le centre de l'explosion tue tout ce qui est autour (une case autour en carré) 

	 * */
}
