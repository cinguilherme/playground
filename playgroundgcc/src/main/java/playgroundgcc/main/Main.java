package playgroundgcc.main;

import playgroundgcc.interfaces.UseInterface;
import playgroundgcc.overload.MethodOver;
import playgroundgcc.overload.Over;
import playgroundgcc.streamer.LambdaPoc;
import playgroundgcc.streamer.StreamsPoc;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {

		MethodOver.tester();
		Over.doEr();
		
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
	
	
	static {System.out.println("static");}
	
}
