//Write a program to implement constants in java
import java.util.Scanner;
class constant
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//calculate area of circle
		int radius ;
		final double PI = 3.14,area;
		System.out.println("Enter radius:");
		radius =sc.nextInt();
		area = (2*PI*radius);
		
		System.out.println("Area of circle is ="+area);
		
	}
}