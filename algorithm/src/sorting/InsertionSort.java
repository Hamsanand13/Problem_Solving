package sorting;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		int n=7;
		int a[]= {54,12,35,78,13,56,88};
		InsertionSort(a,n);
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}

	private static void InsertionSort(int[] a, int n) 
	{
		for(int i=0;i<n;i++)
		{
			int key = a[i];
//			key=54
//			key=12
			int j =i-1;
//			j=-1
//			j=0
			while(j>=0 && a[j]>key)
			{
//				a[1]=54;
				
				a[j+1]=a[j];
				j--;
//				j=-1;
			}
			a[j+1]=key;
//			[54,]
//			[12,54]
		}
	}
}
