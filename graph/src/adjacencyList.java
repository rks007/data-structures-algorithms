import java.util.ArrayList;
import java.util.Scanner;

public class adjacencyList {
    public static void main(String[] args) { //time complexity 0(v + e) and same space complexity in worst case of complete graph the tc = 0(v square)
        Scanner sc = new Scanner(System.in);
        int vertex = sc.nextInt();
        int edges = sc.nextInt();

        ArrayList<Integer> adjList[] = new ArrayList[vertex];
        for(int i = 0; i < vertex; i++){//ensure that each element of the adjList array is initialized to a new ArrayList<>() before attempting to add edges.
            adjList[i] = new ArrayList<>();
        }

        int u, v;

        for(int i = 0; i < edges; i++){

            u = sc.nextInt();
            v = sc.nextInt();

            adjList[u].add(v);
            adjList[v].add(u);
        }

        //print the list
        for(int i = 0; i < vertex ;i++){
            System.out.print(i + " -> ");
            for (int j = 0; j < adjList[i].size(); j++){
                System.out.print(adjList[i].get(j) + " ");
            }
            System.out.println();
        }

    }
}

//input type
//5
//6
//0 1
//0 4
//1 2
//1 3
//1 4
//3 4

