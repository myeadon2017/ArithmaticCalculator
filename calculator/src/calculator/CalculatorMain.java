package calculator;

import java.util.Scanner;

public class CalculatorMain
{
public static void main(String args[])
{
    float a, b, res;
    char choice;
    Scanner scan = new Scanner(System.in);

    do
    {
    	System.out.println("-----------------------------");
        System.out.println("Enter (+) For Addition");
        System.out.println("Enter (-) For Subtraction");
        System.out.println("Enter (*) For Multiplication");
        System.out.println("Enter (/) For Division");
        System.out.println("Enter (E) To Exit");
        System.out.println("-----------------------------");
        
        System.out.println("Enter Your Choice : ");
        choice = scan.next().charAt(0);

        switch(choice)
        {
            case '+' : System.out.print("Enter Two Numbers : ");
                a = scan.nextFloat();
                b = scan.nextFloat();
                System.out.println("-----------------");
                res = a + b;
                System.out.println("Result = " + res);
                break;
            case '-' : System.out.print("Enter Two Numbers : ");
                a = scan.nextFloat();
                b = scan.nextFloat();
                System.out.println("-----------------");
                res = a - b;
                System.out.println("Result = " + res);
                break;
            case '*' : System.out.print("Enter Two Numbers : ");
                a = scan.nextFloat();
                b = scan.nextFloat();
                System.out.println("-----------------");
                res = a * b;
                System.out.println("Result = " + res);
                break;
            case '/' : System.out.print("Enter Two Numbers : ");
                a = scan.nextFloat();
                b = scan.nextFloat();
                System.out.println("-----------------");
                res = a / b;
                System.out.println("Result = " + res);
                break;
            case 'E' : System.exit(0);
                break;
            default : System.out.println("Invalid Choice");
        }
    }while(choice != 'E');       
}
}