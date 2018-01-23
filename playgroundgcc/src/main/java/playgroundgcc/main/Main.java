package playgroundgcc.main;

import playgroundgcc.interfaces.UseInterface;
import playgroundgcc.streamer.LambdaPoc;
import playgroundgcc.streamer.StreamsPoc;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {

		
		out.print(10);
		
		//test lamba poc
		LambdaPoc lam = new LambdaPoc();
		
		//lam.doit();
		StreamsPoc str = new StreamsPoc();
		
		str.doIt();
		
		UseInterface use = new UseInterface();
		
		double obj = 3.0;
		Number num = (Number)obj;
		System.out.println(num);
	}
	{System.out.println("kajaja");}
	
	static {System.out.println("static");}
	
}
