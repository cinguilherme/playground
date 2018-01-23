package playgroundgcc.streamer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamsPoc {

	public void doIt() {
		
		List<Integer> list = Stream.of(1,2,3,4,5).collect(Collectors.toList());
		list = Stream.iterate(1, n -> n+1).limit(1000).collect(Collectors.toList());
		list = list.parallelStream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		

		list.forEach(i -> System.out.println(i));
	}
	
}
