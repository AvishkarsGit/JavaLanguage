//constructor overloading
class room
{
	double length,width;
	room(double x)
	{
		length=x;
		width=10.20;
	}
	room(double m,double n)
	{
		length=m;
		width=n;
	}
	void show()
	{
		System.out.println("Area of 1st room :"+(length*width));
	}
	public static void main(String args[])
	{
		room r1 = new room(11.32);
		room r2 = new room(12.4,34.4);
		r1.show();
		r2.show();
	}
}