package element;

import javax.lang.model.element.Element;
import javax.swing.text.Position;

public class Boulder extends Mobile implements Element {

	public Boulder(Position position){
		super(null, null, speed, null);
	}

	private Sprite sprite = new Sprite('B', "boulder.png");
	
	public void move(){
		return;
	}
	
}
