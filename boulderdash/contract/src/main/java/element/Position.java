package dto.element;

public class Position {

	private double x;
	private double y;
	
	public Position(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public Position(Position position){
		
	}
	
	public double getX(){
		return x;
	}
	
	public void setX(double x){
		this.x = x;
	}
	
	public double getY(){
		return y;
	}
	
	public void setY(double y){
		this.y = y;
	}

	@Override
	public String toString() {
		return "[" + x +"," + y + "]";
	}
	
	@Override
	public int hashCode() {
		return (int) ((x*1)+(y*5000));
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj.toString().equals(this.toString())) {
			return true;
		}
		return super.equals(obj);
	}
	
}
