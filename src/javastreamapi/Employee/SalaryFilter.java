package javastreamapi.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee
{
	private int id;
	private String name;
	private  int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}

public class SalaryFilter {
	
	static String nameOfEmployee(int n,List<Employee> list1)
	{
		Optional<Employee> findFirst2 = list1.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(n-1).findFirst();
		return findFirst2.get().getName();
	}

	public static void main(String[] args) {
		List<Employee>list1=new ArrayList<Employee>();
		
		list1.add(new Employee(1, "ram", 20000));
		list1.add(new Employee(2, "sam", 230000));
		list1.add(new Employee(3, "vinay", 220000));
		list1.add(new Employee(4, "praveeen", 120000));		// TODO Auto-generated method stub
		list1.add(new Employee(5, "siddarth", 250000));
		list1.add(new Employee(6, "suresh", 2330000));
		
		List<String> collect = list1.stream().filter(e->e.getSalary()>200000).map(e->e.getName()).collect(Collectors.toList());
		
		System.out.println(collect);
		
		Optional<Integer> max = list1.stream().map(e->e.getSalary()).max((val1,val2)->{return val1.compareTo(val2);});
		System.out.println(max.get());
		
		Optional<Integer> findFirst = list1.stream().map(e->e.getSalary()).sorted(Comparator.reverseOrder()).findFirst();
		System.out.println(findFirst.get());
		//System.out.println(list1.stream().sorted().limit(3));
		list1.stream().filter(e->e.getName().startsWith("r")).map(e->e.getName()).forEach(System.out::println);
	System.out.println(nameOfEmployee(2,list1));
	
	}


}
