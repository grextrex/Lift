package Lift;

public class LiftTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Lift(new UpButton()).doAction();
		System.out.println();
		new Lift(new DownButton()).doAction();
		
	}

}
