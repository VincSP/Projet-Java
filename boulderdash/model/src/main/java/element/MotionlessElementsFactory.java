package element;

public abstract class MotionlessElementsFactory {

		private static Mud Mud = new Mud();
		private static Wall Wall = new Wall();
		private static Door Door = new Door();

		public static MotionlessElement createWall(){
			return null;
		}
}
