package oops;

abstract class Car2
{
	public void model() 
	{
		System.out.println("Skoda Superb");
	}
	public abstract void drive();
}
public class AbsDemo2 {

	public static void main(String[] args) 
	{
		Car2 ob= new Car2() {
			
			@Override
			public void drive() {
				System.out.println("safe journey");
				
			}
		};
		ob.model();
		ob.drive();

	}

}
