package oops;

abstract class Car
{
	public abstract void drive();
	public void park()
	{
		System.out.println("The car is parked");
	}
}
class Skoda extends Car 
{
	public void drive()
	{
		System.out.println("drives");
	}
}

public class Abstraction 
{

	public static void main(String[] args) 
	{
		Car ob = new Skoda();
		ob.park();
		Skoda ob2 = new Skoda();
		ob2.park();
		ob.drive();
	}

}
