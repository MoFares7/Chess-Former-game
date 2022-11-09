package logic;

import game.Border;
import game.Color;
import game.Plan;
import structure.Utils;

import java.util.Scanner;

public class Main
{


    public static void main(String[] args)
    {
        Border border = new Border();
        Utils utils = new Utils();
        Plan plan = new  Plan();
        Color color = new Color();
        System.out.println();
        System.out.println(color.RED + "Welcome in Chess Former Game Ready");
        System.out.println();


  // initial border and print
       border.printBorder(plan.plan);
       utils.getInput(plan.plan);

    }
}