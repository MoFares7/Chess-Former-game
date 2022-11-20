package structure;

import constrant.Helper;
import game.Plan;
import java.util.*;

public class BFS
{
    static Helper helper = new Helper();
    static  Utils utils = new Utils();
    // Number of vertex
    private static int V;

    static int numOfNodeVisited = 0;// No. of vertices
    private static LinkedList<Integer>[] adj; //Adjacency Lists

    // Constructor
    public BFS(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    public static void addEdge(int v, int w)
    {
        adj[v].add(w);
    }

    // prints BFS traversal from a given source s
    static void BFS(int node)
    {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[V];

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
                    for(Integer item : queue) {
                        System.out.println(item.toString());
                        numOfNodeVisited++;
                    }

                }
            }
        }}
    public static void initializeBFS()
    {
        System.out.println();
        System.out.println("Following is Breadth First Search : ");

       // System.out.println(adj.length);
        // Create the graph

        helper.pathOfBFS();

        BFS(0);
        System.out.println();
        System.out.print("This is Number of Nodes are Visited : ");
        System.out.println(numOfNodeVisited);
        utils.getMove(Plan.plan , 2,7);
        utils.isFinalWin();
    }
}
