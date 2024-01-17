import java.util.List;

public class knapSack {
    public static void main(String[] args) {
        List<Integer> profit = List.of(1,2,3);
        List<Integer> weight = List.of(4,5,1);
        int w = 4;//total knapsack weight
        int n = profit.size();
        int[][] dp = new int[n + 1][w + 1];
        for (int i = 0;i <= n;i++){
            for (int j = 0; j <= w;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(knapsack(n - 1,w,profit,weight, dp));
    }

    private static int knapsack(int idx, int w, List<Integer> profit, List<Integer> weight, int[][] dp) {
        if (idx == 0){//base condition
            if (weight.get(0) <= w){//if your item weight is less than the sack weigth then pick it up
                return profit.get(0);
            }
            else {
                return 0;
            }
        }

        if (dp[idx][w] != -1){
            return dp[idx][w];
        }

        int pick = 0;
        if (weight.get(idx) <= w){//you can only pick those item which weight <= sack weight
            pick = profit.get(idx) + knapsack(idx - 1, w - weight.get(idx), profit, weight, dp);
        }
        int notPick = knapsack(idx - 1, w, profit, weight, dp);

        return dp[idx][w] = Math.max(pick, notPick);//return the maximum from both pick and not pick
    }
}
