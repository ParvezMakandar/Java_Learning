package day3_and_4;

public class Using_Switch_Case {
    public static final int Is_Part_Time = 1;
    public static final int Is_Full_Time = 2;
    public static final int Emp_Rate_Per_Hour = 20;

    public static void main(String[] args){

        int Emp_Hrs=0;
        int Emp_Wage=0;

        int Emp_Check = (int) Math.floor(Math.random() * 10) % 3;

        switch (Emp_Check){
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
        System.out.println("Emp Wage:" + Emp_Wage);
    }
}
