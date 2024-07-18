import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class bipartiteBfs {
    //the graph which can be colored with two colors and no adjacent nodes are of same color is known as bipartite graph
    //all linear non-cyclic graph are bipartite
    //if a graph has cycle then the cycle part of the graph should have even number of edges to be a bipartite graph
    //if cycle component edges are not in even number then it is not an bipartite graph

    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] color = new int[V];
        Arrays.fill(color, -1); // Initialize all nodes as uncolored

        for (int i = 0; i < V; i++) {//checking for disconnected components
            if (color[i] == -1) { // If the node is uncolored, perform BFS
                if (!bfs(i, color, adj)) { // If BFS finds a non-bipartite component, return false
                    return false;
                }
            }
        }
        return true; // If all components are bipartite, return true
    }

    private static boolean bfs(int startNode, int[] color, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();

        color[startNode] = 0; // Start coloring the start node with color 0

        q.add(startNode);

        while (!q.isEmpty()) {

            int node = q.remove();

            for (int neighbor : adj.get(node)) {
                if (color[neighbor] == -1) { // If the neighbor is uncolored
                    color[neighbor] = 1 - color[node]; // Color it with the opposite color
                    q.add(neighbor);
                }
                else if (color[neighbor] == color[node]) { // If the neighbor has the same color
                    return false; // The graph is not bipartite
                }
            }
        }
        return true; // The component is bipartite
    }
}
/*
This solution checks if a given graph is bipartite using BFS.

Key Concepts:
Bipartite Graph: A graph that can be colored using two colors such that no two adjacent vertices share the same color.
BFS (Breadth-First Search): A graph traversal algorithm that explores all neighbors at the present depth level before moving on to nodes at the next depth level.
Algorithm Steps:
Initialization:

Use an array color of size V (number of vertices) initialized to -1 to denote uncolored nodes.
BFS Traversal:

For each uncolored vertex, start a BFS.
Color the starting vertex with 0.
Coloring and Checking:

For each vertex, color all its uncolored neighbors with the opposite color.
If a neighbor is already colored with the same color as the current vertex, the graph is not bipartite.
Result:

If BFS traversal finds any component that is not bipartite, return false.
If all components are bipartite, return true.
 */
