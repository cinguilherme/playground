package playgroundgcc.main;

import playgroundgcc.streamer.LambdaPoc;
import playgroundgcc.streamer.StreamsPoc;

public class Main {

	public static void main(String[] args) {
		System.out.println("hi!");
		
		//test lamba poc
		LambdaPoc lam = new LambdaPoc();
		
		//lam.doit();
		
		StreamsPoc str = new StreamsPoc();
		
		str.doIt();
		
	}
	
}
