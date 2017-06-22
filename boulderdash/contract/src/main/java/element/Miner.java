package dto.element;

public class Miner extends Mobile {

	private Sprite spriteDown = new Sprite('M', "downMinor.png");
	private Sprite spriteUp = new Sprite('M', "upMinor.png");
	private Sprite sprite = new Sprite('M', "simpleMinor.png");
	private Sprite spriteLeft = new Sprite('M', "leftMinor.png");
	private Sprite spriteRight = new Sprite('M', "rightMinor.png");
	private Sprite spriteDie = new Sprite('M', "dieMinor.png");
	
	public Miner(Position position){
		super(position, new Sprite('M', "downMinor.png"), Permeability.PENETRABLE);
	}
	
	public void move(){
		
	}
	
	public void die(){
		
	}
}
