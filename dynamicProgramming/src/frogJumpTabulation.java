public class frogJumpTabulation {
    public static void main(String[] args) {
        int[] arr = {10,30,40,50,20};
        int n = arr.length;
        int k = 3;
        int[] dp = new int[n];
        dp[0] = 0;//extracted from base condition

        for (int idx = 1;idx < n;idx++){//starting from one because you have filled 0th index,thats why directly starting from second stone
            int minCost = Integer.MAX_VALUE;
            for (int j = 1;j <= k;j++){
                if (j <= idx){
                    int jump = Math.abs(arr[idx] - arr[idx - j]) + dp[idx - j];
                    minCost = Math.min(minCost,jump);
                }
            }
            dp[idx] = minCost;
        }

        System.out.println(dp[n - 1]);
    }

}
