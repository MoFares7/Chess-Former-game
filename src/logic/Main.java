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
                int v =122, e = 14;

                // Create the graph
                BFS G = new BFS(v, e);
                G.addEdge(0, 1);
                G.addEdge(0, 16);
                G.addEdge(0, 2);
                G.addEdge(0, 3);
                G.addEdge(0, 4);
                G.addEdge(0, 5);
                G.addEdge(0, 6);
                G.addEdge(0, 7);
                G.addEdge(0, 8);
                G.addEdge(0, 9);
                G.addEdge(0, 10);
                G.addEdge(0, 11);
                G.addEdge(0, 12);
                G.addEdge(0, 13);
                G.addEdge(0, 14);
                G.addEdge(0, 15);
                G.addEdge(1, 1);
                G.addEdge(1, 2);
                G.addEdge(1, 3);
                G.addEdge(1, 4);
                G.addEdge(1, 5);
                G.addEdge(1, 6);
                G.addEdge(1, 7);
                G.addEdge(1, 8);
                G.addEdge(1, 9);
                G.addEdge(1, 10);
                G.addEdge(1, 11);
                G.addEdge(1, 12);
                G.addEdge(1, 13);
                G.addEdge(1, 14);
                G.addEdge(1, 15);
                G.addEdge(2, 1);
                G.addEdge(2, 2);
                G.addEdge(2, 3);
                G.addEdge(2, 4);
                G.addEdge(2, 5);
                G.addEdge(2, 6);
                G.addEdge(2, 7);
                G.addEdge(2, 8);
                G.addEdge(2, 9);
                G.addEdge(2, 10);
                G.addEdge(2, 11);
                G.addEdge(2, 12);
                G.addEdge(2, 13);
                G.addEdge(2, 14);
                G.addEdge(2, 15);

                G.BFS(0);
            }
            default:System.out.println("Invalid Value !");
        }



    }
}
