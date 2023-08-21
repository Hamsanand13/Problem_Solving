package tree;
import java.util.*;
class Name
{
    int test(int count)
    {
        if(count==7)
        {
            return 2;
        }
        int left = test(count-1);
        int right = test(count-1);
        return left*right;
    }
}
public class Recursion1
{
	public static void main(String[] args) {
		int a =10;
		Name ob = new Name();
		System.out.print(ob.test(a));
	}
}
