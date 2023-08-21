package DataStructures;
import java.util.*;
class NodeB
{
    String data;
    NodeB next;
}
class stackpali
{
    NodeB top;
    int size;
    int Stacksize;
    stackpali(int b)
    {
        top=null;
        size=0;
        Stacksize=b;
    }
    void push(String data)
    {
        if(size>Stacksize-1)
        {
            //throw new NoSuchElementException("Underflow Exception");
        }
        else
        {
            NodeB a = new NodeB();
            a.data=data;
            a.next=top;
            top=a;
            size++;
        }
    }
    int pop(String data)
    {
        while(size>0)
        {   
            if((top.data).equals(data))
            {
                top=top.next;
                size--;
            }
            else
            {
                return -1;
            }
        }   
        return 1;
    }
}
public class StackPalindrome
{
    public static void main(String v[])
    {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        stackpali o = new stackpali(a.length());
        int n =a.length();
        int c=0;
        String b[]=a.split("");
        if(n%2==1)
        {
            int d =(int)n/2;
            for (int i=0;i<d;i++)
            {
                o.push(b[i]);
            }
            for(int j=d+1;j<b.length;j++)
            {
                c= o.pop(b[j]);
            }
        }
        else
        {
            for(int i=0;i<n/2;i++)
            {
                o.push(b[i]);
            }
            for(int j=n/2;j<b.length;j++)
            {
               c= o.pop(b[j]);
            }
        }
        if(c==1)
        {
            System.out.print(a+" is palindrome");
        }
        else
        {
            System.out.print(a+" is not a palindrome");
        }
    }
}