package constrant;



import static structure.DFS.addEdgeDFS;
import static structure.BFS.addEdgeBFS;
import static structure.Dijkstra.addEdge;
import static structure.Dijkstra.state;

public class Helper {

   public int getNumHorizontal = 16;
   public int getNumVertical = 3;
   public int getNumPropriety = 100;
   public int source = 0, dest = 55;

   // This Function to all state is can movement inside Border
   public void getPath_DFS()
   {
      addEdgeDFS( 0, 1);
      addEdgeDFS( 0, 2);
      addEdgeDFS( 0, 3);
      addEdgeDFS( 0, 4);
      addEdgeDFS( 0, 5);
      addEdgeDFS( 0, 6);
      addEdgeDFS( 0, 7);
      addEdgeDFS( 0, 8);
      addEdgeDFS( 0, 9);
      addEdgeDFS( 0, 10);
      addEdgeDFS( 0, 11);
      addEdgeDFS( 0, 12);
      addEdgeDFS( 0, 13);
      addEdgeDFS( 0, 14);
      addEdgeDFS( 0, 15);
      addEdgeDFS( 12, 16);
      addEdgeDFS( 12, 17);
      addEdgeDFS( 12, 18);
      addEdgeDFS( 12, 19);
      addEdgeDFS( 12, 20);
      addEdgeDFS( 12, 21);
      addEdgeDFS( 12, 22);
      addEdgeDFS( 12, 23);
      addEdgeDFS( 12, 24);
      addEdgeDFS( 12, 25);
      addEdgeDFS( 12, 26);
      addEdgeDFS( 12, 27);
      addEdgeDFS( 12, 28);
      addEdgeDFS( 12, 29);
      addEdgeDFS( 12, 30);
      addEdgeDFS( 12, 31);
      addEdgeDFS( 12, 32);
      addEdgeDFS( 18, 33);
      addEdgeDFS( 18, 34);
      addEdgeDFS( 18, 35);
      addEdgeDFS( 18, 36);
      addEdgeDFS( 18, 37);
      addEdgeDFS( 18, 38);
      addEdgeDFS( 18, 39);
      addEdgeDFS( 18, 40);
      addEdgeDFS( 18, 41);
      addEdgeDFS( 18, 42);
      addEdgeDFS( 18, 43);
      addEdgeDFS( 18, 44);
      addEdgeDFS( 18, 45);
      addEdgeDFS( 18, 46);
      addEdgeDFS( 18, 47);
      addEdgeDFS( 18, 48);
      addEdgeDFS( 48, 55);

   }

   // This Function to all state is can movement inside Border
   public void getPath_BFS()
   {
      addEdgeBFS( 0, 1);
      addEdgeBFS( 0, 2);
      addEdgeBFS( 0, 3);
      addEdgeBFS( 0, 4);
      addEdgeBFS( 0, 5);
      addEdgeBFS( 0, 6);
      addEdgeBFS( 0, 7);
      addEdgeBFS( 0, 8);
      addEdgeBFS( 0, 9);
      addEdgeBFS( 0, 10);
      addEdgeBFS( 0, 11);
      addEdgeBFS( 0, 12);
      addEdgeBFS( 0, 13);
      addEdgeBFS( 0, 14);
      addEdgeBFS( 0, 15);
      addEdgeBFS( 12, 16);
      addEdgeBFS( 12, 17);
      addEdgeBFS( 12, 18);
      addEdgeBFS( 12, 19);
      addEdgeBFS( 12, 20);
      addEdgeBFS( 12, 21);
      addEdgeBFS( 12, 22);
      addEdgeBFS( 12, 23);
      addEdgeBFS( 12, 24);
      addEdgeBFS( 12, 25);
      addEdgeBFS( 12, 26);
      addEdgeBFS( 12, 27);
      addEdgeBFS( 12, 28);
      addEdgeBFS( 12, 29);
      addEdgeBFS( 12, 30);
      addEdgeBFS( 12, 31);
      addEdgeBFS( 12, 32);
      addEdgeBFS( 18, 33);
      addEdgeBFS( 18, 34);
      addEdgeBFS( 18, 35);
      addEdgeBFS( 18, 36);
      addEdgeBFS( 18, 37);
      addEdgeBFS( 18, 38);
      addEdgeBFS( 18, 39);
      addEdgeBFS( 18, 40);
      addEdgeBFS( 18, 41);
      addEdgeBFS( 18, 42);
      addEdgeBFS( 18, 43);
      addEdgeBFS( 18, 44);
      addEdgeBFS( 18, 45);
      addEdgeBFS( 18, 46);
      addEdgeBFS( 18, 47);
      addEdgeBFS( 18, 48);
      addEdgeBFS( 40, 55);

   }

   public void getPath_Dijkstra()
   {
      addEdge(state, 0, 1);
      addEdge(state, 0, 2);
      addEdge(state, 0, 3);
      addEdge(state, 0, 4);
      addEdge(state, 0, 5);
      addEdge(state, 0, 6);
      addEdge(state, 0, 7);
      addEdge(state, 0, 8);
      addEdge(state, 0, 9);
      addEdge(state, 0, 10);
      addEdge(state, 0, 11);
      addEdge(state, 0, 12);
      addEdge(state, 0, 13);
      addEdge(state, 0, 14);
      addEdge(state, 0, 15);
      addEdge(state, 12, 16);
      addEdge(state, 12, 17);
      addEdge(state, 12, 18);
      addEdge(state, 12, 19);
      addEdge(state, 12, 20);
      addEdge(state, 12, 21);
      addEdge(state, 12, 22);
      addEdge(state, 12, 23);
      addEdge(state, 12, 24);
      addEdge(state, 12, 25);
      addEdge(state, 12, 26);
      addEdge(state, 12, 27);
      addEdge(state, 12, 28);
      addEdge(state, 12, 29);
      addEdge(state, 12, 30);
      addEdge(state, 12, 31);
      addEdge(state, 12, 32);
      addEdge(state, 18, 33);
      addEdge(state, 18, 34);
      addEdge(state, 18, 35);
      addEdge(state, 18, 36);
      addEdge(state, 18, 37);
      addEdge(state, 18, 38);
      addEdge(state, 18, 39);
      addEdge(state, 18, 40);
      addEdge(state, 18, 41);
      addEdge(state, 18, 42);
      addEdge(state, 18, 43);
      addEdge(state, 18, 44);
      addEdge(state, 18, 45);
      addEdge(state, 18, 46);
      addEdge(state, 18, 47);
      addEdge(state, 18, 48);
      addEdge(state, 40, 49);
      addEdge(state, 40, 50);
      addEdge(state, 40, 51);
      addEdge(state, 40, 52);
      addEdge(state, 40, 53);
      addEdge(state, 40, 54);
      addEdge(state, 40, 55);
      addEdge(state, 40, 56);
      addEdge(state, 40, 57);
      addEdge(state, 40, 58);
      addEdge(state, 40, 59);
      addEdge(state, 40, 60);
      addEdge(state, 40, 61);
      addEdge(state, 40, 62);
   }


}
