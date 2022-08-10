import java.util.*;
class employee
{
	int emp_id;
	double salary;
	String name;
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee name :");
		name = sc.next();
		System.out.print("Enter Employee ID :");
		emp_id = sc.nextInt();
		System.out.print("Enter Employee salary:");
		salary = sc.nextDouble();
	}
	void putdata()
	{
		System.out.println("**** EMployee Details ****");
		System.out.println("NAME 	:"+name);
		System.out.println("ID	:"+emp_id);
		System.out.println("SALARY	:"+salary);
	}
	public static void main(String args[])
	{
		employee e1 = new employee();
		e1.getdata();
		e1.putdata();
	}
}