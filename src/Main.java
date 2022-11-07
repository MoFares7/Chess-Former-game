import game.Border;

public class Main
{
    public static void main(String[] args)
    {

        char plan[][] = {
            {'_','_','_','R','_','_','_','_','_','_',' ',' ','_','_','_','_',},
            {'_','_','_','_',' ',' ','_','_','_','_','_','_','_','_','_','_',},
            {'_','_','_','_','_','_','_',' ',' ','_','_','_','_','_','_','_',},
            {'_','_','_','_','_','_','_','K','_','_','_','_','_','_','_','_',},
    };
      Border border = new Border();
        System.out.println();

       border.findUniqueRows(plan);
    }
}