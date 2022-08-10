//Thread priority
class ThreadX extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("from ThreadX :i="+i);
		}
	}
}
class ThreadY extends Thread
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("from ThreadY :j="+j);
		}
	}
}
class ThreadZ extends Thread
{
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			System.out.println("from ThreadZ :k="+k);
		}
	}
}
class ThreadPriorityDemo
{
	public static void main(String args[])
	{
		ThreadX t1=new ThreadX();
		ThreadY t2=new ThreadY();
		ThreadZ t3=new ThreadZ();
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
