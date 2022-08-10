//write a program to implement Type Casting 
class typecasting 
{
	public static void main(String args[])
	{
		 int a=11;
		 float b;
		 b=a;
		 
		 System.out.println("*** Implicit Typecasting *** ");
		 System.out.println("The value of Int ="+a);
		 System.out.println("The value of float ="+b);
		 
		 int x=10;
		 double y;
		 y= (double)x;
		 System.out.println("*** Explicit Typecasting ***");
		 System.out.println("The value of Int ="+x);
		 System.out.println("The value of double ="+y);
	}
}