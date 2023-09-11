package javastreamapi.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterProduct {

	public static void main(String[] args) {

		List<Product>list=new ArrayList<Product>();
		
		list.add(new Product(1, "dell", 20000));
		list.add(new Product(2, "hp", 25000));

		list.add(new Product(3, "asus", 30000));

		list.add(new Product(4, "acer", 80000));
		list.add(new Product(5, "msi", 200000));
		list.add(new Product(6, "apple", 30000));
		list.add(new Product(7, "lenovo", 560000));
		
		
	//	list.stream().filter(n->n.price>20000).forEach(n->System.out.println(n.price));
		List<Product> collect = list.stream().filter(n->n.name.startsWith("a")).collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
