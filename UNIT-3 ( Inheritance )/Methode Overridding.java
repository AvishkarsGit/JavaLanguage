//Methode Overridding
class Base
{
	void display()
	{
		System.out.println("base class method call");
	}
}
class derived extends Base
{
	void display()
	{
		System.out.println("derived class method call");
	}
}
class methodoverriding
{
	public static void main(String args[])
	{			
		derived d1=new derived();
		d1.display();
	}	
}