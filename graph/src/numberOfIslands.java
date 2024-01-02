public class numberOfIslands { //gfg
    public int numIslands(char[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] vis = new boolean[n][m];
        int count = 0;

        for(int i = 0;i< n;i++){
            for(int j = 0;j < m;j++){
                if(vis[i][j] != true && grid[i][j] == '1'){
                    count++;
                    dfs(i, j, grid, vis);
                }
            }
        }
        return count;
    }
    private static void dfs(int row, int col, char[][] grid, boolean[][] vis){
        int n = grid.length;
        int m = grid[0].length;

        vis[row][col] = true;
        //check all the neighbours
        for(int i = -1;i <= 1;i++){ //imp trick
            for(int j = -1;j <= 1;j++){ //imp trick to check all the neigbours
                int nrow = row + i;
                int ncol = col + j;
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] != true && grid[nrow][ncol] == '1'){
                    dfs(nrow, ncol, grid, vis);
                }
            }
        }


    }

}
