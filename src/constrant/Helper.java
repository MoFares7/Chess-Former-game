package constrant;

import game.Border;
import game.Plan;
import structure.BFS;
import structure.DFS;
import structure.Utils;

import java.util.Scanner;

public class Helper {

   public int getNumHorizontal = 16;
   public   int getNumVertical = 3;
   public   int getNumPropriety = 100;

   Border border = new Border();
   Utils utils = new Utils();
   Plan plan = new  Plan();

   Scanner scanner = new Scanner(System.in);

   public void pathOfBFS()
   {
      BFS BFS = new BFS(160);
      BFS.addEdge(0, 12);
      BFS.addEdge(12,1);
      BFS.addEdge(1, 2);
      BFS.addEdge(2, 2);
      BFS.addEdge(2, 7);
   }
   public void chooseModeGame()
   {
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
