import java.util.List;

public class coinChange {
    public static void main(String[] args) {
        List<Integer> coin = List.of(2,5,3,6);
        int sum = 10;

        int[][] dp = new int[coin.size() + 1][sum + 1];//here we need 2d array dp because we can choose an idx many times so the correct way of storing all values will be 2d array id idx and sum
        for (int i = 0;i <= coin.size();i++){
            for (int j = 0;j <= sum;j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(ways(coin,sum,coin.size() - 1,dp));
    }

    private static int ways(List<Integer> coin, int sum, int idx, int[][] dp) {
        if (idx == 0){//base case
            if (sum % coin.get(idx) == 0){//if your coin can divide the sum then only your last element can be pick and that combination would be one of the possibility
                return 1;
            }
            else {
                return 0;
            }
        }

        if (dp[idx][sum] != -1){
            return dp[idx][sum];
        }

        int pick = 0;
        if (coin.get(idx) <= sum){//imp condition,pick only that coins which are equal or less then sum
            pick = ways(coin,sum - coin.get(idx), idx, dp);
        }
        int notPick = ways(coin,sum,idx - 1, dp);//if you are not picking that coin then move forward and decrease the index,decreasing index because we are applying recursion from the last element

        return dp[idx][sum] = pick + notPick;
    }
}
