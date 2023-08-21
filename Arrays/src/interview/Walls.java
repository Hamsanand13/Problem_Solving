package interview;
/*Ques 2 -> Walls

Consider N walls, each of unit width, situated next to each other.

You have to select any two walls i and j (1<=i, j<=N) such that if you break all walls except i and j and fill the spaces between them with water, then the amount of water stored is maximum.

Write a program to find the maximum amount of water that can be accumulated between the walls.
 * 
 * */
public class Walls 
{
	public static void main(String[] args) 
	{
		int walls[]= {1,2,3,4,5};
		int l=0;
		int r=walls.length-1;
		int maxWater=0;
		
		while (l<r) 
		{
			int width = r-l-1;
			int height=Math.min(walls[l], walls[r]);
			int water =width*height;
			maxWater=Math.max(maxWater, water);
			if(walls[l]<walls[r])
			{
				l++;
			}
			else {
				r--;
			}
		}
		System.out.println(maxWater);
	}
}
