package day_8;

public class Employee_Wage_Computation
{
    public static final int PT = 1;
    public static final int FT = 2;
    public static final int Emp_Rate_Per_Hour = 20;
    public static final int Num_Of_Working_Days = 20;
    public static final int Max_Hrs_In_Month = 100;

    public static void ComputeEmpWage()
    {
        // variables
        int empHrs;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        // computation
        while (totalEmpHrs <= Max_Hrs_In_Month && totalWorkingDays < Num_Of_Working_Days)
        {
            totalWorkingDays++;

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck)
            {
                case PT:
                    empHrs = 4;
                    break;
                case FT:
                    empHrs = 8;
                    break;

                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#:" + totalWorkingDays + "" + "Emp Hr:" + empHrs);
        }
        int totalEmpWage = totalEmpHrs * Emp_Rate_Per_Hour;
        System.out.println("Total Employee Wage:" + totalEmpWage);
    }

    public static void main(String[] args)
    {
        ComputeEmpWage();
    }

}
