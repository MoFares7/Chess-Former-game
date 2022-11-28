package structure;

import constrant.Helper;
import game.Color;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Dijkstra
{
    static Helper helper = new Helper();
    // Number all property node in Plan
   public static int node = 63;

    // Adjacency list for storing which vertices are connected
   public static ArrayList<ArrayList<Integer>> state = new ArrayList<>(node);
    // function to form edge between two vertices source and dest
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j)
    {
        adj.get(i).add(j);
        adj.get(j).add(i);
    }
    public static void dijkstra_Path()
    {
        for (int i = 0; i < node; i++)
        {
            state.add(new ArrayList<>());
        }

        helper.getPath_Dijkstra();

    }

    // function to print the shortest distance and path between source vertex and destination vertex
    public static void printShortestDistance(ArrayList<ArrayList<Integer>> adj, int s, int dest, int v)
    {
        // predecessor[i] array stores predecessor of
        int pred[] = new int[v];
        int dist[] = new int[v];

        if (BFS(adj, s, dest, v, pred, dist) == false) {
            System.out.println("Given source and destination" + "are not connected");
            return;
        }

        // LinkedList to store path
        LinkedList<Integer> path = new LinkedList<>();
        int crawl = dest;
        path.add(crawl);
        while (pred[crawl] != -1) {
            path.add(pred[crawl]);
            crawl = pred[crawl];
        }

        System.out.println(Color.PURPLE + "Shortest path length is: " + dist[dest]);

        System.out.println("Following Dijkstra is : ");
        for (int i = path.size() - 1; i >= 0; i--) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();

    }
    // a modified version of BFS that stores predecessor of each vertex in array pred and its distance from source in array dist
    private static boolean BFS(ArrayList<ArrayList<Integer>> adj, int src, int dest, int v, int pred[], int dist[])
    {
        LinkedList<Integer> queue = new LinkedList<Integer>();

        boolean visited[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }

        // now source is first to be visited and distance from source to itself should be 0
        visited[src] = true;
        dist[src] = 0;
        queue.add(src);

        while (!queue.isEmpty()) {
            int u = queue.remove();
            for (int i = 0; i < adj.get(u).size(); i++) {
                if (visited[adj.get(u).get(i)] == false) {
                    visited[adj.get(u).get(i)] = true;
                    dist[adj.get(u).get(i)] = dist[u] + 1;
                    pred[adj.get(u).get(i)] = u;
                    queue.add(adj.get(u).get(i));

                    // stopping condition (when we find our destination)
                    if (adj.get(u).get(i) == dest)
                        return true;
                }
            }
        }
        return false;
    }
}
