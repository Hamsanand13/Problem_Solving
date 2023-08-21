package treeset;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) 
	{
		TreeSet<Card> set = new TreeSet<>();
		int n = 5;
		Card ob = new Card("A", 1);
		Card ob1 = new Card("B", 2);
		Card ob2= new Card("C", 3);
		Card ob3= new Card("D", 4);
		Card ob4= new Card("E", 1);
		set.add(ob);
		set.add(ob1);
		set.add(ob2);
		set.add(ob3);
		set.add(ob4);
		Iterator it=set.iterator();
		while (it.hasNext()) 
		{
			System.out.println(it.next());
			
		}
		

	}

}
class Card implements Comparable<Card>
{
	private String symbol;
	private int number;
	
	public Card(String symbol,int number)
	{
		this.number=number;
		this.symbol=symbol;
	}
	public String getSymbol() 
	{
		return symbol;
	}
	public int getNumber() 
	{
		return number;
	}
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return symbol+" "+number;
	}
	@Override
	public int compareTo(Card o) 
	{
		if(this.getNumber()==o.getNumber())
		{
			return -1;
		}
		else
		{
			return -1;
		}
	}
	
	
}
