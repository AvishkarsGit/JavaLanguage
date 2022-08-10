class RunnableX implements  Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("from RunnableX :i="+i);
		}
	}
}
class RunnableY implements  Runnable
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("from RunnableY :j="+j);
		}
	}
}
class RunnableDemo
{
	public static void main(String args[])
	{
		RunnableX r1=new RunnableX();
		RunnableY r2=new RunnableY();
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);

		t1.start();
		t2.start();
	}
}
