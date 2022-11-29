package game.controle;

import constrant.Helper;
import game.view.Color;
import game.view.Plan;

import java.util.*;


public class BFS
{
    static Helper helper = new Helper();
    static UserPlay utils = new UserPlay();
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
    public static void addEdgeBFS(int v, int w)
    {
        adj[v].add(w);
    }
    // prints BFS traversal from a given source s
    static void BFS(int node)
    {
        // Mark all the vertices as not visited(By default set as false)
        boolean visited[] = new boolean[BFS.node];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[node]=true;
        queue.add(node);

        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            node = queue.poll();
            System.out.print(node+" ");

            // Get all adjacent vertices of the dequeued nodes If an adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> element = adj[node].listIterator();
            while (element.hasNext())
            {
                int n = element.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                    for(Integer item : queue)
                    {
                        System.out.print("\t");
                        System.out.print(item.toString());
                        numOfNodeVisited++;
                    }
                }
            }
        }
    }
    public static void check_Path_BFS()
    {
        BFS BFS = new BFS(160);
       helper.getPath_BFS();
    }
    public static void initializeBFS()
    {
        System.out.println();
        System.out.println(Color.RED_ITALIC + "Following is Breadth First Search : ");

        BFS.check_Path_BFS();
        System.out.println();

        BFS(0);
        System.out.println();
        System.out.println("This is Number of Nodes are Visited To Solution: " + numOfNodeVisited * 4);

        utils.getMove(Plan.plan , 2,7);
        utils.isFinalWin();
    }
}
