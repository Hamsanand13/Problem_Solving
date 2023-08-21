package sorting;

public class MergeSort 
{
	static int temp[];
	public MergeSort(int n) 
	{
		temp= new int[n];
	}
	public static void main(String[] args) 
	{
		int n=7;
		MergeSort ob = new MergeSort(n);
		int a[]= {54,12,35,78,13,56,88};
		mergeSort(a,0,n-1);
		for (int l = 0; l < a.length; l++) 
		{
			System.out.println(a[l]);
		}
	}

	private static void mergeSort(int[] a, int low, int high) 
	{
		if(low<high)
		{
			int mid = (low+high)/2;
			mergeSort(a, low, mid);
			mergeSort(a,mid+1,high);
			combine(a,low,mid,high);
		}
		
	}
	private static void combine(int[] a, int low, int mid, int high) 
	{
		 int n1,n2,i,j,k;
		  n1=mid-low+1;
		  n2=high-mid;
		  int arr1[]=new int[n1];
		  int arr2[]=new int[n2];
		  
		  for(i=0;i<n1;i++)
		  {
			  arr1[i]=a[low+i];
		  }
		  
		  for(j=0;j<n2;j++)
		  {
		    arr2[j]=a[mid+j+1];
		  }
		  i=j=0;
		  k = low;
	        while (i < n1 && j < n2) {
	            if (arr1[i] <= arr2[j]) 
	            {
	                a[k] = arr1[i];
	                i++;
	            }
	            else {
	                a[k] = arr2[j];
	                j++;
	            }
	            k++;
	        }
	  
	        /* Copy remaining elements of L[] if any */
	        while (i < n1) {
	            a[k] = arr1[i];
	            i++;
	            k++;
	        }
	  
	        /* Copy remaining elements of R[] if any */
	        while (j < n2) {
	            a[k] = arr2[j];
	            j++;
	            k++;
	        }
		
	}
}
