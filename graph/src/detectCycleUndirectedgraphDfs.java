import java.util.ArrayList;

/*
--------------------------------Explanation of the Cycle Detection Code in an Undirected Graph------------------------------------
Purpose:
This code detects cycles in an undirected graph using Depth-First Search (DFS).

Classes and Methods:

Solution Class:

isCycle(int V, ArrayList<ArrayList<Integer>> adj) Method:
 Takes the number of vertices V and an adjacency list adj as inputs.
 Initializes a boolean array vis to track visited nodes.
 Iterates over each node. If a node hasn't been visited, it calls detectCycleDfs.
 If detectCycleDfs returns true for any node, a cycle is detected, and true is returned.
 If no cycles are detected after checking all nodes, false is returned.

detectCycleDfs(int node, int parent, boolean[] vis, ArrayList<ArrayList<Integer>> adj) Method:
 A helper method to perform DFS and detect cycles.
 Marks the current node as visited.
 Iterates over all adjacent nodes.
 If an adjacent node hasn't been visited, it recursively calls detectCycleDfs with the adjacent node.
 If an adjacent node is visited and isn't the parent of the current node, a cycle is detected, and true is returned.
 If no cycles are found, false is returned.

Usage:

This code can be used to check if an undirected graph contains any cycles.
Suitable for graph-based problems and algorithms that require cycle detection.

*/

public class detectCycleUndirectedgraphDfs {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] vis = new boolean[V];

        for(int i = 0; i < V; i++){//doing this for disconnected graph
            if(vis[i] != true){
                if(detectCycleDfs(i, -1, vis, adj)){
                    return true;
                }
            }
        }
        return false;

    }

    private static boolean detectCycleDfs(int node, int parent, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[node] = true;

        for(var e : adj.get(node)){
            if(vis[e] != true){
                if(detectCycleDfs(e, node, vis, adj)){
                    return true;
                }
            }
            else if(e != parent){
                return true;
            }
        }
        return false;
    }
}
