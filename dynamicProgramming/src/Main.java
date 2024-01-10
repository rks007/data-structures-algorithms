public class Main {
    static int calls = 0; //just checking difference btw normal recursion and memoization

    private static int fibbo(int n,int[] dp){
        if (n == 1 || n == 0){
            return 1;
        }


        if (dp[n] != -1){//check
            return dp[n];
        }

        calls++;
        int result = fibbo(n - 1,dp) + fibbo(n - 2,dp);
        dp[n] = result;

        return result;
    }
    public static void main(String[] args) {
        int n = 60;
        int[] dp = new int[n + 1];
        for (int i = 0;i <= n;i++){
            dp[i] = -1;
        }
        int ans = fibbo(n,dp);
        System.out.println(ans);
        System.out.println("calls = "+calls);
    }
}