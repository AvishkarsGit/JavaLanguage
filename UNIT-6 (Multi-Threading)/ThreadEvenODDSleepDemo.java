//Sleep Method
class ThreadEvenS extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{	
			if(i%2==0)
			{
				try
				{
					sleep(500);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				System.out.println("from ThreadEVEN:Even No="+i);	
			}
		}
	}
}
class ThreadOddJ extends Thread
{
	public void run()
	{
		for(int j=1;j<=10;j++)
		{
			if(j%2!=0)
			{
				System.out.println("from ThreadODD:ODD No="+j);	
			}
		}
	}
}
class ThreadEvenODDSleepDemo
{
	public static void main(String args[])
	{
		ThreadEvenS t1=new ThreadEvenS();
		ThreadOddJ t2=new ThreadOddJ();
		t1.start();
		t2.start();
	}
}
