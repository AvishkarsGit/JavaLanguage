import Math_s.*;
class Accesspkg
{
	public static void main(String args[])
	{
		Addition a1 = new Addition();
		substraction s1 = new substraction();
		
		int m=a1.add(100,200);
		m=s1.sub(500,200);
		System.out.println("Addtion of two Numbers ="+m);
		System.out.println("Substraction of two Numbers ="+m);
	}
}