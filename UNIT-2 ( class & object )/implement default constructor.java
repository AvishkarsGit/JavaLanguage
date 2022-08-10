//implement default constructor
class constructor
{
	int a,b;
	constructor()
	{
		a=10;
		b=20;
	}
	void show()
	{
		System.out.println("Addition of two number:"+(a+b));
	}
	public static void main(String args[])
	{
		constructor c1 = new constructor();
		c1.show();
	}
}