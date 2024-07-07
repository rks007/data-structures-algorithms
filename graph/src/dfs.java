import java.util.*;
public class dfs {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) { //try to solve this using stack
        // Code here
        ArrayList<Integer> dfsAns = new ArrayList<>();
        boolean[] vis = new boolean[V];
        dfs(0, vis, adj, dfsAns);
        return dfsAns;
    }
    private static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfsAns){//dry run for better understanding
        vis[node] = true;
        dfsAns.add(node);

        //getting neigbour nodes
        for(var e : adj.get(node)){
            if(vis[e] != true){
                dfs(e,vis,adj,dfsAns); //recursion
            }
        }
    }
}
