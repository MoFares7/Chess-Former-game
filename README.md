Chess Former game

first mode is userPlay,
second mode is DFS,
third mode is BFS,
fourth mode is Dijkstra,
five mode is A star.

now explan about how to solve:

firstly, in dfs and bfs, Dijkstra we depended on plan or border we start search from node source is 1 or n1 to node detination is 55 or n55
in addition 12 or n12 is hole and 18 or n18 is hole and 40 or n40 also hole
This is a Plan or Border we solve her

    plan = {

            {'_','R','_','_','_','_','_','_','_','_','_','_','     ','_','_','_',},
            {'_','_','     ','_','_','_','_','_','_','_','_','_','_','_','_','_',},
            {'_','_','_','_','_','_','_','    ','_','_','_','_','_','_','_','_',},
            {'_','_','_','_','_','_','_','K','_','_','_','_','_','_','_','_',},
    };

     plan =
     {
            {0 ,1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10,11,12,13,14,15},
            {16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
            {32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47},
            {48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63}
    };

and in Astar algo we depende on huristic function to find short Path in algo is also depende on explan in above
I am write tow way to solve in Astar algo
but I am assign optimal can you reed to way in code.
 
                                                                 
