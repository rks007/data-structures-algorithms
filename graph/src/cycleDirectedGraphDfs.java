import java.util.ArrayList;

public class cycleDirectedGraphDfs {

        // Function to detect cycle in a directed graph.
        public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
            // Create two boolean arrays to track visited nodes and nodes in the current path
            boolean[] vis = new boolean[V];
            boolean[] pathVis = new boolean[V];

            // Iterate through all nodes in the graph
            for (int i = 0; i < V; i++) {
                // If the node has not been visited, start a DFS check for cycle detection
                if (vis[i] != true) {
                    // If a cycle is detected during DFS, return true
                    if (dfsCheck(i, vis, pathVis, adj) == true) {
                        return true;
                    }
                }
            }
            // If no cycle is detected in the graph, return false
            return false;
        }

        // Helper function to perform DFS and check for cycles
        private static boolean dfsCheck(int node, boolean[] vis, boolean[] pathVis, ArrayList<ArrayList<Integer>> adj) {
            // Mark the current node as visited
            vis[node] = true;
            // Mark the current node as part of the current path
            pathVis[node] = true;

            // Iterate through all adjacent nodes (neighbors) of the current node
            for (var e : adj.get(node)) {
                // If the neighbor has not been visited, recursively perform DFS on it
                if (vis[e] != true) {
                    // If a cycle is detected in the recursive call, return true
                    if (dfsCheck(e, vis, pathVis, adj) == true) {
                        return true;
                    }
                }
                // If the neighbor is part of the current path, a cycle is detected
                else if (pathVis[e] == true) {
                    return true; // Cycle detected
                }
            }

            // Remove the current node from the current path (backtracking)
            pathVis[node] = false;
            // No cycle detected for this path
            return false;
        }

}

/*
Detecting a Cycle in a Directed Graph using DFS in Java
Concept:
To detect a cycle in a directed graph, we use Depth-First Search (DFS) along with two boolean arrays: one to track visited nodes and another to track nodes in the current recursion stack (path).

Approach:

Initialization:

vis array: Tracks whether a node has been visited. Initialized to false.
pathVis array: Tracks nodes in the current path (recursion stack) during DFS. Initialized to false.

Cycle Detection Logic:

For each unvisited node, start a DFS.
In the DFS function:
Mark the node as visited and part of the current path.
Recursively visit all adjacent nodes.
If an adjacent node is unvisited, recursively perform DFS on it.
If an adjacent node is already in the current path, a cycle is detected.
After exploring all adjacent nodes, remove the node from the current path (backtracking).
Return Results:

If any cycle is detected during DFS, return true.
If no cycles are detected after processing all nodes, return false.
 */
