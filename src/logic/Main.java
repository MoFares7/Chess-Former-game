package logic;

import constrant.Helper;
import game.view.Border;
import game.view.Plan;
import game.controle.BFS;
import game.controle.DFS;
import game.controle.UserPlay;

import java.util.Scanner;

import static constrant.Helper.getPath_Astar;
import static game.controle.Dijkstra.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Border border = new Border();
        UserPlay utils = new UserPlay();
        Plan plan = new  Plan();
        Helper position = new Helper();

        // initial border and print
        border.printBorder(plan.plan);

            System.out.println("Please Enter 1 to UserPlayer Mode");
            System.out.println("Please Enter 2 to DFS Player Mode");
            System.out.println("Please Enter 3 to BFS Player Mode");
            System.out.println("Please Enter 4 to Dijkstra Player Mode");
            System.out.println("Please Enter 5 to A Star Player Mode");
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
                    utils.getMove(Plan.plan ,2,7);
                    DFS.initializeDFS();
                    break;
                }
                case 3:
                {
                    BFS.initializeBFS();
                    break;
                }
                case 4:
                {
                    dijkstra_Path();
                    printShortestDistance(state , position.source , position.dest , node);
                    utils.getMove(Plan.plan ,2 , 7);
                    break;
                }
                case 5:
                {
                     getPath_Astar();

                     break;
                }
                default:System.out.println("Invalid Value !");
            }
        }
}
