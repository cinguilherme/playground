package playgroundgcc.interfaces;

@FunctionalInterface
public interface ShowOff {

	void doer();
	
	static int toint() {
		return 0;
	}
	
	static double toDouble(int i) {
		return 0.1D * i;
	}
	
	default int preDoer(int i) {
		return i*i;
	}
}
