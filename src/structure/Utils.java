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
            if (isWin(plan, input_row, input_column))
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



}
