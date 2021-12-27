package day_5;
import java.util.Scanner;

public class Flip_Coin
{
    public static void main(String[] args)
    {
        int head = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of times to flip coin");
        int a;
        a = s.nextInt();
        for (int i = 0; i < a; i++)
        {
            double flip = (Math.random() % 2);
            if (flip < .5)
            {
                head++;
            }
        }
        double Percent_Of_Heads = (double)(head * 100) / a;
        double Percent_Of_Tails = 100 - Percent_Of_Heads;
        System.out.println("Percentage of heads is: " +Percent_Of_Heads+"%");
        System.out.println("Percentage of tails is: " +Percent_Of_Tails+"%");
    }
}
