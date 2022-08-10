import java.util.*;
class prime
{
	public static void main(String args[])
	{
		int num,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		num = sc.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is Not prime");
		}
	}
}