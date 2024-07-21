import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class cycleDirectedGraphBfs {
    /*
    This approach uses Kahn's algorithm for Topological Sorting, which helps in detecting cycles in a directed graph.
    If a topological sort is not possible (i.e., not all vertices are processed), then the graph contains a cycle.
     */


        // Function to detect a cycle in a directed graph.
        public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {


            // Step 1: Initialize an array to store the indegree of each vertex.
            int[] indegree = new int[V];

            // Step 2: Calculate the indegree of each vertex.
            for (int i = 0; i < V; i++) {
                for (var e : adj.get(i)) {
                    indegree[e]++;  // Increment indegree for each incoming edge.
                }
            }

            // Step 3: Initialize a queue to store vertices with indegree 0.
            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < V; i++) {
                if (indegree[i] == 0) {
                    q.add(i);  // Add vertices with indegree 0 to the queue.
                }
            }

            // Step 4: Initialize a counter to keep track of the number of vertices processed.
            int count = 0;


            // Step 5: Process vertices in the queue.
            while (!q.isEmpty()) {
                int node = q.remove();  // Remove a vertex from the queue.
                count++;  // Increment the count of processed vertices.

                // Step 6: Decrease the indegree of adjacent vertices.
                for (var e : adj.get(node)) {
                    indegree[e]--;  // Decrease the indegree for each adjacent vertex.
                    if (indegree[e] == 0) {
                        q.add(e);  // Add vertex to queue if its indegree becomes 0.
                    }
                }
            }

            // Step 7: Check if all vertices were processed.
            // If count equals the number of vertices, the graph is acyclic.
            if (count == V) {
                return false;  // No cycle found.
            }

            // Step 8: If count is less than the number of vertices, there is a cycle.
            return true;  // Cycle found.


        }


}
