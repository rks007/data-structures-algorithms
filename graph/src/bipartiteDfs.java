import java.util.ArrayList;

public class bipartiteDfs {
    public static void main(String[] args) {
        class Solution {
            public boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj) {
                int[] color = new int[V];
                // Initialize color array with -1 (no color)
                for (int i = 0; i < V; i++) {
                    color[i] = -1;
                }

                // Check each node if it's not colored
                for (int i = 0; i < V; i++) {
                    if (color[i] == -1) {
                        // Start DFS from this node
                        if (!dfs(i, 0, color, adj)) {
                            return false;
                        }
                    }
                }

                return true; // All nodes colored successfully
            }

            private static boolean dfs(int node, int col, int[] color, ArrayList<ArrayList<Integer>> adj) {
                color[node] = col; // Color the node

                for (int neighbor : adj.get(node)) {
                    if (color[neighbor] == -1) {
                        // Recursively color the adjacent nodes with the opposite color
                        if (!dfs(neighbor, 1 - col, color, adj)) {
                            return false;
                        }
                    } else if (color[neighbor] == col) {
                        // If the adjacent node has the same color, graph is not bipartite
                        return false;
                    }
                }
                return true; // Successfully colored
            }
        }

    }
}
/*
Checking if a Graph is Bipartite using DFS in Java
Concept:
A graph is bipartite if it can be colored using two colors such that no two adjacent nodes have the same color.

Approach:

Initialization:

Create a color array of size V (number of vertices) initialized to -1, indicating that no node is initially colored.
DFS for Coloring:

For each uncolored node, use DFS to try to color the graph starting from that node.
If a node can be colored without conflicts, continue; otherwise, return false.
DFS Function:

Color the current node and attempt to color all its adjacent nodes with the opposite color.
If an adjacent node is already colored with the same color, the graph is not bipartite.
 */
