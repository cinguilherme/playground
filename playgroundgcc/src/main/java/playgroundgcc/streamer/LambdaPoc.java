package playgroundgcc.streamer;

interface doer {
	void doIt();
}

public class LambdaPoc {

	doer ob;
	
	void doit() {
		
		ob = () -> System.out.println("teste");
		
		ob.doIt();
		
	}
	
}
