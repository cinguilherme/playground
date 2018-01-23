package playgroundgcc.streamer;

@FunctionalInterface
interface doer {
	void doIt(int i);
	
	default void doDefA() {
		System.out.println("teste A");
	}
	
	default void doDefB(int a) {
		System.out.println("teste A"+a);
	}
}

public class LambdaPoc {

	doer ob;
	
	public void doit() {
		
		ob = i -> System.out.println("teste");
		
		ob.doIt(5);
		
	}
	
}
