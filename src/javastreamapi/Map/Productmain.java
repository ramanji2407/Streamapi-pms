package javastreamapi.Map;

import java.util.ArrayList;
import java.util.List;


public class Productmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Product>list=new ArrayList<Product>();
		
		list.add(new Product(1, "dell", 20000));
		list.add(new Product(2, "hp", 25000));
		list.add(new Product(3, "asus", 30000));
		list.add(new Product(4, "acer", 80000));
		list.add(new Product(5, "msi", 200000));
		list.add(new Product(6, "apple", 30000));
		list.add(new Product(7, "lenovo", 560000));
		list.stream().filter(e->e.price>30000).map(e->e.price).forEach(System.out::println);
		

	}

}
