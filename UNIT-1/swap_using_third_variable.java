//Write a program to swap two number using third variable 
class swap_using_third_variable
{
	public static void main(String args[])
	{
		int a=10,b=20,temp;
		System.out.println("Before swapping value of ");
		System.out.println("A="+a+"\tB="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping value of ");
		System.out.println("A="+a+"\tB="+b);
	}
}