package Queue;
import java.util.*;
class Node
{
    Node next;
    int data;
}
class QueueDemo
{
    Node front,rear;
    QueueDemo()
    {
        front=null;
        rear=null;
    }
    void enqueue(int data)
    {
        Node a = new Node();
        a.data=data;
        if(rear==null)
        {
            front=rear=a;
        }
        else
        {
            rear.next=a;
            rear=a;
        }
    }
    int dequeue()
    {
        if(front!=null)
        {
            int c =front.data;
            front=front.next;
            return c;
        }
        else
        {
            return -1;
        }
    }
    void display(int x)
    {
        for(int i=0;i<x;i++)
        {
            System.out.print("Element deleted from queue is : "+dequeue()+"\n");
        }
    }
}
public class Program1
{
    public static void main(String v[])
    {
        Scanner s = new Scanner(System.in);
        QueueDemo ob = new QueueDemo();
        int n = s.nextInt();
        for(int i=0;i<n;i++)
        {
            ob.enqueue(s.nextInt());
        }
        int b=s.nextInt();
        ob.display(b);
    }
}
