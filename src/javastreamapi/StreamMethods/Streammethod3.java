package javastreamapi.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streammethod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = Arrays.asList("A","B","C","1","2","3");
		Optional<String> reduce = stringList.stream().reduce((value,combinedvalue)->{
			return value+ combinedvalue;
		});
System.out.println(reduce.get());

	}

}
