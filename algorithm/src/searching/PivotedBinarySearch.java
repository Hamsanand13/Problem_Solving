package searching;

import java.util.Scanner;

public class PivotedBinarySearch 
{
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=8;
		int a[]= {4,5,6,7,8,1,2,3,4};
		int key =2;
		System.out.print(PBS(a, n, key));

	}
	public static int  PBS(int a[],int n,int key) 
	{
		int pivot=findPivot(a, 0, n-1);
		System.out.println(pivot);
		if(pivot==-1)
		{
			return binarySearch(a, key, 0, n-1);
		}
		if(a[pivot]==key)
		{
			return pivot;
		}
		if(a[0]<=key)
		{
			return binarySearch(a, key, 0, pivot-1);
		}
		return binarySearch(a, key, pivot+1, n-1);
		
		
	}
	public static int findPivot(int a[],int low ,int high) 
	{
		if(high<low)
		{
			return -1;
		}
		if(high==low)
		{
			return low;
		}
		int mid = (low + high)/2;
		if(mid<high && a[mid]>a[mid+1])
		{
			return mid;
		}
		if(mid > low && a[mid]<a[mid-1])
		{
			System.out.println("hello");
			return mid-1;
		}
		if(a[low]>=a[mid])
		{
			return findPivot(a,low,mid-1);
		}
		return findPivot(a,mid+1,high);

	}
	static int binarySearch(int a[],int key,int low,int high)
	{
		if(high<low)
		{
			return -1;
		}
		int mid =(high+low)/2;
		if(a[mid]== key)
		{
			return mid;
		}
		else if(a[mid]>key)
		{
			return binarySearch(a, key, low, mid-1);
		}
		return binarySearch(a, key, mid+1, high);
	}
}
