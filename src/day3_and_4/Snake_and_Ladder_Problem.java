package day3_and_4;

public class Snake_and_Ladder_Problem {

    public static final int No_Play = 0;
    public static final int Ladder = 1;
    public static final int Snake = 2;
    public static final int Start = 0;


    public static void main(String[] args){

        int pos = 0, pos1 = 0, cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        //int con = 1;
        System.out.println("Starting position of player is: " + Start);
        while(pos < 100 && pos1 < 100)
        {
            int con = 1;
            while(con == 1)
            {
                System.out.println("PLAYER_1");
                int roll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
                cnt1++;
                System.out.println("Number on rolled dice is : " +roll);
                con = (int) (Math.floor(Math.random() * 10) % 3);
                System.out.println("Condition: " +con);
                switch (con)
                {
                    case No_Play ->
                            {
                        System.out.println("NO PLAY");
                        System.out.println("New Position is: " + pos);
                        cnt4++;
                            }
                    case Ladder ->
                            {
                                System.out.println("Got LADDER");
                                pos = pos + roll;
                                if (pos <= 100)
                                    System.out.println("New Position is: " + pos);
                                else
                                {
                                    pos = pos - roll;
                                    System.out.println("Remains at same position: " + pos);
                                }
                                cnt2++;
                            }
                    case Snake ->
                            {
                                System.out.println("Got SNAKE");
                                pos = pos - roll;
                                if (pos <= 100)
                                {
                                    if (pos >= 0)
                                    {
                                        System.out.println("New Position is: " + pos);
                                    }
                                    else
                                    {
                                        pos = 0;
                                        System.out.println("New Position is: " + pos);
                                    }
                                }
                                else
                                {
                                    System.out.println("New position is:" + pos);
                                }
                                cnt3++;
                            }
                            default -> System.out.println("Default");
                }
            }
            int con1 = 1;
            while (con1 == 1 && pos1 < 100)
            {
                System.out.println("PLAYER_2");
                int roll1 = (int) (Math.floor(Math.random() * 10) % 6 + 1);
                c1++;
                System.out.println("Number on rolled dice is : " + roll1);
                con1 = (int) (Math.floor(Math.random() * 10) % 3);
                System.out.println("Condition: " + con1);
                switch (con1)
                {
                    case No_Play ->
                            {
                                System.out.println("NO PLAY");
                                System.out.println("New Position is: " + pos1);
                                c4++;
                            }
                    case Ladder ->
                            {
                                System.out.println("Got LADDER");
                                pos1 = pos1 + roll1;
                                if (pos1 <= 100)
                                    System.out.println("New Position is: " + pos1);
                                else
                                {
                                    pos1 = pos1 - roll1;
                                    System.out.println("Remains at same position: " + pos1);
                                }
                                c2++;
                            }
                    case Snake ->
                            {
                                System.out.println("Got SNAKE");
                                pos1 = pos1 - roll1;
                                if (pos1 <= 100)
                                {
                                    if (pos1 >= 0)
                                    {
                                        System.out.println("New Position is: " + pos1);
                                    }
                                    else
                                    {
                                        pos1 = 0;
                                        System.out.println("New Position is: " + pos1);
                                    }
                                }
                                else
                                {
                                    System.out.println("New position is:" + pos1);
                                }
                                c3++;
                            }
                            default -> System.out.println("Default");
                }
            }
        }
        System.out.println();
        if (pos == 100)
        {
            System.out.println("Player_1 ROLLED DICE "+ cnt1 +" time and got SNAKE "+ cnt3 +" times and got LADDER "+ cnt2 +" times and got NO PLAY "+ cnt4 +" times to win the game");
            System.out.println();
            System.out.println("** PLAYER_1 WON **");
        }
        else
        {
            System.out.println("Player_2 ROLLED DICE "+ c1 +" time and got SNAKE "+ c3 +" times and got LADDER "+ c2 +" times and got NO PLAY "+c4+" times to win the game");
            System.out.println();
            System.out.println("** PLAYER_2 WON **");
        }
    }
}
