package playgroundgcc.customanno;

import java.lang.annotation.ElementType;

@Hint("Pessoa 1")
@Hint("Pessoa 2")
public class Sample {

	public String person;
	
	@Targeter
	public Sample(String per) {
		
	}
}
