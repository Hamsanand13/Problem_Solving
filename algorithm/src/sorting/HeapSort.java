package sorting;

public class HeapSort 
{

	public static void main(String[] args) 
	{
		int n=7;
		int a[]= {54,12,35,78,13,56,88};
		//System.out.println(n/2-1);
			heapSort(a,n);
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}

	}

	private static void heapSort(int[] a, int n) 
	{
		for(int i = n/2-1;i>=0;i--)
		{
			heapify(a,n,i);
//			break;
		}
		for (int i = n-1; i >=0; i--) 
		{
			int temp = a[i];
			a[i]=a[0];
			a[0]=temp;
			heapify(a, i, 0);
		}
		
	}

	private static void heapify(int[] a, int n, int i) 
	{
		int largest = i;
		int left = 2*i +1;
		int right = 2*i+2;
//		System.out.println("largest:"+largest);
//		System.out.println("left:"+left);
//		System.out.println("right:"+right);
		
		if(left<n && a[left]>a[largest])
		{
			largest=left;
		}
		if(right<n && a[right]>a[largest])
		{
			largest=right;
		}
		if(largest!=i)
		{
			int temp=a[i];
			a[i]=a[largest];
			a[largest]=temp;
			heapify(a, n, largest);
		}
	}

}
