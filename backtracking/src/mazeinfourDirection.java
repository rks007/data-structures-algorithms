public class mazeinfourDirection {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        boolean[][] isVisited = new boolean[rows][cols]; //by default all blocks are filled with false in java
        print(0,0,rows - 1,cols - 1,"",isVisited);

    }
    public static void print(int sr,int sc,int er,int ec,String s,boolean[][] isVisited){
        if (sr < 0 || sc < 0) return;
        if (sr > er || sc > ec) return;
        if (isVisited[sr][sc] == true) return;; //imp base case
        if (sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        //downways
        print(sr + 1,sc,er,ec,s + "D",isVisited);
        //rightways
        print(sr,sc + 1,er,ec,s + "R",isVisited);
        //leftways
        print(sr,sc - 1,er,ec,s+"L",isVisited);
        //upways
        print(sr - 1,sc,er,ec,s+"U",isVisited);
        //bactracking
        isVisited[sr][sc] = false;

    }
}
