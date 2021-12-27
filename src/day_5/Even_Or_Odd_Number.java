package day_5;
import java.util.Scanner;

public class Even_Or_Odd_Number
{

    public static void main(String[] args)
    {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Any number: ");
        num = s.nextInt();
        if (num % 2 == 0)
        {
            System.out.println("Entered Number is Even");
        }
        else
        {
            System.out.println("Entered Number is Odd");
        }
    }
}
