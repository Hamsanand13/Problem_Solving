package sorting;

public class SelectionSort {

	public static void main(String[] args) 
	{
		int n=7;
		int a[]= {54,12,35,78,13,56,88};
		SelectionSort(a,n);
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}

	private static void SelectionSort(int[] a, int n) 
	{
		for(int i =0;i<n-1;i++)
		{
			int k=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[k])
				{
					k=j;
				}
			}
			int temp=a[i];
			a[i]=a[k];
			a[k]=temp;
		}
		
	}

}
