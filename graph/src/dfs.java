import java.util.*;
public class dfs {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> dfsAns = new ArrayList<>();
        boolean[] vis = new boolean[V];
        dfs(0, vis, adj, dfsAns);
        return dfsAns;
    }
    private static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfsAns){
        vis[node] = true;
        dfsAns.add(node);

        //getting neigbour nodes
        for(var e : adj.get(node)){
            if(vis[e] != true){
                dfs(e,vis,adj,dfsAns);
            }
        }
    }
}
