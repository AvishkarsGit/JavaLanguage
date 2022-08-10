import java.awt.*;
import java.util.Scanner;

class stringdemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        String string,new_str;
        String str = new String();

        System.out.println("Enter The string :");
        string = sc.next();
        do {
			
            System.out.println("***** STRING MENUS *****");
            System.out.println("press 1 to Find Length of string");
            System.out.println("press 2 to concatinate the another string ");
            System.out.println("press 3 to convert string into uppercase ");
            System.out.println("press 4 to convert string into Lowercase ");
            System.out.println("press 5 to compare the string ");
            System.out.println("press 6 to Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Length of string " + string + " is " + string.length());
                    break;
                case 2:
                    System.out.println("Enter  New string :");
                    new_str = sc.next();
                    System.out.println("Concatinated strings are "+string.concat(new_str));
                    break;
                case 3:
                    System.out.println("UpperCase of string '"+string+"' is "+string.toUpperCase());
                    break;
                case 4:
                    System.out.println("LowerCase of String '"+string+"' is "+string.toLowerCase());
                    break;
                case 5:
                    System.out.println("Enter String for compare :");
                    new_str = sc.next();
                    if(string.equals(new_str))
                    {
                        System.out.println("Both string are equal");
                    }
                    else
                    {
                        System.out.println("Both strings are not equal");
                    }
                    break;
                case 6:System.out.println("Thanks for using our software..");
                    break;
                default:
                    System.out.println("Enter valid choice....");
            }
        }while (choice!=6);
    }
}
