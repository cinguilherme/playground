package playgroundgcc.streamer;

@FunctionalInterface
interface doer {
	void doIt(int i);
}

public class LambdaPoc {

	doer ob;
	
	public void doit() {
		
		ob = i -> System.out.println("teste");
		
		ob.doIt(5);
		
	}
	
}
