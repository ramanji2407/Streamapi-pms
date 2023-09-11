package javastreamapi.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {
 public static void main(String[] args) {
		
		//findAny()
		List<String> stringList1 = Arrays.asList("one","two","three","one");
		//List<String> stringList1 = Arrays.asList();

		Optional<String> element=stringList1.stream().findAny();
		System.out.println(element.get());//one  //NoSuchElementException
		
		
		//findFirst()
		List<String> stringList2 = Arrays.asList("one","two","three","one");
		//List<String> stringList2 = Arrays.asList();
		
		Optional<String> ele=stringList2.stream().findFirst();

		
		System.out.println(ele.get());   //one  //NoSuchElementException
}
}
