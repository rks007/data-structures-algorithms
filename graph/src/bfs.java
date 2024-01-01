import java.util.*;
public class bfs {
    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] vis = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);//because we have given that vertex number starts from 0
        vis[0] = true;

        while(!q.isEmpty()){
            Integer Node = q.remove();
            bfs.add(Node);

            //get all adjacent vertices of the removed node
            //mark adjacent visited, if not been visited earlier
            //then add it to the queue

            for(var e : adj.get(Node)){
                if(vis[e] != true){
                    vis[e] = true;
                    q.add(e);
                }
            }

        }
        return bfs;
    }
}
