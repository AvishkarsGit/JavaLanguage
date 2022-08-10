//Write a program to implement math function in java
import java.lang.Math;

class mathfunction
{
	public static void main(String args[])
	{
		
		int a=10,b=23;
		System.out.println("A ="+a+"\tB ="+b);
		System.out.println("Minimum value is "+Math.min(a,b));
		System.out.println("Maximum value is "+Math.max(a,b));
		System.out.println("Squre root of 81 is "+Math.sqrt(81));
		System.out.println("Power of 2^3 is  "+Math.pow(2,3));
		System.out.println("Exponential of 75.133273536 is "+Math.exp(75.133273536));
		System.out.println("Round of (200.7656) ="+Math.round(200.7656));
		System.out.println("Absolute value of (-57152) is "+Math.abs(-57152));
	}
}