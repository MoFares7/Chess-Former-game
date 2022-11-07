package structure;

import game.Border;
import game.Plan;
import game.Position;

import java.util.Scanner;

public class Utils {

    Border border = new Border();

    public void checkMove(){


    }

    public static void getMove(char[][] plan, int row, int col)
    {

        // Traverse through the matrix
        for(int i = 0; i < 4; i++)
        {

            // Check if there is similar column
            // is already printed, i.e if i and
            // jth column match.
            for(int j = 0; j < i; j++) {

                for (int k = 0; k < 16; k++)
                    if (plan[i][k] != plan[j][k]);

            }
            // Print the row
            for(int j = 0; j < 16; j++)
            {

                plan[0][3] = plan[row][col];
                plan[row][col]='R';

                System.out.print(plan[i][j] + " ");
                plan[row][col] = '_';
            }


            System.out.println();
            System.out.println();
        }
    }

    public void nextSteps(){

    }

}
