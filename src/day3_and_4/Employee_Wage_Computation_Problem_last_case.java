package day3_and_4;

public class Employee_Wage_Computation_Problem_last_case {

    public static final int Is_Part_Time = 1;
    public static final int Is_Full_Time = 2;
    public static final int Emp_Rate_Per_Hour = 20;
    public static final int Num_Of_Working_Days = 20;
    public static final int Max_Hrs_In_Month = 100;

    public static void main(String[] args){

        int Emp_Hrs, Total_Emp_Hrs = 0, Total_Working_Days = 0;
        while ( Total_Emp_Hrs <= Max_Hrs_In_Month && Total_Working_Days < Num_Of_Working_Days ) {
            Total_Working_Days++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            Emp_Hrs = switch (empCheck) {
                case Is_Part_Time -> 4;
                case Is_Full_Time -> 8;
                default -> 0;
            };
            Total_Emp_Hrs += Emp_Hrs;
            System.out.println("Days#: " + Total_Working_Days + " Emp Hr: " +Emp_Hrs);
        }
        int Total_Emp_Wage = Total_Emp_Hrs * Emp_Rate_Per_Hour;
        System.out.println("Total Emp Wage: " + Total_Emp_Wage);
    }
}
