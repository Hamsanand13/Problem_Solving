package DataStructures;
import java.util.*;
class stackstrrev
{
    int n;
    String a[];
    int top;
    stackstrrev(int b)
    {
        n=b;
        a=new String[n];
        top=-1;
    }
    void push(String data)
    {
        if(top>n-1)
        {
            System.out.print("Overflow");
        }
        else
        {
            top++;
            a[top]=data;
        }
    }
    void pop()
    {
        while(top>=0)
        {
            System.out.print(a[top]+"");
            top--;
        }
    }
}
public class Reverse
{
    public static void main(String y[])
    {

        Scanner sx = new Scanner(System.in);
        String a = sx.nextLine();
        String b[] = a.split("");
        stackstrrev o = new stackstrrev(b.length);
        for(int i=0;i<b.length;i++)
        {
            o.push(b[i]);
        }
        o.pop();
    }
}