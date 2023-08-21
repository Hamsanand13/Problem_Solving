package programs;

import java.util.Comparator;
import java.util.TreeSet;

class Employee
{
	String name;
	int salary;
	public Employee(String name, int salary) 
	{
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public Employee() 
	{
		// TODO Auto-generated constructor stub
	}
}
class nameComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1,Employee e2 )
	{
		return e1.name.compareTo(e2.name);
	}
}
class salaryComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1,Employee e2 )
	{
		return e1.salary-e2.salary;
		
	}
}
public class TreesetEx 
{

	public static void main(String[] args) 
	{
		TreeSet<Employee> name = new TreeSet<>(new nameComparator());
		TreeSet<Employee> salary = new TreeSet<>(new salaryComparator());
		Employee o1 = new Employee("ankit",7500);
		Employee o2 = new Employee("sharma",1000);
		Employee o3 = new Employee("williams",5000);
		Employee employee = new Employee();
		name.add(o1);
		name.add(o2);
		name.add(o3);
		salary.add(o1);
		salary.add(o2);
		salary.add(o3);
		System.out.print("");
		for(Employee e:name)
		{
			System.out.println(e.getName()+"-"+e.getSalary());
		}
		for(Employee e:salary)
		{
			System.out.println(e.getName()+"-"+e.getSalary());
		}
	}
}

