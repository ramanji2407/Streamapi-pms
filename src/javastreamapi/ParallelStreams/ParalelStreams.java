package javastreamapi.ParallelStreams;

import java.util.Arrays;
import java.util.List;

class Employee
{
	private int id;
	private float salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public Employee(int id, float salary) {
		super();
		this.id = id;
		this.salary = salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}

public class ParalelStreams {

	public static void main(String[] args) {
		List<Employee>list=Arrays.asList(new Employee(1,2300),new Employee(2,2500),new Employee(3,3000),new Employee(4,2800));
		// TODO Auto-generated method stub
		System.out.println("normal streams");
		list.stream().filter(i->i.getSalary()>=2500).forEach(e->System.out.println(e.getSalary()));
		System.out.println("parallel streams");
	
		list.parallelStream().filter(i->i.getSalary()>=2500).forEach(e->System.out.println(e.getSalary()));
		System.out.println("converting normal streams to parallel streams");
		list.stream().parallel().filter(i->i.getSalary()>=2500).forEach(e->System.out.println(e.getSalary()));

		
	}

}
