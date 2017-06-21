package element;

import java.io.IOException;

public class Boulder extends Mobile {

	public Boulder(int x, int y, IRoad road) throws IOException {
		super(x, y, road);
	}
	
	private Sprite sprite = new Sprite('B', "boulder.png");
	
	/* Aller en bas � droite (moveRightDown) (si il y a de l�air � droite et en diagonale bas droite et un rocher/diamant en dessous)
	 * Aller en bas � gauche (moveLeftDown) (si il y a de l�air � gauche et en diagonale bas gauche et un rocher/diamant en dessous)
	 * Aller en bas (moveDown) (si il y a de l�air en dessous)
	 * Aller � droite (moveRight) (si il est pouss� par le personnage)
	 * Aller � gauche (moveLeft) (si il est pouss� par le personnage)
	 * 
	 * MOURIR, lorsqu'il y a une explosition, le centre de l'explosion tue tout ce qui est autour (une case autour en carr�) donc une pierre peut mourir
	 * */
}
