package element;

import java.io.IOException;
import java.util.Random;

public class Monster extends Mobile {
	
	private Sprite spritePenguin= new Sprite('P', "monsterPenguinSimple.png");
	private Sprite spriteOctopus = new Sprite('O', "monsterOctopusSimple.png");
	private Sprite spritePepe = new Sprite('E', "monsterPepe2.png");
	
	public Monster(int x, int y, IRoad road) throws IOException {
		super(x, y, road);
	}
	
	
	/* Random pour choisir un monstre au hasard 
	 * 1 = Pepe : monsterPepe2.png
	 * 2 = Octopus : monsterOctopusSimple.png
	 * 3 = Penguin : monsterPenguinSimple.png
	 * 4 = Fish : monsterFishSimple.png
	 * 
	 * Ou
	 * 
	 * 0 = Pepe : monsterPepe2.png
	 * 1 = Octopus :  monsterOctopusSimple.png
	 * 2 = Penguin : monsterPenguinSimple.png
	 * 3 = Fish : monsterFishSimple.png
	 * 
	 * 
	 * Puis va chercher les comportements dans Behaviour (fast, slow, pourquoi pas en trouver d'autres ?...)
	 */
}
