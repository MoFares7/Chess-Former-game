package structure;

import constrant.Helper;
import game.Color;
import game.Plan;

public class DFS {
    static Helper helper = new Helper();
    static int numOfNodeVisited = 0;
    // function to add edge to the graph
    public static boolean addEdgeDFS(int x, int y)
    {
                Plan.plan[x][y] = 1;
                Plan.plan[y][x] = 1;
        return false;
    }
    // function to perform DFS on the graph

}
