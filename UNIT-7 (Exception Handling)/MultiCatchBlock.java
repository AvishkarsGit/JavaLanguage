//Exception Handling -Multi Catch Block
class MultiCatchBlock
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
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Divide by Zero Exception is Occurred!!");
		}
	}
}