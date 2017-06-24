package dto.element;

/**
 * @author Juliette, Vincent, Clement and Marine
 *
 */
public class Position {

	private double x;
	private double y;
	
	/**
	 * @param x
	 * @param y
	 */
	public Position(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	/** @param position */
	public Position(Position position){
	}
	
	/**
	 * get the x
	 * @return the x
	 */
	public double getX(){
		return x;
	}
	
	/**
	 * set the x
	 * @param x
	 */
	public void setX(double x){
		this.x = x;
	}
	
	/**
	 * get the y
	 * @return the y
	 */
	public double getY(){
		return y;
	}
	
	/**
	 * set the y
	 * @param y
	 */
	public void setY(double y){
		this.y = y;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[" + x +"," + y + "]";
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return (int) ((x*1)+(y*5000));
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj.toString().equals(this.toString())) {
			return true;
		}
		return super.equals(obj);
	}
	
}
