package oops;

class Vehicle2
{
	public void  Drive() 
	{
		System.out.println("Drive Safely");
	}
}
class Car3 extends Vehicle2
{
	public void wheels() 
	{
		System.out.println("Four_Wheeler");
	}
}
public class Upcasting 
{

	public static void main(String[] args) 
	{
		Vehicle2 ob = new Vehicle2();
		ob.Drive();
		Car3 ob2 = (Car3) ob;
		ob2.wheels();

	}

}
