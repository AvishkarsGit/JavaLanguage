//one dimensional array
import java.util.*;
class oneDarray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,n;
		System.out.println("Enter Array Size :");
		n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter "+n+" Array Elements :");
		for(i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.print("Your Array Elements are:");
		for(i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}