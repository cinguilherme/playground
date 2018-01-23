package playgroundgcc.interfaces;

public class UseInterface {

	ShowOff show;
	
	public UseInterface() {
		
		show = () -> {
			System.out.println(ShowOff.toDouble(show.preDoer(1)));
		};
		
		show.doer();
		
		
		
	}
	
}
