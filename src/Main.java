import game.Border;
import structure.Utils;

import java.util.Scanner;

public class Main
{


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        Border border = new Border();
        Utils utils = new Utils();
        char plan[][] = {

            {'_','_','_','R','_','_','_','_','_','_',' ',' ','_','_','_','_',},
            {'_','_','_','_',' ',' ','_','_','_','_','_','_','_','_','_','_',},
            {'_','_','_','_','_','_','_',' ',' ','_','_','_','_','_','_','_',},
            {'_','_','_','_','_','_','_','K','_','_','_','_','_','_','_','_',},
    };
  // initial border and print
       border.printBorder(plan);

       // ask from user what is a cell want to move her and check
        // if the cell is include the border or not
       for (int i =0; i<1000;i++){
          System.out.println("Please Enter Row");
          int d_row = scanner.nextInt();
          if(d_row > 3 )
          {
            System.out.println("Please Enter Row between 0 and 2");
             d_row = scanner.nextInt();
          }
          System.out.println("Please Enter Column");
          int d_col = scanner.nextInt();
          if(d_col > 15 )
            {
             System.out.println("Please Enter Column between 0 and 15");
             d_col = scanner.nextInt();
            }

         utils.getMove(plan,d_row ,d_col);
    }
    }
}