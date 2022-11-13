package logic;

import game.Border;
import game.Color;
import game.Plan;
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

       utils.getUserPlay(plan.plan);

    }
}