package javastreamapi.Map;

import java.util.Arrays;
import java.util.List;

public class Map1 {

	
	public static void main(String[] args) {

		List<Integer>list1=Arrays.asList(1,2,3,4,5,6);
		//list1.stream().map(e->e*2).forEach(System.out::println);
		
		
		list1.stream().filter(e->e%2==0).map(e->e*2).forEach(System.out::println);
		
		
	}
	
	
	
}
