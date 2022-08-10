//Write a program for take input from user using scanner class
import java.util.Scanner;
class Scannerdemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int no;
		System.out.println("Enter Number :");
		no=sc.nextInt();
		if(no%2==0)
		{
			System.out.println("Even Number ");
		}
		else
		{
			System.out.println("ODD Number ");
		}
	}
}