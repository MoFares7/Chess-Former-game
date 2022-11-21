package logic;

import constrant.Helper;
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

        Border border = new Border();
        Helper helper = new Helper();
        Plan plan = new  Plan();

        // initial border and print
        border.printBorder(plan.plan);

        helper.chooseModeGame();
    }
}
