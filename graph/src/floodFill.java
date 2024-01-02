public class floodFill { //leetcode 733 and gfg
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {

        int[][] ans = image;
        int initialcolor = image[sr][sc];
        int[] delrow = {-1, 0, +1, 0};
        int[] delcol = {0, +1, 0, -1};

        dfs(sr, sc, image, ans, initialcolor, newColor, delrow, delcol);

        return ans;
    }
    private static void dfs(int row, int col, int[][] image, int[][] ans, int initialcolor, int newColor, int[] delrow, int[] delcol){
        int n = image.length;
        int m = image[0].length;

        ans[row][col] = newColor;

        for(int i = 0;i < 4;i++){
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            if(nrow >= 0 && nrow < n && ncol >=0 && ncol < m && image[nrow][ncol] == initialcolor && ans[nrow][ncol] != newColor){
                dfs(nrow, ncol, image, ans, initialcolor, newColor, delrow, delcol);
            }
        }
    }
}
