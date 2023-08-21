package oops;

class A
{
	public void method()
	{
		System.out.println("Base Class");
	}
}
class Demo5 extends A
{
	@Override
	public void method() 
	{
		System.out.println("Null");
//		super.method();
	}
}
//runtime polymorphism
//overriding
class B extends A
{
	@Override
	public void method()
	{
		System.out.println("Child class");
	}
}
//compile time polymorphism
// overloading
class C
{
	public int add(int a ,int b)
	{
		return a+b;
	}
	public float add(float a,float b) 
	{
		return a+b;
	}
	
}
public class Polymorphism 
{
	public static void main(String[] args) 
	{
		A ob1 = new Demo5();
		ob1.method();
		B ob2 = new B();
		ob2.method();
		A ob3 = ob2;
		ob1.method();
		System.out.println(new C().add((float)2.4, (float)4.4));
		System.out.println(new C().add(2, 4));
//		A ob4= new Demo4();
		Demo5 ob5 = (Demo5)ob1;
		ob5.method();
	}
}
