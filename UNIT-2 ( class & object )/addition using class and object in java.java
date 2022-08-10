class add
{
	int a,b,c;
	void getdata()
	{
		a=100;
		b=200;
	}
	void putdata()
	{
		c=a+b;
		System.out.println("Addition of two number="+c);
	}
	public static void main(String args[])
	{
		add a1 = new add();
		a1.getdata();
		a1.putdata();
	}
}