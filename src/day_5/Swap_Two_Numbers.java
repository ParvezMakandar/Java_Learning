package day_5;

public class Swap_Two_Numbers
{

    public static void main(String[] args)
    {
        int a = 100, b = 200;

        System.out.println("Before Swap");
        System.out.println("x = " + a);
        System.out.println("y = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap");
        System.out.println("x = " + a);
        System.out.println("y = " + b);
    }

}
