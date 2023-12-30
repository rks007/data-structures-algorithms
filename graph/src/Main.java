import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static class Edge{
        int src;
        int dest;

        public Edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0;i < graph.length;i++){ //vimp to write other wise it will throw null pointer exception
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,2));

    }
    public static void main(String[] args) {
        int v = 4; //number of vertex

        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);//calling the function to create the graph

        //print 2 ke neighbour
        for (int i = 0;i < graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.print(e.dest+" ");
        }
        System.out.println();
        System.out.println("output for Arraylist of Arraylist method or without class method");
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int vertices = 3;
        constructGraph(adj,vertices);

        //print all the edges
        for (int i = 1;i <= vertices;i++){
            for (int j = 0;j < adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    private static void constructGraph(ArrayList<ArrayList<Integer>> adj,int vertices) {
        //n + 1
        for (int i = 0; i <= vertices;i++){
            adj.add(new ArrayList<Integer>());
        }

        //edge 1---2
        adj.get(1).add(2);
        adj.get(2).add(1);

        //edge 2---3
        adj.get(2).add(3);
        adj.get(3).add(2);

        //edge 1---3
        adj.get(1).add(3);
        adj.get(3).add(1);

    }
}