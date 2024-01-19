import java.util.List;

public class knapsackTabulation {
    public static void main(String[] args) {
        List<Integer> profit = List.of(1,2,3);
        List<Integer> weight = List.of(4,5,1);
        int wt = 4;//total weight of knapsack
        int n = profit.size();
        int[][] dp = new int[n + 1][wt + 1];

        for (int i = 0;i <= wt;i++){//here i is weight of sack
            if (weight.get(0) <= i){//if your item weight is less than the sack weigth then pick it up
                dp[0][i] = profit.get(0);
            }
        }

        for (int idx = 1;idx < n;idx++){
            for (int w = 0;w <= wt;w++){
                int pick = 0;
                if (weight.get(idx) <= w){//you can only pick those item which weight <= sack weight
                    pick = profit.get(idx) + dp[idx - 1][w - weight.get(idx)];
                }
                int notPick = dp[idx - 1][w];

                dp[idx][w] = Math.max(pick, notPick);
            }
        }
        System.out.println(dp[n - 1][wt]);

        //System.out.println(knapsack(n - 1,wt,profit,weight, dp));
    }

}
