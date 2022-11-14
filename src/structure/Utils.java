package structure;

import constrant.Helper;
import game.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

    static Helper position = new Helper();
    static Color color = new Color();
    static  int level = 0;

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
    public  boolean isFinalWin()
    {
        if(level == 3)
        {
            System.out.println( color.CYAN +  "Configuration You are Win" );
            return  true;
        }
        return  false;
    }
}
