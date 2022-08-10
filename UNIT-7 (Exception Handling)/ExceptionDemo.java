//Exception Divide by Zero Demo
class ExceptionDemo
{
	public static void main(String args[])
	{
		int a,b,c;
		a=100;
		b=0;
		try
		{
			c=a/b;
			System.out.println("Division ="+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by Zero Exception is Occurred!!");
		}
	}
}