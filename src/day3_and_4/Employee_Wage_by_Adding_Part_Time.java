package day3_and_4;

public class Employee_Wage_by_Adding_Part_Time {
    public static final int Is_Part_Time = 1;
    public static final int Is_Full_Time = 2;
    public static final int Emp_Rate_Per_Hour = 20;

    public static void main(String[] args){

        int Emp_Hrs=0;
        int Emp_Wage=0;

        double empCheck = Math.floor(Math.random() * 10) % 3;
        if ( empCheck == Is_Full_Time)
            Emp_Hrs = 8;
        else if ( empCheck == Is_Part_Time)
            Emp_Hrs = 4;
        else{
            Emp_Hrs = 0;
        }
        Emp_Wage = Emp_Hrs * Emp_Rate_Per_Hour;
        System.out.println("Emp Wage:" + Emp_Wage);
    }
}
