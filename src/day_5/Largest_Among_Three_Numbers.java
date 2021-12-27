package day_5;
import java.util.Scanner;
public class Largest_Among_Three_Numbers
{

    public static void main(String[] args)
    {
        int a, b, c, largest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
        largest = Math.max(c, (Math.max(a, b)));
        System.out.println("The largest number is: "+largest);
    }
}
