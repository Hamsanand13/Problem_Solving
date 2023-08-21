package SubArray;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;


class Interval
{
	int start,end;
	public Interval(int start,int end) 
	{
		this.start=start;
		this.end=end;	
	}
}
public class MergeIntervals 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		Interval arr[]=new Interval[row];
		for(int i =0;i<row;i++)
		{
			arr[i]= new Interval(s.nextInt(),s.nextInt());
		}
//        arr[0]=new Interval(1,3);
//        arr[1]=new Interval(2,6);
//        arr[2]=new Interval(8,10);
//        arr[3]=new Interval(15,18);
        merge(arr);
	}
	public static void merge(Interval a[])
	{
		if(a.length<=0)
		{
			return;
		}
		Stack<Interval> stack = new Stack<>();
		Arrays.sort(a, new Comparator<Interval>() 
		{
			public int compare(Interval i1,Interval i2)
			{
				return i1.start-i2.start;
			}
		});
		stack.push(a[0]);
		for(int i=1;i<a.length;i++)
		{
//			arr[0]=new Interval(1,3); =>top 
//	        arr[1]=new Interval(2,6);
//	        arr[2]=new Interval(8,10);
//	        arr[3]=new Interval(15,18);
			
			Interval top = stack.peek();
			if(top.end<a[i].start)
			{
				//1
				//3<2 => no
				
				//2
				//6<8 =>yes
		
				stack.push(a[i]);
			}
			else if(top.end<a[i].end)
			{
				//3<6 =>yes
				//top=[1,6]
				//stack = [1,6]
				top.end=a[i].end;
				stack.pop();
				stack.push(top);
			}
		}
		Stack<Interval> reverse = new Stack<>();
		{
			while(!stack.isEmpty())
			{
				Interval top = stack.peek();
				reverse.push(stack.pop());
			}
		}
		System.out.println("The Merged Intervals are: ");
        while (!reverse.isEmpty())
        {
            Interval t = reverse.pop();
            System.out.println(+t.start+" "+t.end+" ");
        } 	
	}
}
