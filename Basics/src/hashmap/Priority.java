package hashmap;


import java.util.PriorityQueue;
import java.util.Scanner;

class Data
{
	int id;
	int priority;
	public Data(int id,int priority) 
	{
		this.id=id;
		this.priority=priority;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getPriority() 
	{
		return priority;
	}
	public void setPriority(int priority) 
	{
		this.priority = priority;
	}
	
}
public class Priority 
{

	
	public static void main(String[] args) 
	{
//		ArrayList<Data> list = new ArrayList<>();
		PriorityQueue<Data> q = new PriorityQueue<>();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i <n; i++) 
		{
			q.add(new Data(s.nextInt(),s.nextInt()));
		}
//		Collections.sort(list,(a,b)->Integer.compare(b.getPriority(),a.getPriority()));
		for(Data d:q)
		{
			System.out.println(d.getId()+" "+d.getPriority());
		}

	}

}




