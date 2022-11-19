package logic;

import constrant.Helper;
import game.Border;
import game.Color;
import game.Plan;
import structure.DFS;
import structure.Utils;

public class Main
{
    public static void main(String[] args)
    {

        Border border = new Border();
        Utils utils = new Utils();
        Plan plan = new  Plan();

        // initial border and print
        border.printBorder(plan.plan);

        DFS.initializeDFS();
        //  utils.getUserPlay(plan.plan);
    }


}
