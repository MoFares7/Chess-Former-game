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


}
