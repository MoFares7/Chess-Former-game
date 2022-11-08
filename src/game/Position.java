package game;

public class Position {
   int x;
   int y;

  public Position(int x,int y) {
         this.x = x;
         this.y = y;
   }

   boolean isValid(){
      if(y > -1 && y< 10 && x < 5 && x > -1)
      {
          return  true;
      }
      return false;
   }
}
