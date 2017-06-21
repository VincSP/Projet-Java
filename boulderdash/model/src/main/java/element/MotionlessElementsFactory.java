package element;

public abstract class MotionlessElementsFactory {

    /** The Constant Mud. */
	private static Mud Mud = new Mud();
	
    /** The Constant Wall. */
	private static Wall Wall = new Wall();
	
    /** The Constant Door. */
	private static Door Door = new Door();
	
    /** The Constant Air. */
	private static Air Air = new Air();

		
	/**
	 * The motionless elements is an array of all possible MotionlessElement.
	 */
	private static MotionlessElement[]       motionlessElements  = {
		        Mud,
		        Wall,
		        Door,
		        Air, };
		
	/**
     * Creates a new MotionlessElements object.
     *
     * @return the motionless element
     */
	public static MotionlessElement createWall(){
		return Wall;
	}
	
	/**
     * Creates a new MotionlessElements object.
     *
     * @return the motionless element
     */
	public static MotionlessElement createMud(){
		return Mud;
	}
		
	/**
     * Creates a new MotionlessElements object.
     *
     * @return the motionless element
     */
	public static MotionlessElement createDoor(){
		return Door;
	}
		
	/**
     * Creates a new MotionlessElements object.
     *
     * @return the motionless element
     */
	public static MotionlessElement createAir(){
		return Air;
	}
}
