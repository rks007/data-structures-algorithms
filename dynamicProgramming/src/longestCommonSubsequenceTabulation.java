public class longestCommonSubsequenceTabulation {
    private static int lcs(String s1, String s2, int i, int j,int[][] dp){ //dry run
        if (i == 0 || j == 0){//base case for pointer going out of bound
            return 0;
        }

        if (dp[i][j] != -1){
            return dp[i][j];
        }

        if (s1.charAt(i - 1) == s2.charAt(j - 1)){
            return dp[i][j] = 1 + lcs(s1,s2,i - 1,j - 1,dp);// adding 1 is for that it indicating that we got one matching letter now again apply recursion and find others
        }
        return dp[i][j] = Math.max(lcs(s1,s2,i,j - 1,dp), lcs(s1,s2,i - 1,j,dp));//check if i and j is not matched then search in the first string for matching letter or check in the second string for matching letter and returned the longest sequence
    }
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0;i <= n;i++){//extracted from base condition
            dp[i][0] = 0;
        }
        for (int j = 0;j <= m;j++){//extracted from game condition
            dp[0][j] = 0;
        }

        for (int i = 1;i <= n;i++){
            for (int j = 1;j <= m;j++){

                if (s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];// adding 1 is for that it indicating that we got one matching letter now again apply recursion and find others
                }
                else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);//check if i and j is not matched then search in the first string for matching letter or check in the second string for matching letter and returned the longest sequence
                }
            }
        }

        System.out.println(dp[n][m]);
        //System.out.println(lcs(s1,s2,n ,m ,dp));
    }
}
