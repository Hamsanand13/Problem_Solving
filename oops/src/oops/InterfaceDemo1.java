package oops;

interface Vehicle
{
	abstract void four_wheeler();
	abstract void two_wheeler();

}
interface Fasttag extends Vehicle
{
	abstract void register();
}
class DoRegister implements Fasttag
{
	@Override
	public void register() 
	{
		System.out.println("Registeration Successful");
		
	}

	@Override
	public void four_wheeler() 
	{
		System.out.println("Rs.100 to register");
		
	}

	@Override
	public void two_wheeler() 
	{
		System.out.println("Rs.50 t0 register");
		
	}
}
abstract class Honda implements Vehicle
{
	@Override
	public void four_wheeler() {
		System.out.println("Honda City ZX");
		
	}
}
abstract class Bajaj implements Vehicle
{
	@Override
	public void two_wheeler() 
	{
		System.out.println("Dominor 400");
		
	}
}
public class InterfaceDemo1 {

	public static void main(String[] args) 
	{
	
		Vehicle ob = new Vehicle() {
			
			@Override
			public void two_wheeler() {
				System.out.println("MT-15");
				
			}
			
			@Override
			public void four_wheeler() {
				System.out.println("Skoda Superb");
				
			}
		};
		ob.four_wheeler();
		ob.two_wheeler();
		
		Honda ob1 = new Honda() {
			

			@Override
			public void two_wheeler() 
			{
				super.four_wheeler();
				System.out.println("NULL");
				
			}
		};
		Bajaj ob2 = new Bajaj() {
			
			@Override
			public void four_wheeler() {
				super.two_wheeler();
				System.out.println("NULL");
				
			}
		};
		ob1.four_wheeler();
		ob2.two_wheeler();
		DoRegister ob3= new DoRegister();
		ob3.four_wheeler();
		ob3.two_wheeler();
		ob3.register();
	}

}
