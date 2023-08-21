package oops;

abstract class Cars
{
	public Cars() 
	{
		System.out.println("Four-Wheeler");
	}
	public void Branch() 
	{
		System.out.println("Chennai");
	}
	public abstract void model();
}
abstract class Skodas extends Cars
{
	@Override
	public void model() 
	{
		System.out.println("superb - sport line - Lauren and clement");
		
	}
}

public class AbsDemo1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Skodas ob = new Skodas() {
			@Override
			public void model() 
			{
				super.model();
			}
		};
		ob.Branch();
		ob.model();

	}

}
