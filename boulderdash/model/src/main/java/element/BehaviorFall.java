package element;

public class BehaviorFall implements IBehaviorMove {

		public void decideMove() {
			this.mobile.getBoulderDashModel.getElementByXY(this.mobile.getX(), this.mobile.getY() + 1);
		}
	/* Comportement de la pierre quand elle tombe */
}
