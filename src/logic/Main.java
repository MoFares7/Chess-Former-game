package logic;

import game.Border;
import game.Plan;
import structure.BFS;
import structure.DFS;
import structure.Utils;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Border border = new Border();
        Utils utils = new Utils();
        Plan plan = new  Plan();

        // initial border and print
        border.printBorder(plan.plan);

      //  utils.getUserPlay(plan.plan);

        System.out.println("Please Enter 1 to UserPlayer Mode");
        System.out.println("Please Enter 2 to DFS Player Mode");
        System.out.println("Please Enter 3 to BFS Player Mode");
        System.out.print("The Mode game is : " + " ");
        int number = scanner.nextInt();

        switch (number)
        {
            case 1:
            {
                border.printBorder(plan.plan);
                utils.getUserPlay(plan.plan);
                break;
            }
            case 2:
            {
                DFS.initializeDFS();
                break;
            }
            case 3:
            {
                BFS.initializeBFS();
                break;
            }
            default:System.out.println("Invalid Value !");
        }



    }
}
