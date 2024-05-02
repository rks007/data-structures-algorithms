public class frogJump {
    public static void main(String[] args) {
        int[] arr = {10,30,40,50,20};
        int n = arr.length;
        int k = 3;
        int[] dp = new int[n];
        for (int i = 0;i < n;i++){
            dp[i] = -1;
        }
        System.out.println(minimumcost(arr, n - 1, k, dp));
    }

    private static int minimumcost(int[] arr,int idx,int k, int[] dp) {//k is the maximum jump you can take
        if (idx == 0){
            return 0;
        }

        if (dp[idx] != -1){
            return dp[idx];
        }

        int minCost = Integer.MAX_VALUE;

        for (int j = 1;j <= k;j++){
            if (j <= idx){
                int jump = Math.abs(arr[idx] - arr[idx - j]) + minimumcost(arr,idx - j, k, dp);
                minCost = Math.min(minCost,jump);
            }
        }
        return dp[idx] = minCost;
    }
}
