import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class topologicalSortBfs {

    //Function to return list containing vertices in Topological order.
    private static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {

        int[] inDegree = new int[V];
        for(int i = 0;i < V; i++){
            for(var e : adj.get(i)){
                inDegree[e]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < V; i++){
            if(inDegree[i] == 0){
                q.add(i);
            }
        }

        int[] topo = new int[V];
        int i = 0;
        while(!q.isEmpty()){
            int node = q.remove();
            topo[i] = node;
            i++;

            for(var e : adj.get(node)){
                inDegree[e]--;
                if(inDegree[e] == 0){
                    q.add(e);
                }
            }

        }

        return topo;
    }
}
/*

Explanation:
Initialization:

inDegree: An array to keep track of the in-degree (number of incoming edges) for each vertex.
q: A queue to manage vertices with in-degree of 0 (no dependencies).
topo: An array to store the topological ordering of vertices.
Calculating In-Degree:

Loop through each vertex and its adjacency list to calculate the in-degree for each vertex.
Adding Vertices with Zero In-Degree to Queue:

Add all vertices with in-degree 0 to the queue. These vertices do not depend on any other vertices.
Processing Vertices:

While the queue is not empty:
Remove a vertex from the queue, add it to the topo array.
Decrease the in-degree of all its adjacent vertices.
If an adjacent vertex’s in-degree becomes 0, add it to the queue.
Returning the Result:

The topo array will contain the vertices in topological order.
 */
