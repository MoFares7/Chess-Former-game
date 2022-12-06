package constrant;



import game.controle.UserPlay;
import game.view.Color;
import game.view.Plan;
import structure.Edge;
import structure.Node;

import java.util.List;

import static game.controle.AstarSearchAlgo.*;
import static game.controle.DFS.addEdgeDFS;
import static game.controle.BFS.addEdgeBFS;
import static game.controle.Dijkstra.addEdge;
import static game.controle.Dijkstra.state;

public class Helper {

   public int getNumHorizontal = 16;
   public int getNumVertical = 3;
   public int getNumPropriety = 100;
   public int source = 0, dest = 55;

   static UserPlay utils = new UserPlay();
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

   public static void getPath_Astar()
   {

         //initialize the graph base on the border map

      Node n0  = new Node("1",1);
      Node n1  = new Node("1",130);
      Node n2  = new Node("2",3);
      Node n3  = new Node("3",4);
      Node n4  = new Node("4",5);
      Node n5  = new Node("5",6);
      Node n6  = new Node("6",7);
      Node n7  = new Node("7",8);
      Node n8  = new Node("8",9);
      Node n9  = new Node("9",10);
      Node n10 = new Node("10",11);
      Node n11 = new Node("11",12);
      Node n12 = new Node("12",13);
      Node n13 = new Node("13",14);
      Node n14 = new Node("14",15);
      Node n15 = new Node("15",16);
      Node n16 = new Node("16",17);
      Node n17 = new Node("17",2);
      Node n18 = new Node("18",432);
      Node n19 = new Node("19",32);
      Node n20 = new Node("20",42);
      Node n22 = new Node("22",52);
      Node n21 = new Node("21",62);
      Node n23 = new Node("23",72);
      Node n24 = new Node("24",20);
      Node n25 = new Node("25",29);
      Node n26 = new Node("26",28);
      Node n27 = new Node("27",27);
      Node n28 = new Node("28",26);
      Node n29 = new Node("29",24);
      Node n30 = new Node("30",231);
      Node n31 = new Node("31",22);
      Node n32 = new Node("32",213);
      Node n33 = new Node("33",433);
      Node n34 = new Node("34",853);
      Node n35 = new Node("35",367);
      Node n36 = new Node("36",87);
      Node n37 = new Node("37",673);
      Node n38 = new Node("38",53);
      Node n39 = new Node("39",83);
      Node n40 = new Node("40",376);
      Node n41 = new Node("41",63);
      Node n42 = new Node("42",243);
      Node n43 = new Node("43",233);
      Node n44 = new Node("44",343);
      Node n45 = new Node("45",342);
      Node n46 = new Node("46",341);
      Node n47 = new Node("47",31);
      Node n55 = new Node("55",0);


      //initialize the all edges is connected between node

      n0.adjacencies = new Edge[]{
              new Edge(n1,1),
              new Edge(n2,1),
              new Edge(n3,1),
              new Edge(n4,1),
              new Edge(n5,1),
              new Edge(n6,1),
              new Edge(n7,1),
              new Edge(n8,1),
              new Edge(n9,1),
              new Edge(n10,1),
              new Edge(n11,1),
              new Edge(n12,1),
              new Edge(n13,1),
              new Edge(n14,1),
              new Edge(n15,1),
      };
      n1.adjacencies = new Edge[]{
              new Edge(n0,1),
              new Edge(n2,1),
              new Edge(n3,1),
              new Edge(n4,1),
              new Edge(n5,1),
              new Edge(n6,1),
              new Edge(n7,1),
              new Edge(n8,1),
              new Edge(n9,1),
              new Edge(n10,1),
              new Edge(n11,1),
              new Edge(n12,1),
              new Edge(n13,1),
              new Edge(n14,1),
              new Edge(n15,1),
      };
      n2.adjacencies = new Edge[]{
              new Edge(n0,1),
              new Edge(n1,1),
              new Edge(n3,1),
              new Edge(n4,1),
              new Edge(n5,1),
              new Edge(n6,1),
              new Edge(n7,1),
              new Edge(n8,1),
              new Edge(n9,1),
              new Edge(n10,1),
              new Edge(n11,1),
              new Edge(n12,1),
              new Edge(n13,1),
              new Edge(n14,1),
              new Edge(n15,1),
      };
      n3.adjacencies = new Edge[]{
              new Edge(n0,1),
              new Edge(n1,1),
              new Edge(n2,1),
              new Edge(n4,1),
              new Edge(n5,1),
              new Edge(n6,1),
              new Edge(n7,1),
              new Edge(n8,1),
              new Edge(n9,1),
              new Edge(n10,1),
              new Edge(n11,1),
              new Edge(n12,1),
              new Edge(n13,1),
              new Edge(n14,1),
              new Edge(n15,1),
      };
      n4.adjacencies = new Edge[]{
              new Edge(n0,1),
              new Edge(n2,1),
              new Edge(n3,1),
              new Edge(n1,1),
              new Edge(n5,1),
              new Edge(n6,1),
              new Edge(n7,1),
              new Edge(n8,1),
              new Edge(n9,1),
              new Edge(n10,1),
              new Edge(n11,1),
              new Edge(n12,1),
              new Edge(n13,1),
              new Edge(n14,1),
              new Edge(n15,1),
      };
      n5.adjacencies = new Edge[]{
              new Edge(n0,1),
              new Edge(n2,1),
              new Edge(n3,1),
              new Edge(n4,1),
              new Edge(n1,1),
              new Edge(n6,1),
              new Edge(n7,1),
              new Edge(n8,1),
              new Edge(n9,1),
              new Edge(n10,1),
              new Edge(n11,1),
              new Edge(n12,1),
              new Edge(n13,1),
              new Edge(n14,1),
              new Edge(n15,1),
      };
      n6.adjacencies = new Edge[]{
              new Edge(n0,1),
              new Edge(n2,1),
              new Edge(n3,1),
              new Edge(n4,1),
              new Edge(n5,1),
              new Edge(n1,1),
              new Edge(n7,1),
              new Edge(n8,1),
              new Edge(n9,1),
              new Edge(n10,1),
              new Edge(n11,1),
              new Edge(n12,1),
              new Edge(n13,1),
              new Edge(n14,1),
              new Edge(n15,1),
      };
      n7.adjacencies = new Edge[]{
              new Edge(n0,1),
              new Edge(n2,1),
              new Edge(n3,1),
              new Edge(n4,1),
              new Edge(n5,1),
              new Edge(n6,1),
              new Edge(n1,1),
              new Edge(n8,1),
              new Edge(n9,1),
              new Edge(n10,1),
              new Edge(n11,1),
              new Edge(n12,1),
              new Edge(n13,1),
              new Edge(n14,1),
              new Edge(n15,1),
      };
      n8.adjacencies = new Edge[]{
              new Edge(n0,1),
              new Edge(n2,1),
              new Edge(n3,1),
              new Edge(n4,1),
              new Edge(n5,1),
              new Edge(n6,1),
              new Edge(n7,1),
              new Edge(n1,1),
              new Edge(n9,1),
              new Edge(n10,1),
              new Edge(n11,1),
              new Edge(n12,1),
              new Edge(n13,1),
              new Edge(n14,1),
              new Edge(n15,1),
      };
      n9.adjacencies = new Edge[]{
              new Edge(n0,1),
              new Edge(n2,1),
              new Edge(n3,1),
              new Edge(n4,1),
              new Edge(n5,1),
              new Edge(n6,1),
              new Edge(n7,1),
              new Edge(n8,1),
              new Edge(n1,1),
              new Edge(n10,1),
              new Edge(n11,1),
              new Edge(n12,1),
              new Edge(n13,1),
              new Edge(n14,1),
              new Edge(n15,1),
      };
      n10.adjacencies = new Edge[]{
              new Edge(n0,1),
              new Edge(n2,1),
              new Edge(n3,1),
              new Edge(n4,1),
              new Edge(n5,1),
              new Edge(n6,1),
              new Edge(n7,1),
              new Edge(n8,1),
              new Edge(n1,1),
              new Edge(n9,1),
              new Edge(n11,1),
              new Edge(n12,1),
              new Edge(n13,1),
              new Edge(n14,1),
              new Edge(n15,1),
      };
      n11.adjacencies = new Edge[]{
              new Edge(n0,1),
              new Edge(n2,1),
              new Edge(n3,1),
              new Edge(n4,1),
              new Edge(n5,1),
              new Edge(n6,1),
              new Edge(n7,1),
              new Edge(n8,1),
              new Edge(n1,1),
              new Edge(n10,1),
              new Edge(n9,1),
              new Edge(n12,1),
              new Edge(n13,1),
              new Edge(n14,1),
              new Edge(n15,1),
      };

      n13.adjacencies = new Edge[]{
              new Edge(n0,1),
              new Edge(n2,1),
              new Edge(n3,1),
              new Edge(n4,1),
              new Edge(n5,1),
              new Edge(n6,1),
              new Edge(n7,1),
              new Edge(n8,1),
              new Edge(n1,1),
              new Edge(n10,1),
              new Edge(n11,1),
              new Edge(n12,1),
              new Edge(n9,1),
              new Edge(n14,1),
              new Edge(n15,1),
      };
      n14.adjacencies = new Edge[]{
              new Edge(n0,1),
              new Edge(n2,1),
              new Edge(n3,1),
              new Edge(n4,1),
              new Edge(n5,1),
              new Edge(n6,1),
              new Edge(n7,1),
              new Edge(n8,1),
              new Edge(n1,1),
              new Edge(n10,1),
              new Edge(n11,1),
              new Edge(n12,1),
              new Edge(n13,1),
              new Edge(n9,1),
              new Edge(n15,1),
      };
      n15.adjacencies = new Edge[]{
              new Edge(n0,1),
              new Edge(n2,1),
              new Edge(n3,1),
              new Edge(n4,1),
              new Edge(n5,1),
              new Edge(n6,1),
              new Edge(n7,1),
              new Edge(n8,1),
              new Edge(n1,1),
              new Edge(n10,1),
              new Edge(n11,1),
              new Edge(n12,1),
              new Edge(n13,1),
              new Edge(n14,1),
              new Edge(n9,1),
      };

      n12.adjacencies = new Edge[]{
              new Edge(n16,1),
              new Edge(n17,1),
              new Edge(n18,1),
              new Edge(n19,1),
              new Edge(n20,1),
              new Edge(n21,1),
              new Edge(n22,1),
              new Edge(n23,1),
              new Edge(n24,1),
              new Edge(n25,1),
              new Edge(n26,1),
              new Edge(n27,1),
              new Edge(n28,1),
              new Edge(n29,1),
              new Edge(n30,1),
              new Edge(n31,1),
              new Edge(n32,1),
      };
      n16.adjacencies = new Edge[]{
              new Edge(n17,1),
              new Edge(n18,1),
              new Edge(n19,1),
              new Edge(n20,1),
              new Edge(n21,1),
              new Edge(n22,1),
              new Edge(n23,1),
              new Edge(n24,1),
              new Edge(n25,1),
              new Edge(n26,1),
              new Edge(n27,1),
              new Edge(n28,1),
              new Edge(n29,1),
              new Edge(n30,1),
              new Edge(n31,1),
              new Edge(n32,1),
      };
      n17.adjacencies = new Edge[]{
              new Edge(n16,1),
              new Edge(n18,1),
              new Edge(n19,1),
              new Edge(n20,1),
              new Edge(n21,1),
              new Edge(n22,1),
              new Edge(n23,1),
              new Edge(n24,1),
              new Edge(n25,1),
              new Edge(n26,1),
              new Edge(n27,1),
              new Edge(n28,1),
              new Edge(n29,1),
              new Edge(n30,1),
              new Edge(n31,1),
              new Edge(n32,1),
      };
      n19.adjacencies = new Edge[]{
              new Edge(n16,1),
              new Edge(n17,1),
              new Edge(n18,1),
              new Edge(n20,1),
              new Edge(n21,1),
              new Edge(n22,1),
              new Edge(n23,1),
              new Edge(n24,1),
              new Edge(n25,1),
              new Edge(n26,1),
              new Edge(n27,1),
              new Edge(n28,1),
              new Edge(n29,1),
              new Edge(n30,1),
              new Edge(n31,1),
              new Edge(n32,1),
      };
      n20.adjacencies = new Edge[]{
              new Edge(n16,1),
              new Edge(n17,1),
              new Edge(n18,1),
              new Edge(n19,1),
              new Edge(n21,1),
              new Edge(n22,1),
              new Edge(n23,1),
              new Edge(n24,1),
              new Edge(n25,1),
              new Edge(n26,1),
              new Edge(n27,1),
              new Edge(n28,1),
              new Edge(n29,1),
              new Edge(n30,1),
              new Edge(n31,1),
              new Edge(n32,1),
      };
      n21.adjacencies = new Edge[]{
              new Edge(n16,1),
              new Edge(n17,1),
              new Edge(n18,1),
              new Edge(n19,1),
              new Edge(n20,1),

              new Edge(n22,1),
              new Edge(n23,1),
              new Edge(n24,1),
              new Edge(n25,1),
              new Edge(n26,1),
              new Edge(n27,1),
              new Edge(n28,1),
              new Edge(n29,1),
              new Edge(n30,1),
              new Edge(n31,1),
              new Edge(n32,1),
      };
      n22.adjacencies = new Edge[]{
              new Edge(n16,1),
              new Edge(n17,1),
              new Edge(n18,1),
              new Edge(n19,1),
              new Edge(n20,1),
              new Edge(n21,1),
              new Edge(n23,1),
              new Edge(n24,1),
              new Edge(n25,1),
              new Edge(n26,1),
              new Edge(n27,1),
              new Edge(n28,1),
              new Edge(n29,1),
              new Edge(n30,1),
              new Edge(n31,1),
              new Edge(n32,1),
      };
      n23.adjacencies = new Edge[]{
              new Edge(n16,1),
              new Edge(n17,1),
              new Edge(n18,1),
              new Edge(n19,1),
              new Edge(n20,1),
              new Edge(n21,1),
              new Edge(n22,1),
              new Edge(n24,1),
              new Edge(n25,1),
              new Edge(n26,1),
              new Edge(n27,1),
              new Edge(n28,1),
              new Edge(n29,1),
              new Edge(n30,1),
              new Edge(n31,1),
              new Edge(n32,1),
      };
      n24.adjacencies = new Edge[]{
              new Edge(n16,1),
              new Edge(n17,1),
              new Edge(n18,1),
              new Edge(n19,1),
              new Edge(n20,1),
              new Edge(n21,1),
              new Edge(n22,1),
              new Edge(n23,1),
              new Edge(n25,1),
              new Edge(n26,1),
              new Edge(n27,1),
              new Edge(n28,1),
              new Edge(n29,1),
              new Edge(n30,1),
              new Edge(n31,1),
              new Edge(n32,1),
      };
      n25.adjacencies = new Edge[]{
              new Edge(n16,1),
              new Edge(n17,1),
              new Edge(n18,1),
              new Edge(n19,1),
              new Edge(n20,1),
              new Edge(n21,1),
              new Edge(n22,1),
              new Edge(n23,1),
              new Edge(n24,1),
              new Edge(n26,1),
              new Edge(n27,1),
              new Edge(n28,1),
              new Edge(n29,1),
              new Edge(n30,1),
              new Edge(n31,1),
              new Edge(n32,1),
      };
      n26.adjacencies = new Edge[]{
              new Edge(n16,1),
              new Edge(n17,1),
              new Edge(n18,1),
              new Edge(n19,1),
              new Edge(n20,1),
              new Edge(n21,1),
              new Edge(n22,1),
              new Edge(n23,1),
              new Edge(n24,1),
              new Edge(n25,1),
              new Edge(n27,1),
              new Edge(n28,1),
              new Edge(n29,1),
              new Edge(n30,1),
              new Edge(n31,1),
              new Edge(n32,1),
      };
      n27.adjacencies = new Edge[]{
              new Edge(n16,1),
              new Edge(n17,1),
              new Edge(n18,1),
              new Edge(n19,1),
              new Edge(n20,1),
              new Edge(n21,1),
              new Edge(n22,1),
              new Edge(n23,1),
              new Edge(n24,1),
              new Edge(n25,1),
              new Edge(n26,1),
              new Edge(n28,1),
              new Edge(n29,1),
              new Edge(n30,1),
              new Edge(n31,1),
              new Edge(n32,1),
      };
      n28.adjacencies = new Edge[]{
              new Edge(n16,1),
              new Edge(n17,1),
              new Edge(n18,1),
              new Edge(n19,1),
              new Edge(n20,1),
              new Edge(n21,1),
              new Edge(n22,1),
              new Edge(n23,1),
              new Edge(n24,1),
              new Edge(n25,1),
              new Edge(n26,1),
              new Edge(n27,1),
              new Edge(n29,1),
              new Edge(n30,1),
              new Edge(n31,1),
              new Edge(n32,1),
      };
      n29.adjacencies = new Edge[]{
              new Edge(n16,1),
              new Edge(n17,1),
              new Edge(n18,1),
              new Edge(n19,1),
              new Edge(n20,1),
              new Edge(n21,1),
              new Edge(n22,1),
              new Edge(n23,1),
              new Edge(n24,1),
              new Edge(n25,1),
              new Edge(n26,1),
              new Edge(n27,1),
              new Edge(n28,1),
              new Edge(n30,1),
              new Edge(n31,1),
              new Edge(n32,1),
      };
      n30.adjacencies = new Edge[]{
              new Edge(n16,1),
              new Edge(n17,1),
              new Edge(n18,1),
              new Edge(n19,1),
              new Edge(n20,1),
              new Edge(n21,1),
              new Edge(n22,1),
              new Edge(n23,1),
              new Edge(n24,1),
              new Edge(n25,1),
              new Edge(n26,1),
              new Edge(n27,1),
              new Edge(n28,1),
              new Edge(n29,1),
              new Edge(n31,1),
              new Edge(n32,1),
      };
      n31.adjacencies = new Edge[]{
              new Edge(n16,1),
              new Edge(n17,1),
              new Edge(n18,1),
              new Edge(n19,1),
              new Edge(n20,1),
              new Edge(n21,1),
              new Edge(n22,1),
              new Edge(n23,1),
              new Edge(n24,1),
              new Edge(n25,1),
              new Edge(n26,1),
              new Edge(n27,1),
              new Edge(n28,1),
              new Edge(n29,1),
              new Edge(n30,1),
              new Edge(n32,1),
      };
      n32.adjacencies = new Edge[]{
              new Edge(n16,1),
              new Edge(n17,1),
              new Edge(n18,1),
              new Edge(n19,1),
              new Edge(n20,1),
              new Edge(n21,1),
              new Edge(n22,1),
              new Edge(n23,1),
              new Edge(n24,1),
              new Edge(n25,1),
              new Edge(n26,1),
              new Edge(n27,1),
              new Edge(n28,1),
              new Edge(n29,1),
              new Edge(n30,1),
              new Edge(n31,1),
      };


      n18.adjacencies = new Edge[]{
              new Edge(n33,1),
              new Edge(n34,1),
              new Edge(n35,1),
              new Edge(n36,1),
              new Edge(n37,1),
              new Edge(n38,1),
              new Edge(n39,1),
              new Edge(n40,1),
              new Edge(n41,1),
              new Edge(n42,1),
              new Edge(n43,1),
              new Edge(n44,1),
              new Edge(n45,1),
              new Edge(n46,1),
              new Edge(n47,1),

      };
      n33.adjacencies = new Edge[]{

              new Edge(n34,1),
              new Edge(n35,1),
              new Edge(n36,1),
              new Edge(n37,1),
              new Edge(n38,1),
              new Edge(n39,1),
              new Edge(n40,1),
              new Edge(n41,1),
              new Edge(n42,1),
              new Edge(n43,1),
              new Edge(n44,1),
              new Edge(n45,1),
              new Edge(n46,1),
              new Edge(n47,1),

      };
      n34.adjacencies = new Edge[]{
              new Edge(n33,1),
              new Edge(n35,1),
              new Edge(n36,1),
              new Edge(n37,1),
              new Edge(n38,1),
              new Edge(n39,1),
              new Edge(n40,1),
              new Edge(n41,1),
              new Edge(n42,1),
              new Edge(n43,1),
              new Edge(n44,1),
              new Edge(n45,1),
              new Edge(n46,1),
              new Edge(n47,1),

      };
      n35.adjacencies = new Edge[]{
              new Edge(n33,1),
              new Edge(n34,1),
              new Edge(n36,1),
              new Edge(n37,1),
              new Edge(n38,1),
              new Edge(n39,1),
              new Edge(n40,1),
              new Edge(n41,1),
              new Edge(n42,1),
              new Edge(n43,1),
              new Edge(n44,1),
              new Edge(n45,1),
              new Edge(n46,1),
              new Edge(n47,1),

      };
      n36.adjacencies = new Edge[]{
              new Edge(n33,1),
              new Edge(n34,1),
              new Edge(n35,1),
              new Edge(n37,1),
              new Edge(n38,1),
              new Edge(n39,1),
              new Edge(n40,1),
              new Edge(n41,1),
              new Edge(n42,1),
              new Edge(n43,1),
              new Edge(n44,1),
              new Edge(n45,1),
              new Edge(n46,1),
              new Edge(n47,1),

      };
      n37.adjacencies = new Edge[]{
              new Edge(n33,1),
              new Edge(n34,1),
              new Edge(n35,1),
              new Edge(n36,1),
              new Edge(n38,1),
              new Edge(n39,1),
              new Edge(n40,1),
              new Edge(n41,1),
              new Edge(n42,1),
              new Edge(n43,1),
              new Edge(n44,1),
              new Edge(n45,1),
              new Edge(n46,1),
              new Edge(n47,1),

      };
      n38.adjacencies = new Edge[]{
              new Edge(n33,1),
              new Edge(n34,1),
              new Edge(n35,1),
              new Edge(n36,1),
              new Edge(n37,1),
              new Edge(n39,1),
              new Edge(n40,1),
              new Edge(n41,1),
              new Edge(n42,1),
              new Edge(n43,1),
              new Edge(n44,1),
              new Edge(n45,1),
              new Edge(n46,1),
              new Edge(n47,1),

      };
      n39.adjacencies = new Edge[]{
              new Edge(n33,1),
              new Edge(n34,1),
              new Edge(n35,1),
              new Edge(n36,1),
              new Edge(n37,1),
              new Edge(n38,1),
              new Edge(n40,1),
              new Edge(n41,1),
              new Edge(n42,1),
              new Edge(n43,1),
              new Edge(n44,1),
              new Edge(n45,1),
              new Edge(n46,1),
              new Edge(n47,1),

      };
      n41.adjacencies = new Edge[]{
              new Edge(n33,1),
              new Edge(n34,1),
              new Edge(n35,1),
              new Edge(n36,1),
              new Edge(n37,1),
              new Edge(n38,1),
              new Edge(n39,1),
              new Edge(n40,1),
              new Edge(n42,1),
              new Edge(n43,1),
              new Edge(n44,1),
              new Edge(n45,1),
              new Edge(n46,1),
              new Edge(n47,1),

      };
      n42.adjacencies = new Edge[]{
              new Edge(n33,1),
              new Edge(n34,1),
              new Edge(n35,1),
              new Edge(n36,1),
              new Edge(n37,1),
              new Edge(n38,1),
              new Edge(n39,1),
              new Edge(n40,1),
              new Edge(n41,1),
              new Edge(n43,1),
              new Edge(n44,1),
              new Edge(n45,1),
              new Edge(n46,1),
              new Edge(n47,1),

      };
      n43.adjacencies = new Edge[]{
              new Edge(n33,1),
              new Edge(n34,1),
              new Edge(n35,1),
              new Edge(n36,1),
              new Edge(n37,1),
              new Edge(n38,1),
              new Edge(n39,1),
              new Edge(n40,1),
              new Edge(n41,1),
              new Edge(n42,1),
              new Edge(n44,1),
              new Edge(n45,1),
              new Edge(n46,1),
              new Edge(n47,1),

      };
      n44.adjacencies = new Edge[]{
              new Edge(n33,1),
              new Edge(n34,1),
              new Edge(n35,1),
              new Edge(n36,1),
              new Edge(n37,1),
              new Edge(n38,1),
              new Edge(n39,1),
              new Edge(n40,1),
              new Edge(n41,1),
              new Edge(n42,1),
              new Edge(n43,1),
              new Edge(n45,1),
              new Edge(n46,1),
              new Edge(n47,1),

      };
      n45.adjacencies = new Edge[]{
              new Edge(n33,1),
              new Edge(n34,1),
              new Edge(n35,1),
              new Edge(n36,1),
              new Edge(n37,1),
              new Edge(n38,1),
              new Edge(n39,1),
              new Edge(n40,1),
              new Edge(n41,1),
              new Edge(n42,1),
              new Edge(n43,1),
              new Edge(n44,1),
              new Edge(n46,1),
              new Edge(n47,1),

      };
      n46.adjacencies = new Edge[]{
              new Edge(n33,1),
              new Edge(n34,1),
              new Edge(n35,1),
              new Edge(n36,1),
              new Edge(n37,1),
              new Edge(n38,1),
              new Edge(n39,1),
              new Edge(n40,1),
              new Edge(n41,1),
              new Edge(n42,1),
              new Edge(n43,1),
              new Edge(n44,1),
              new Edge(n45,1),
              new Edge(n47,1),

      };
      n47.adjacencies = new Edge[]{
              new Edge(n33,1),
              new Edge(n34,1),
              new Edge(n35,1),
              new Edge(n36,1),
              new Edge(n37,1),
              new Edge(n38,1),
              new Edge(n39,1),
              new Edge(n40,1),
              new Edge(n41,1),
              new Edge(n42,1),
              new Edge(n43,1),
              new Edge(n44,1),
              new Edge(n45,1),
              new Edge(n46,1),

      };
      n40.adjacencies = new Edge[]{
              new Edge(n55,1),

      };
      n55.adjacencies = new Edge[]{
              new Edge(n40,1),
      };
 // n1 is node source and n55 is destination
      Heuristic(n1,n55);

      List<Node> path = printPath(n55);

      System.out.println(Color.RESET +"Path: " + path);
      System.out.println("This is Number Of Node are Visited" + " ["  + path.size() + "]");
      utils.getMove(Plan.plan ,2,7);
   }

}
