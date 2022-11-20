package constrant;

import structure.BFS;
import structure.DFS;

public class Helper {

   public int getNumHorizontal = 16;
   public   int getNumVertical = 3;
   public   int getNumPropriety = 100;


   public void pathOfDFS(){
      DFS.addEdge(0, 12);
      DFS.addEdge(12,1);
      DFS.addEdge(1, 2);
      DFS.addEdge(2, 2);
      DFS.addEdge(2, 7);
   }
   public void pathOfBFS(){
      BFS BFS = new BFS(160);
      BFS.addEdge(0, 12);
      BFS.addEdge(12,1);
      BFS.addEdge(1, 2);
      BFS.addEdge(2, 2);
      BFS.addEdge(2, 7);
   }


}
