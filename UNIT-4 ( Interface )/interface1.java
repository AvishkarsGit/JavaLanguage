interface Area
{
	final double PI=3.14;
	void area(int r);
}
class Circle implements Area
{
	public void area(int r)
	{
		System.out.println("Area of Circle ="+(PI*r*r));
	}
	public static void main(String args[])
	{
		Circle c1=new Circle();
		c1.area(32);
	}
}