package DataStructures;

import java.util.Scanner;

class Stackarr
{
	int n;
	int a[];
	int top;
	Stackarr(int b)
	{
		top=-1;
		n=b;
		a=new int[n];
		
	}
	void push(int data)
	{
		if(top>n-1)
		{
			System.out.print("overflow");
		}
		else
		{
			top++;
			a[top]=data;
		}
	}
	void pop()
	{
		if(top<0)
		{
			System.out.print("underflow");
		}
		else
		{
			System.out.print("popped element:"+a[top]+"\n");
			top--;
		}
	}
	void peek()
	{
		if(top<0)
		{
			System.out.print("underflow");
		}
		else
		{
			System.out.print(a[top]);
		}
	}
	void display()
	{
		while(top>=0)
		{
			System.out.print(a[top]+"\n");
			top--;
		}
	}
}
public class StackExample
{
	public static void main(String v[])
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		Stackarr o = new Stackarr(a);
		for(int i=0;i<a;i++)
		{
			int data=s.nextInt();
			o.push(data);	
		}
		o.pop();
		//o.peek();
	}
}
