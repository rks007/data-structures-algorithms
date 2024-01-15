import java.util.List;

public class coinChangeTabulation {//leetcode 518
    public static void main(String[] args) {
        List<Integer> coin = List.of(2,5,3,6);
        int n = coin.size();
        int totalSum = 10;
                             //idx   //sum
        int[][] dp = new int[n + 1][totalSum + 1];//here we need 2d array dp because we can choose an idx many times so the correct way of storing all values will be 2d array id idx and sum

        for (int sum = 0;sum <= totalSum ;sum++){//taking idx as 0 and filling the sum value
            if (sum % coin.get(0) == 0){
                dp[0][sum] = 1;
            }
//            else { //no need of else step because 2d array is already initialized with 0 value
//                dp[0][1] = 0;
//            }
        }

        for (int idx = 1;idx < n;idx++){//starting from one because we have already filled the first index above
            for (int sum = 0;sum <= totalSum;sum++){

                int pick = 0;
                if (coin.get(idx) <= sum){//imp condition
                    pick = dp[idx][sum - coin.get(idx)];
                }
                int notPick = dp[idx - 1][sum];

                dp[idx][sum] = pick + notPick;

            }
        }

        System.out.println(dp[n - 1][totalSum]);
    }

}
