package javastreamapi.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map2 {
	public static void main(String[] args) {
		List<String>list1=Arrays.asList("ram","pavan","surya");
		List<String> collect = list1.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
	}

}
