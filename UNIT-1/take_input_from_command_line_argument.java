// Write a program to take input from user from command line argument
class take_input_from_command_line_argument
{
	public static void main(String args[])
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.println("Addition of two Number ="+(a+b));
	}
}