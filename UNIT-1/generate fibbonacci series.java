import java.util.*;
class fibonancci
{	
	public static void main(String args[])
	{
		int fno=0,sno=1,tno,number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		number = sc.nextInt();
		System.out.print("Fibbonacci series ="+fno+" "+sno);
		for(int i=2;i<number;i++)
		{
			tno=fno+sno;
			System.out.print(" "+tno);
			fno=sno;
			sno=tno;
		}
	}
}