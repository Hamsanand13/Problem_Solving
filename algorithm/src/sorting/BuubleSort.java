package sorting;

public class BuubleSort 
{
	public static void main(String[] args) 
	{
		int n=7;
		int a[]= {54,12,35,78,13,56,88};
		bubbleSort(a,n);
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}

	private static void bubbleSort(int[] a, int n) 
	{
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = 0; j < a.length-i-1; j++) 
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	}
}
