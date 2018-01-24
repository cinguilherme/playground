package playgroundgcc.interfaces;

public class OssoInterface {

	int x = 013;
	public static void doIt() {
		OssoInterface pr = new OssoInterface();
		pr.div(22);
	}
	void div(final int i) {
		System.out.println(i/x);
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
