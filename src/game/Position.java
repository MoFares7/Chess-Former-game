package game;

public class Position {
   int x;
   int y;

  public Position(int x,int y) {
         this.x = x;
         this.y = y;
   }
   boolean isValid(){
      return  y > -1 && y< 10 && x < 16 && x > -1;
   }
}
