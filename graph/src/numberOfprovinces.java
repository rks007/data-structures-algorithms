import java.util.*;
public class numberOfprovinces { //leetcode 547 and gfg
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {

        ArrayList<ArrayList<Integer>> adjls = new ArrayList<>();
        for(int i = 0;i < V;i++){//you have done this in implementation of graph part
            adjls.add(new ArrayList<Integer>());
        }

        for(int i = 0;i < V;i++){ //creating adjaceny list from the matrix given in the question
            for(int j = 0;j < V;j++){
                if(adj.get(i).get(j) == 1 && i != j){ // equals to 1 because 1 means connection and make sure i and j are unique values
                    adjls.get(i).add(j);
                    adjls.get(j).add(i);
                }
            }
        }

        boolean[] vis = new boolean[V];
        int count = 0;
        for(int i = 0;i < V;i++){
            if(vis[i] != true){
                dfs(i, adjls, vis);
                count++;
            }
        }
        return count;
    }
    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjls, boolean[] vis){
        vis[node] = true;
        for(var e : adjls.get(node)){
            if(vis[e] != true){
                dfs(e, adjls, vis);
            }
        }
    }
}
