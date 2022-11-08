package logic;

import game.Border;
import game.Plan;
import structure.Utils;

import java.util.Scanner;

public class Main
{


    public static void main(String[] args)
    {

        System.out.println();
        System.out.println("Welcome in Chess Former Game Ready");
        System.out.println();
        Border border = new Border();
        Utils utils = new Utils();
        Plan plan = new  Plan();

  // initial border and print
       border.printBorder(plan.plan);
       utils.getInput(plan.plan);

    }
}