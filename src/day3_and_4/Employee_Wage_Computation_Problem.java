package day3_and_4;
import java.util.Random;

public class Employee_Wage_Computation_Problem {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem Program");

        //constants
        final int Is_Present = 0;
        final int Is_Absent = 1;
        final int Is_Full_Time = 2;
        final int Is_Part_Time =3;
        final int Per_Hour_Wage = 20;
        final int Full_Time_Hour = 8;
        final int Part_Time_Hour = 4;
        //Variables

        int Emp_Wage = 0;
        int Working_Hours = 0;

        //Use Case 1
        Random randomNumber = new Random();
        int num = randomNumber.nextInt(4);
        if (Is_Present == num) {
            System.out.println("Employee is Present");
        }
        else if (Is_Absent == num){
            System.out.println("Employee is Absent");
        }
        // Use Case 2
        if (Is_Present == num){
            Working_Hours = 8;
            Emp_Wage = Working_Hours * Per_Hour_Wage;

            System.out.println("Daily Wage of the Employee is : Rs " + Emp_Wage);
        }
        else if (Is_Absent == num) {
            System.out.println("Daily Wage of the Employee is Rs " + Emp_Wage);
        }
        // Use Case 3
        if (Is_Full_Time == num){
            Working_Hours = 8;
            Emp_Wage = Working_Hours * Per_Hour_Wage;
            System.out.println("Employee is Working full time and his wage is Rs : " + Emp_Wage);

        }
        else if (Is_Part_Time == num){
            Working_Hours = 4;
            Emp_Wage = Working_Hours * Per_Hour_Wage;
            System.out.println("Employee is working part time and his wage is Rs : " + Emp_Wage);

        }
    }
}
