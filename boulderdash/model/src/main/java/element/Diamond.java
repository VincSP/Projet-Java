package element;

import java.io.IOException;

public class Diamond extends Mobile{

	public Diamond(int x, int y, IRoad road) throws IOException {
		super(x, y, road);
	}
	
	private Sprite sprite = new Sprite('D', "diamond.png");
	
	/* Aller en bas à droite (moveRightDown) (si il y a de l’air à droite et en diagonale bas droite et un rocher/diamant en dessous)
	 * Aller en bas à gauche (moveLeftDown) (si il y a de l’air  à gauche et en diagonale bas gauche et un rocher/diamant en dessous)
	 * Aller en bas (moveDown) (si il y a de l’air en dessous)
	 * 
	 * MOURIR SI IL EST COLLECTE PAR LE MINOR, en effet, le diamant meurt quand le minor passe dessus
	 * lorsqu'il y a une explosition, le centre de l'explosion tue tout ce qui est autour (une case autour en carré) 

	 * */

}
