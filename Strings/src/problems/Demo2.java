package problems;

import java.util.Collections;

public class Demo2 {

	public static void main(String[] args) 
	{
		String str = "WIPRO";
		int k =3;
		String ans=str.substring(str.length()-k,str.length());
//		System.out.println(ans);
		System.out.println(Collections.nCopies(k, ans));
		

	}

}
