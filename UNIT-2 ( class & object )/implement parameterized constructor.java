//implement parameterized constructor
class constructor
{
	int radius;
	final double PI =3.14;
	constructor()
	{
		
	}
	constructor(int r)
	{
		radius = r;
	}
	void show()
	{
		double circumference;
		circumference = 2*PI*radius*radius;
		System.out.println("Circumference of the circle is "+circumference);
	}
	public static void main(String args[])
	{
		constructor c1 = new constructor();
		constructor c2 = new constructor(2);
		c1.show();
		c2.show();
	}
}