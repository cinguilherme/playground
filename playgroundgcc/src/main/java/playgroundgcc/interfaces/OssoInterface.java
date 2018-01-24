package playgroundgcc.interfaces;

public class OssoInterface {

	public static void doIt() {
		System.out.println(new loko().getSpeed());
	}

}

interface Walk {
	default int getSpeed() {
		return 5;
	}
}

interface Run {
	default int getSpeed() {
		return 10;
	}
}

class loko implements Walk, Run {

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return Walk.super.getSpeed();
	}

}
