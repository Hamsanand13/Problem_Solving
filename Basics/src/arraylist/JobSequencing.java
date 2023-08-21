package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

class Job
{
	private char job;
	private int deadline;
	private int profit;
	public Job(char job,int deadline,int profit) 
	{
		this.job=job;
		this.deadline=deadline;
		this.profit=profit;
	}
	public char getJob() {
		return job;
	}
	public int getDeadline() {
		return deadline;
	}
	
	public int getProfit() {
		return profit;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return job+" "+deadline+" "+profit;
	}
	static void jobScheduling(ArrayList<Job>list)
	{
		int n = list.size();
		Collections.sort(list, (a,b) -> {
			return a.deadline-b.deadline;
		});
		ArrayList<Job> result = new ArrayList<Job>();
		PriorityQueue<Job> maxHeap = new PriorityQueue<Job>((a,b)->{ 
			return b.profit-a.profit;
			});
		System.out.println(list.toString());
		for(int i=0;i<list.size();i++)
		{
		}
	}
}
public class JobSequencing 
{

	public static void main(String[] args) 
	{
		ArrayList<Job> list = new ArrayList<Job>();
		list.add(new Job('a',2,100));
		list.add(new Job('b', 1, 19));
        list.add(new Job('c', 2, 27));
        list.add(new Job('d', 1, 25));
        list.add(new Job('e', 3, 15));
        Job.jobScheduling(list);
	}

}
