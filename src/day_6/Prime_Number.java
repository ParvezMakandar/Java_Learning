package day_6;
import java.util.Scanner;

public class Prime_Number
{
        public static void main(String[] args)
        {
            int num;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter any number");
            num = s.nextInt();
            boolean flag = false;
            for (int i = 2; i <= num / 2; ++i)
            {
                if (num % i == 0)
                {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
}
