package sorting;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n=7;
		int a[]= {54,12,35,78,13,56,88};
		QuickSort(a,0,n-1);
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		
	}
	static void QuickSort(int[] a,int low,int high) 
	{
		if(low < high)
		{
			int p = partition(a,low,high);
			QuickSort(a, low, p-1);
			QuickSort(a, p+1, high);
		}
	}
	private static int partition(int[] a, int low, int high) 
	{
//		Starting element as pivot element
//		Lesser than pivot on left
//		Greater than pivot on right
		int pivot = a[high];
		
		int i = (low-1);
		
		for(int j=low;j<high;j++)
		{
			if(a[j]<pivot)
			{
				i++;
				swap(a,i,j);
			}
		}
		swap(a, i+1, high);
		return (i+1);
	}
	private static void swap(int[] a, int i, int j) 
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;	
	}
	

}
