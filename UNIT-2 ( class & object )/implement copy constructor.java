//implement copy constructor
class item
{
	int x;
	item()
	{
		x=100;
	}
	item(item m)
	{
		x=m.x;
	}
	void show()
	{
		System.out.println("Value of x="+x);
	}
	public static void main(String args[])
	{
		item i1 = new item();
		item i2 = new item(i1);
		i1.show();
		i2.show();
	}
}