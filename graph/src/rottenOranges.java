import java.util.LinkedList;
import java.util.Queue;

public class rottenOranges {//leetcode 994 & gfg
    public class Pair{
        int row;
        int col;
        int time;

        public Pair(int row,int col,int time){
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }
    public static int orangesRotting(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int[][] ans = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        int count = 0;

        for (int i = 0;i < n;i++){
            for (int j = 0;j < m;j++){
                if (grid[i][j] == 2){
                    q.add(new Pair(i, j, 0));
                    ans[i][j] = 2;
                }
                else {
                    ans[i][j] == 0;
                }
                if(grid[i][j] == 1){//to have a count of fresh oranges
                    count++;
                }
            }
        }
        int[] delrow = {-1,0,+1,0};
        int[] delcol = {0,+1,0,-1};
        int totaltime = 0;
        int cnt = 0;
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().time;
            q.remove();
            totaltime = Math.max(totaltime,t);

            for(int i = 0;i < 4;i++){
                int nrow = r + delrow[i];
                int ncol = c + delcol[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && ans[nrow][ncol] == 0 && grid[nrow][ncol] == 1){
                    q.add(new Pair(nrow,ncol,t + 1));
                    ans[nrow][ncol] == 2;
                    cnt++;//keeping the count of fresh oranges we get to deal with
                }
            }
        }
        if (count != cnt){
            return -1;
        }
        return totaltime;
    }
}
