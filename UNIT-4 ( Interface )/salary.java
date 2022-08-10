import java.util.*;
interface gross
{
	int TA=500;
	int DA=1000;
	int HRA=1500;
	void gross_sal();
}
class Employee
{
	String name;
	int basic_sal;
	void get_emp_details()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		name=sc.next();
		System.out.println("Enter Employee basic salary:"); 
		basic_sal=sc.nextInt();
	}
}
class salary extends Employee implements gross
{
	int gross_sal;
	public void gross_sal()
	{	
		gross_sal=(basic_sal+TA+DA+HRA);
	}
	void display()
	{	
		System.out.println("********* PAYMENT SLIP **********");
		System.out.println("NAME		:"+name);
		System.out.println("Basic Salary:"+basic_sal);
		System.out.println("TA			:"+TA);
		System.out.println("DA			:"+DA);
		System.out.println("HRA			:"+HRA);
		System.out.println("====================================");
		System.out.println("Gross salary :"+gross_sal);
	}
	public static void main(String args[])
	{
		salary s1 = new salary();
		s1.get_emp_details();
		s1.gross_sal();
		s1.display();
	}
}