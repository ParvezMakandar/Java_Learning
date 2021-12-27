package day_5;
import java.util.Scanner;

public class Power_of_2
{

    public static void main(String[] args)
    {
        int result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number Between 0 to 31: ");
        int n = sc.nextInt();
        if(n >= 0 && n < 31)
        {
            System.out.println("Power of 2 of 2^"+ n +" is");
            for(int i=0; i < n; i++)
            {
                result = result * 2;
                System.out.println(result);
            }
        }
        else
        {
            System.err.println("Please Check and Enter the Number Between 0 to 31");
        }
    }

}
