import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
explanation

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

        for(int i = 0; i < V; i++){
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
