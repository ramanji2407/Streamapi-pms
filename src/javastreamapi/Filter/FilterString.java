package javastreamapi.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterString {
	
	
	public static void main(String[] args) {
		List<String>list=Arrays.asList("ram","srinu","sudha","praveen",null);
//		
//		List<String> collect = list.stream()
//				
//				.filter(n->n!=null && n.length()<=3 && n.length()>=1).collect(Collectors.toList());
//		System.out.println(collect);
		
		
		
		
		list.stream().filter(n->n!=null && n.startsWith("r")).forEach(n->System.out.println(n));

	}

}
