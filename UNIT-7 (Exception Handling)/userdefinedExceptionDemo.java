import java.util.*;
class AuthonticationFailException extends Exception
{
	AuthonticationFailException(String pass)
	{
		super(pass);
	}
}
class userdefinedExceptionDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password:");
		String pass = sc.next();
		if(pass.equals("1696"))
		{
			System.out.println("Loggin Succeed....");
		}
		else
		{	
			try
			{
				throw new AuthonticationFailException("Password is Incorect!!!");
			}
			catch(AuthonticationFailException e)
			{
				System.out.println(e);	
			}
		}
	}
}