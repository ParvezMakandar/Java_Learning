package day3_and_4;

public class Employee_Wage_For_Month {

    public static final int Is_Part_Time = 1;
    public static final int Is_Full_Time = 2;
    public static final int Emp_Rate_Per_Hour = 20;
    public static final int Num_Of_Working_Days = 20;

    public static void main(String[] args){

        int Emp_Hrs = 0, Emp_Wage = 0, Total_EmpWage = 0;
        for (int days = 0; days < Num_Of_Working_Days; days++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck){
                case Is_Part_Time:
                    Emp_Hrs = 4;
                    break;
                case Is_Full_Time:
                    Emp_Hrs=8;
                    break;
                default:
                    Emp_Hrs=0;
            }

            Emp_Wage = Emp_Hrs * Emp_Rate_Per_Hour;
            Total_EmpWage += Emp_Wage;
            System.out.println("Emp Wage:" + Emp_Wage);
        }
        System.out.println("Total Emp Wage: " + Total_EmpWage);
    }

    
}
