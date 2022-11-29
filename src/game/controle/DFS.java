package game.controle;

import constrant.Helper;
import game.view.Color;
import game.view.Plan;

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
    public static void dfs(int start, boolean[] visited)
    {
        // Print the current node
        System.out.print(start + " ");

        // Set current node as visited
        visited[start] = true;

        // For every node of the graph
        for (int i = 0; i < Plan.plan[start].length; i++)
        {
            // If some node is adjacent to the current node,
            // and it has not already been visited
            if (Plan.plan[start][i] == 1 && (!visited[i]))
            {
                dfs(i, visited);
                numOfNodeVisited++;
            }
        }
    }
    public static void Check_Path_DFS()
    {
       helper.getPath_DFS();
    }

    public static void initializeDFS()
    {
        // number of all property nodes
        int v = 160;
        // adjacency matrix
        Plan.plan = new char[v][v];
        boolean[] visited = new boolean[v];


        System.out.println();
        System.out.println(Color.CYAN_ITALIC+"Following is Depth First Search");

        DFS.Check_Path_DFS();

        DFS.dfs(1, visited);

        System.out.println();

        // to get all movement able in border and addition on graph
        for(int i =0; i < helper.getNumVertical; i++)
        {
            for(int j =0; j < helper.getNumHorizontal; j++)
            {

                if(DFS.addEdgeDFS(40, 55))
                {
                    break;
                }
                else
                {
                    DFS.addEdgeDFS(i,j);
                }
            }
        }
        DFS.dfs(0, visited);

        System.out.println();
        System.out.println("This is Number of Nodes are Visited To Solution: " + numOfNodeVisited*4);

    }
}
