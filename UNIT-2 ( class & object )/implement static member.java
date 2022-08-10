//static member
class staticdemo
{
	int no;
	static int count;
	void getdata(int x)
	{
		no=x;
		count++;
	}
	void display()
	{
		System.out.println("Value of No :"+no);
		System.out.println("Value of count :"+count);
	}
	public static void main(String args[])
	{
		staticdemo s1 = new staticdemo();
		staticdemo s2 = new staticdemo();
		staticdemo s3 = new staticdemo();
		
		s1.getdata(100);
		s2.getdata(200);
		s3.getdata(300);
		
		System.out.println("Object s1 ");
		System.out.println("--------------------");
		s1.display();
		System.out.println("Object s2 ");
		System.out.println("--------------------");
		s2.display();
		System.out.println("Object s3 ");
		System.out.println("--------------------");
		s3.display();
	}
}