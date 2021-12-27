package day_5;
import java.util.Scanner;

public class Prime_Factor
{
    public static void main(String[] args)
    {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        number = sc.nextInt();

        System.out.println("Prime factors of "+ number + " are:");
        for(int i = 2; i*i<=number; i++)
        {
            while(number % i == 0)
            {
                System.out.print(i+ " x ");
                number = number / i;
            }
        }
        if(number != 1) {
            System.out.println(number);
        }
    }

}
