import java.util.Scanner;

public class adjMatrix {
    public static void main(String[] args) { //time complexity= 0(vsquare), space complexity is also same

        Scanner sc = new Scanner(System.in);
        int vertex = sc.nextInt();//if vertex is 5 then we will consider it like 0,1,2,3,4
        int edges = sc.nextInt();

        int u, v;
        int[][] adjMat = new int[vertex][vertex];

        for (int i = 0; i < edges; i++){

            u = sc.nextInt();
            v = sc.nextInt();

            adjMat[u][v] = 1;
            adjMat[v][u] = 1;

        }

        for (int i = 0; i < vertex; i++){
            for (int j = 0; j< vertex; j++){
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }

}

//how to give input in the terminal
//            5
//            6
//            0 1
//            0 2
//            1 2
//            1 3
//            2 4
//            3 4
