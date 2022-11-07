package structure;

import game.Border;

public class Utils {

    Border border = new Border();

    public void checkMove(){


    }

    public boolean isWall(){
        if(border.print().isBlank()){
            return false;

        }
        else{
            return  true;
        }
    }
}
