package structure;

import constrant.Helper;
import game.Color;

import java.util.Scanner;

public class Utils {

    static Helper position = new Helper();
    static Color color = new Color();
    static  int level = 0;
    public void getInput(char[][] plan)
    {

        for (int i =0; i < position.getNumPropriety ;i++) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Please Enter Row Cell You Wanted to Move her");

            int input_row = scanner.nextInt();

            // check if input row smaller than number Vertical in plan
            if (input_row > position.getNumVertical) {
                System.out.println("Please Enter Row between 0 and 2");
                input_row = scanner.nextInt();

            }

            System.out.println("Please Enter Column Cell You Wanted to Move her");
            int input_column = scanner.nextInt();

            if (input_column > position.getNumHorizontal - 1) {
                System.out.println("Please Enter Column between 0 and 15");
                input_column = scanner.nextInt();
            }
            if( checkMove(plan , input_row , input_column))
            {
                continue;
            }
            if (isFinal(plan, input_row, input_column))
            {
                break;
            }
        }
    }
    public boolean checkMove(char[][] plan , int input_row , int input_column){

        if (level != input_row)
        {
            System.out.println( "Ops Can not Move to another Level ");
            System.out.println(" You are Now in Level " +" "+ level );
        }
        else
        {
            getMove(plan, input_row, input_column);

        }
        if (isEmpty(plan, input_row, input_column))
        {
            level += 1;
        }
        return false;
    }
    public static void getMove(char[][] plan, int row, int col)
    {
        // Traverse through the matrix
        for(int i = 0; i < position.getNumVertical +1 ; i++)
        {
            for(int j = 0; j < i; j++) {

                for (int k = 0; k < position.getNumHorizontal; k++)
                    if (plan[i][k] != plan[j][k]);

            }
            // Print the row
            for(int j = 0; j < position.getNumHorizontal; j++)
            {
                getNextStates(plan,row,col,i,j);
            }
            System.out.println();
            System.out.println();
        }
    }
    public static void getNextStates(char plan[][] , int row , int col , int i , int j)
    {
        if(isWall(plan, row , col))
        {
            plan[0][1] = plan[row][col];
            plan[row][col]='R';

            System.out.print(plan[i][j] + "  ");
            plan[row][col] = '_';

        }
        if(isEmpty(plan , row , col))
        {
            plan[0][1] = plan[row][col];
            plan[row + 1][col]='R';
            System.out.print(plan[i][j] + "  ");
            plan[row+1][col] = '_';

        }
    }
    public static boolean isWall(char[][] plan, int row, int col)
    {
        for (int i = 0; i < position.getNumVertical; i++) {
            for (int j = 0; j < position.getNumHorizontal; j++) {
                if (plan[row][col] == '_') {
                    return true;
                }

            }
        }
        return false;
    }
    public static boolean isEmpty(char[][] plan, int row, int col)
    {
        for (int i = 0; i < position.getNumVertical; i++) {
            for (int j = 0; j < position.getNumHorizontal; j++) {
                if (plan[row][col] == ' ') {
                    return true;
                }

            }
        }
        return false;
    }
    public  boolean isFinal(char[][] plan , int input_row , int input_column)
    {
        if(level == 3)
        {
            System.out.println( color.CYAN +  "Configuration You are Win" );
            return  true;
        }
        return  false;

    }

}
