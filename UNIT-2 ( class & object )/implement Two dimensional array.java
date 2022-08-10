 //two dimensional array
import java.util.*;
class TwoDarray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[][]=new int[3][3];
		int i,j;
		System.out.println("Enter 3*3 Matrix array elements:");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Your 3*3 Array Elements:");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		}
	}
}