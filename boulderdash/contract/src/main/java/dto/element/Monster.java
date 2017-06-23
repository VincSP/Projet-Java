package dto.element;

import java.util.Random;

import controller.Order;

public class Monster extends Mobile {
	
	private Order currentMove = Order.LEFT;
	
	private Sprite sprite = new Sprite('M', "monsterPenguinSimple.png");
	
	public Monster(Position position){
		super(position, new Sprite('M', "monsterPenguinSimple.png"), Permeability.PENETRABLE);
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
	
	public void setCurrentMove(Order currentMove) {
		this.currentMove = currentMove;
	}
	
	public Order getCurrentMove() {
		return currentMove;
	}
}
