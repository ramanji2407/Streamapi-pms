package javastreamapi.StreamMethods;

import java.util.HashSet;
import java.util.Set;

public class AnyMatch {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Set<String> fruits=new HashSet<String>();
		
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("apples");
		fruits.add("grapes");
		fruits.add("guavas");
		
		//anyMatch()
		
		boolean result1=fruits.stream().anyMatch(value-> {return value.startsWith("a");});
		System.out.println(result1);
		
		
		//allMatch()
		
		boolean result2=fruits.stream().allMatch(value-> {return value.startsWith("a");});
		System.out.println(result2);
		
		//noneMatch()
		
		boolean	result3=fruits.stream().noneMatch(value-> {return value.startsWith("O");});
		System.out.println(result3);
		

	}

}
