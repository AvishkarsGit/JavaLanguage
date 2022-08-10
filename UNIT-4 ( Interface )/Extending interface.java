import java.util.*;
interface abc
{	
	void display();
}
interface xyz extends abc
{
	void show();
} 
class Extends implements xyz
{
	public void display()
	{
		System.out.println("I am from abc interface");
	}
	public void show()
	{
		System.out.println("I am from xyz interface");
	}
	public static void main(String args[])
	{
		Extends e1=new Extends();
		e1.display();
		e1.show();
	}
}