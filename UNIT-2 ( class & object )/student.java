import java.util.Scanner;
class student
{
        int id;
        String name;
        Scanner sc = new Scanner(System.in);
        void setdata()
        {
            System.out.println("Enter Student ID:");
            id = sc.nextInt();
            System.out.println("Enter Student Name:");
            name = sc.next();

        }
        void display()
        {
            System.out.println(id + "\t" + name);
        }
        public static void main(String args[])
        {
            stringdemo s1 = new stringdemo();
            stringdemo s2 = new stringdemo();
            stringdemo s3 = new stringdemo();
            stringdemo s4 = new stringdemo();
            stringdemo s5 = new stringdemo();
            s1.setdata();
            s2.setdata();
            s3.setdata();
            s4.setdata();
            s5.setdata();

            System.out.println("ID\tNAME");
            System.out.println("-------------------------");
            s1.display();
            s2.display();
            s3.display();
            s4.display();
            s5.display();;
        }
}
