package structure;

import constrant.Helper;
import game.Color;
import game.Plan;
import java.util.*;


public class BFS
{
    static Helper helper = new Helper();
    static  Utils utils = new Utils();
    // Number of Node
    private static int node;
    static int numOfNodeVisited = 0;
    private static LinkedList<Integer>[] adj;

    // Create Constructor
    public BFS(int v)
    {
        node = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph

}
