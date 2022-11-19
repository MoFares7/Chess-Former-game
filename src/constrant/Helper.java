package constrant;

import structure.DFS;

public class Helper {

   public int getNumHorizontal = 16;
   public   int getNumVertical = 3;
   public   int getNumPropriety = 100;


   public void show(){
      DFS.addEdge(0, 12);
      DFS.addEdge(12, 1);
      DFS.addEdge(1, 2);
      DFS.addEdge(2, 7);
   }

}
