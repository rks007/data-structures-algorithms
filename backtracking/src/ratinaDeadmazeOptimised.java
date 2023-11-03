public class ratinaDeadmazeOptimised {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] maze = {{1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}
        };
        print(0,0,rows-1,cols-1,"",maze);
    }
    public static void print(int sr,int sc,int er,int ec,String s,int[][] maze){
        if (sr < 0 || sc < 0) return;
        if (sr > er || sc > ec) return;
        if (sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        if (maze[sr][sc]  == 0) return;
        if (maze[sr][sc] == -1) return; //already visited then return , 1 is not visited and -1 is visited symbol

        maze[sr][sc] = -1;//marking your path
        //rightways
        print(sr,sc + 1,er,ec,s + "R",maze);
        //downways
        print(sr + 1,sc,er,ec,s + "D",maze);
        //leftways
        print(sr,sc - 1,er,ec,s + "L",maze);
        //upways
        print(sr - 1,sc,er,ec,s + "U",maze);

        //backtracking
        maze[sr][sc] = 1;


    }
}
