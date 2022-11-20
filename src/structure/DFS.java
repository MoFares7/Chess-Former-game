package structure;


import constrant.Helper;
import game.Plan;

public class DFS {

    static Helper helper = new Helper();
    static Utils utils = new Utils();
;    // adjacency matrix
    public static int[][] adj;
    // function to add edge to the graph
    public static void addEdge(int x, int y)
    {
        adj[x][y] = 1;
        adj[y][x] = 1;
    }
    // function to perform DFS on the graph
    public static void dfs(int start, boolean[] visited)
    {

        // Print the current node
        System.out.print(start + " ");

        // Set current node as visited
        visited[start] = true;

        // For every node of the graph
        for (int i = 0; i < adj[start].length; i++) {

            // If some node is adjacent to the current node
            // and it has not already been visited
            if (adj[start][i] == 1 && (!visited[i])) {

                dfs(i, visited);
            }
        }
    }
    public static void initializeDFS()
    {
        System.out.println("Following is Depth First Search");

        // number of all property nodes
        int v = 160;

        // adjacency matrix
        DFS.adj = new int[v][v];

        // Visited vector to so that
        // a vertex is not visited more than once
        // Initializing the vector to false as no
        // vertex is visited at the beginning
        boolean[] visited = new boolean[v];
        helper.pathOfDFS();

        System.out.println();

        DFS.dfs(0, visited);

        System.out.println();

        utils.getMove(Plan.plan ,2,7);

    }
}
