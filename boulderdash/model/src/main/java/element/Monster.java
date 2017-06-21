package element;

import java.util.Random;

public class Monster extends Mobile {
	
	private Sprite sprite = new Sprite((char) 0, null);
	
	public Monster(Position position){
		super(null, position, speed, null);
	}

	public void choseMonster() { //choisi l'un des 3 monstres
		Random r = new Random();
		int n = r.nextInt(3);
		switch (n){
			case 1:
				break;
			case 2 :
				break;
			case 3:
				break;
			default :
				return;
		}	
		
	}
   

	public void move(){
		return;
	}
}
