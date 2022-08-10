//Throws Keyword 
class ThrowsDemo
{
	void mymethod(int num) throws ArithmeticException,NullPointerException
	{
		if(num==1)
		{
			throw new ArithmeticException("ArithmeticException is occured!!");
		}
		else
		{
			throw new NullPointerException("NullPointerException is occured!!");
		}
	}
	public static void main(String args[])
	{
		ThrowsDemo t1 = new ThrowsDemo();
		try
		{
			t1.mymethod(1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}