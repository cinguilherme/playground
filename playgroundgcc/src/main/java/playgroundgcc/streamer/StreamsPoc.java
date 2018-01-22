package playgroundgcc.streamer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamsPoc {

	public void doIt() {
		
		List<Integer> list = Stream.of(1,2,3,4,5).collect(Collectors.toList());
		

		list.forEach(i -> System.out.println(i));
	}
	
}
