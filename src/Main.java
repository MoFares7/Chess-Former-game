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

       border.printBorder(plan);
 for (int i =0; i<1000;i++){
     System.out.println("Please Enter Row");
     int d_row = scanner.nextInt();
     System.out.println("Please Enter Column");
     int d_col = scanner.nextInt();
     System.out.println("yes"+plan[0][3]);


       utils.getMove(plan,d_row ,d_col);
    }
    }
}