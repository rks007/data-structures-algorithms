public class longestCommonSubsequence {
    private static int lcs(String s1, String s2, int i, int j,int[][] dp){ //dry run for better understanding
        if (i < 0 || j < 0){//base case for pointer going out of bound
            return 0;
        }

        if (dp[i][j] != -1){
            return dp[i][j];
        }

        if (s1.charAt(i) == s2.charAt(j)){//if letter matched from both strings

            return dp[i][j] = 1 + lcs(s1,s2,i - 1,j - 1,dp);// adding 1 is for that it indicating that we got one matching letter now again apply recursion and find others
        }
        else {//if not matched

            return dp[i][j] = Math.max(lcs(s1,s2,i,j - 1,dp), lcs(s1,s2,i - 1,j,dp));//check if i and j is not matched then search in the first string for matching letter or check in the second string for matching letter and returned the longest sequence
        }
    }
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n][m];
        for (int i = 0;i < n;i++){
            for (int j = 0;j < m;j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(lcs(s1,s2,n - 1,m - 1,dp));
    }
}
