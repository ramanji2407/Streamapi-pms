package javastreamapi.StreamMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=Arrays.asList(2,4,1,3,7,5,9);
		List<Integer> sortedlist=list1.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedlist); 
		
		List<Integer> reversesortedlist=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(reversesortedlist);
		
		List<String> list2=Arrays.asList("John","Mary","Kim","David","Smith");
			
		List<String> sortedlist2=list2.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist2);
		
		List<String> reversesortedlist2=list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reversesortedlist2);

	}

}
