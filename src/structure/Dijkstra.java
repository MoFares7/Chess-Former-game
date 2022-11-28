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

