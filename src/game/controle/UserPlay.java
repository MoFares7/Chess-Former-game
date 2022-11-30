package game.controle;

import constrant.Helper;
import game.view.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserPlay {

    static Helper position = new Helper();
    static Color color = new Color();
    static  int level = 0;
    public void getUserPlay(char[][] plan)
    {
        for (int i =0; i < position.getNumPropriety ;i++)
        {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Please Enter Row Cell You Wanted to Move her");

            int input_row = scanner.nextInt();

            // check if input row smaller than number Vertical in plan
            if (input_row > position.getNumVertical)
            {
                System.out.println("Please enter a Row between 0 to 2");
                input_row = scanner.nextInt();

            }
            System.out.println("Please Enter Column Cell You Wanted to Move her");
            int input_column = scanner.nextInt();

            if (input_column > position.getNumHorizontal - 1)
            {
                System.out.println("Please Enter Column between 0 and 15");
                input_column = scanner.nextInt();
            }
            if( checkMove(plan , input_row , input_column))
            {
                continue;
            }
            if (isFinalWin())
            {
                break;
            }
        }
    }
    // This function is benefit to check if can move to another step or not
    public boolean checkMove(char[][] plan , int input_row , int input_column)
    {

        if (level != input_row)
        {
            System.out.println( "Ops Can not Move to another Level ");
            System.out.println(" You are Now in Level " +" "+ level );
        }
        else
        {
            if (isEmpty(plan, input_row, input_column))
            {
                level += 1;
            }
            if(!isFinalWin())
            {
                getMove(plan, input_row, input_column);
                getNextStates(plan, input_row, input_column);
            }
            if(isFinalWin())
            {
                getMove(plan, input_row, input_column);
            }
        }

        return false;
    }
    public  void getMove(char[][] plan, int row, int col)
    {
        // Traverse through the matrix
        for(int i = 0; i < position.getNumVertical +1 ; i++)
        {
            for(int j = 0; j < i; j++)
            {
                for (int k = 0; k < position.getNumHorizontal; k++)
                    if (plan[i][k] != plan[j][k]);

            }
            // Print the row
            for(int j = 0; j < position.getNumHorizontal; j++)
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
                    plan[row + 1][col] = '_';
                }
            }
            System.out.println();
            System.out.println();

        }
    }
    public  void getNextStates(char[][] plan , int row , int col )
    {
        List deepCopy = new ArrayList();

        System.out.println(color.RED +"This is Cell suggested to move them");
        System.out.println();
        for (int i = 0; i < 1; i++)
        {
            for (int j = 0; j < position.getNumHorizontal; j++)
            {
                if(level != 3)
                {
                    if(isEmpty(plan , row , col))
                    {
                        deepCopy.add(plan[i][col]);

                        System.out.println(color.ORANGE +"this is cell can move her" +"(" + level +" , " + j + ")");
                    }
                    else if(isWall(plan , row ,col)){

                        deepCopy.add(plan[i][col]);
                        System.out.println(color.ORANGE+"this is cell  move her" +"(" + level +" , " + j + ")");
                    }
                }
                else System.out.println();
            }
        }
    }
    // This function is benefit to remember me when find Wall on border
    public static boolean isWall(char[][] plan, int row, int col)
    {
        for (int i = 0; i < position.getNumVertical; i++)
        {
            for (int j = 0; j < position.getNumHorizontal; j++)
            {
                if (plan[row][col] == '_')
                {
                    return true;
                }
            }
        }
        return false;
    }
    // This function is benefit to remember me when find empty on border
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
    // This function is benefit to end game when kill the King
    public  boolean isFinalWin()
    {
        if(level == 3)
        {
            System.out.println( color.CYAN +  "Configuration You are Win" );
            return  true;
        }
        return  false;
    }
 /*
    @Override
    public boolean equals(Object obj) {
     if (this == obj)
         return true;
     if (obj == null)
         return false;
     if (getClass() != obj.getClass())
         return false;
     Vertex other = (Vertex) obj;
     if (id == null) {
         if (other.id != null)
             return false;
     } else if (!id.equals(other.id))
         return false;
     return true;

  */
 }

