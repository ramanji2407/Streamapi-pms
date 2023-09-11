package javastreamapi.Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter1 {

	public static void main(String[] args) {
		
		
		
		
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7);
		
		/*List<Integer> collect = list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(collect);*/
		
		
		//list.stream().filter(n->n>2&&n<5).forEach(n->System.out.println(n));
		
		list.stream().filter(n->n%2==0).forEach(System.out::println);

	}

}

