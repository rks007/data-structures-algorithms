import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
------------------------------------Explanation-----------------------------

Cycle Detection in Undirected Graph using BFS
Class: Solution

Nested Class: Pair
Holds a node (first) and its parent (second).
Method: isCycle

Parameters: int V (number of vertices), ArrayList<ArrayList<Integer>> adj (adjacency list).
Initializes a vis array to track visited nodes.
Uses a BFS approach with a queue q.
Iterates through all nodes. If a node hasn't been visited, calls detectCycle to check for cycles from that node.
Method: detectCycle

Parameters: int node, boolean[] vis, Queue<Pair> q, ArrayList<ArrayList<Integer>> adj.
Marks the starting node as visited and adds it to the queue with -1 as its parent.
While the queue is not empty:
Processes each node's adjacent nodes:
If an adjacent node is not visited, marks it as visited and adds it to the queue with the current node as its parent.
If an adjacent node is visited and is not the parent of the current node, a cycle is detected.
Returns true if a cycle is found, otherwise false.
Key Point:

Correctly updates the parent node when adding nodes to the queue to ensure accurate cycle detection.

*/

public class detectCycleUndirectedBfs {
    public static class Pair{
        int first;//we store the current node at which we are standing at
        int second;//we store the parent node i.e. from which node we have come to this current node

        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }

    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {//main function
        // Code here
        boolean[] vis = new boolean[V];
        Queue<Pair> q = new LinkedList<>();

        for(int i = 0; i < V; i++){// doing this because of disconnected graph can also be there in the input
            if(vis[i] == false){
                if(detectCycle(i, vis, q, adj)){
                    return true;
                }
            }
        }
        return false;

    }
    private static boolean detectCycle(int node, boolean[] vis, Queue<Pair> q, ArrayList<ArrayList<Integer>> adj){
        vis[node] = true;
        q.add(new Pair(node, -1));

        while(!q.isEmpty()){
            int vertex = q.peek().first;
            int parent = q.peek().second;
            q.remove();

            for(var e : adj.get(vertex)){

                if(vis[e] != true){
                    vis[e] = true;
                    q.add(new Pair(e, vertex));
                }
                // if adjacent node is visited and is not its own parent node
                else if(parent != e){
                    return true;
                }
            }
        }
        return false;
    }
}
