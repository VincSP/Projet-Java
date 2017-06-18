package model.map;

public class Position {

	private int x;
	
	private int y;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "[" + x +"," + y + "]";
	}
	
	@Override
	public int hashCode() {
		return (x*1)+(y*5000);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj.toString().equals(this.toString())) {
			return true;
		}
		return super.equals(obj);
	}
}
