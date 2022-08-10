//Multi-threading 
class ThreadEven extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("from ThreadEVEN:Even No="+i);	
			}
		}
	}
}
class ThreadOdd extends Thread
{
	public void run()
	{
		for(int j=1;j<=10;j++)
		{
			if(j%2!=0)
			{
				Sleep(1000);
				System.out.println("from ThreadODD:ODD No="+j);	
			}
		}
	}
}
class ThreadEvenODDDemo
{
	public static void main(String args[])
	{
		ThreadEven t1=new ThreadEven();
		ThreadOdd t2=new ThreadOdd();
		t1.start();
		t2.start();
	}
}
