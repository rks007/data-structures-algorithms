import java.util.ArrayList;
import java.util.Stack;

public class topologicalSortDfs { //gfg //notes are below

    //Function to return list containing vertices in Topological order.
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // add your code here
        boolean[] vis = new boolean[V];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < V; i++){
            if(vis[i] != true){
                dfs(i, vis, st, adj);
            }
        }

        int[] ans = new int[V];
        for(int i = 0; i < V; i++){
            ans[i] = st.pop();
        }

        return ans;
    }

    private static void dfs(int node, boolean[] vis, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj){
        vis[node] = true;

        for(var e : adj.get(node)){
            if(vis[e] != true){
                dfs(e, vis, st, adj);
            }
        }
        st.push(node);//imp step
    }
}

/*
Revision Notes: Topological Sorting using DFS in Java

Key Concepts
Graph Representation: The graph is represented using an adjacency list.
DFS Traversal: Depth-First Search is used to explore nodes.
Stack Usage: A stack is used to store the nodes in reverse order of their completion times (when all adjacent vertices are visited).
Steps
Initialize:

boolean[] vis to track visited nodes.
Stack<Integer> st to store nodes in topological order.

Main Logic:
Iterate through all vertices. If a vertex is unvisited, call the dfs function.
In the dfs function, mark the node as visited, recursively visit all its adjacent nodes, and push the node onto the stack.
Construct Result:

Pop elements from the stack to get the topological order and store them in the result array ans.
 */
