package interview;

import java.util.Arrays;

public class CommonElements 
{

	public static void main(String[] args) 
	{
		int[] array1 = { 1, 2, 3, 3, 5, 5 };
        int[] array2 = { 3, 4, 5, 5, 6, 7 };
        int[] array3 = { 5, 6, 7, 8, 5 };
        int i =0,j=0,k=0;
        Arrays.sort(array1);
        Arrays.sort(array2);
        Arrays.sort(array3);
        while(i<array1.length && j<array2.length && k<array3.length )
        {
        	if(array1[i] == array2[j] && array1[i] == array3[k])
        	{
        		System.out.println(array1[i]);
        		i++;
        		j++;
        		k++;
        	}
        	else if(array1[i]<array2[j])
        	{
        		i++;
        	}
        	else if (array2[j]<array3[k]) 
        	{
        		j++;
			}
			else {
				j++;
			}
        }

	}

}
