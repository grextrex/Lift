package Lift;

public class Lift implements LiftButtonAction{

	LiftButtonAction buttonState;
	public Lift(LiftButtonAction buttonState){
		this.buttonState = buttonState;
	}
	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		buttonState.doAction();
	}
	
	
}
