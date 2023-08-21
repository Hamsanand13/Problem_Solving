package oops;
class Demo
{
	int x=5;
	public void display()
	{
		System.out.println("Base class");
	}
}
class Demo2 extends Demo
{
	public void  display_2() 
	{
//		super.display();
		int x =3;
		System.out.println("Child class");
		System.out.println(super.x+" "+x);
	}
}
public class inheritance 
{
	public static void main(String[] args) 
	{
		Demo ob = new Demo2();
		ob.display();
		Demo2 ob2 = (Demo2) ob;
		ob2.display_2();
		ob2.display();
	}
}
