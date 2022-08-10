//Exception Handling - throw keyword demo
import java.util.*;
class ThrowkeywordDemo
{
	void validate()
	{
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age:");
		age=sc.nextInt();
		if(age>=18)
		{
		
			System.out.println("You are eligible for Votting");
		}
		else
		{
			throw new NullPointerException("You are not eligible for votting!!");
			
		}
	}
	public static void main(String args[])
	{
		ThrowkeywordDemo t1 = new ThrowkeywordDemo();
		t1.validate();
	}
}