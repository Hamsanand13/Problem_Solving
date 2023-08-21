package DataStructures;
import java.util.*;
import java.io.*;
class NodeQ
{
	int data;
	NodeQ next;
}
class StackDemo1
{
	NodeQ top1,top2,top3;
	int size1,size2,size3;
	int sum,sum1,sum2,sum3;
	StackDemo1()
	{
		top1=null;
		size1=0;
		sum=0;
		sum1=0;
		//sum3=0;
	}
	void push(int data)
	{
		NodeQ a = new NodeQ();
		a.data=data;
		a.next=top1;
		top1=a;
		size1++;	
	}
	void pop(int x)
	{
		while(size1>x && top1!=null)
		{
			sum1+=top1.data;
			top1=top1.next;
			size1--;
		}
	}
	void check()
	{
		if (sum1>sum)
		{
			sum=sum1;
		}
	}
	void display()
	{
		System.out.print(sum);
	}
	void emptystack()
	{
		top1=null;
		size1=0;
		sum1=0;
	}
}
public class Program
{
	public static void main(String v[]) throws IOException
	{
		Scanner s = new Scanner(System.in);
		StackDemo1 ob = new StackDemo1();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String z=br.readLine();
        String y[]=z.split(" ");
        int n[]= new int[y.length];
        for(int i=0;i<y.length;i++)
        {
        	n[i]=Integer.parseInt(y[i]);
	    }
        int a[]=new int[n[0]];
        int b[]=new int[n[1]];
        int c[]=new int[n[2]];
        for(int i=0;i<n[0];i++)
		{
        	a[i]=s.nextInt();
        	ob.push(a[i]);
		}
        ob.pop(2);
        ob.check();
        ob.emptystack();
        for(int i=0;i<n[1];i++)
		{
        	b[i]=s.nextInt();
        	ob.push(b[i]);
		}
        ob.pop(0);
        ob.check();
        ob.emptystack();
        for(int i=0;i<n[2];i++)
		{
        	c[i]=s.nextInt();
        	ob.push(c[i]);
		}
        ob.pop(00);
        ob.check();
        ob.emptystack();
        ob.display();
	}

}
