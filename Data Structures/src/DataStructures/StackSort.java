package DataStructures;
import java.util.Stack;
import java.util.Scanner;
public class StackSort{
    static Stack<Integer> sort(Stack<Integer> o)
    {
        Stack<Integer> temp=new Stack<Integer>();
        while(!o.isEmpty())
        {
            int t=o.pop();
            while(!temp.isEmpty() && temp.peek()>t)
            {
                o.push(temp.pop());
            }
            temp.push(t);
        }
        return temp;
    }
    static Stack<Integer> display(Stack<Integer> d)
    {
        while(!d.isEmpty())
        {
            int x = d.peek();
            System.out.print(x+" ");
            d.pop();
        }
        return d;
    }
    public static void main(String v[])
    {
        Stack<Integer> o=new Stack<Integer>();
        Scanner sq = new Scanner(System.in);
        int n = sq.nextInt();
        for(int i=0;i<n;i++)
        {
            int data=sq.nextInt();
            o.push(data);
        }
        Stack<Integer> d=StackSort.sort(o);
        StackSort.display(d);
        
    }
}