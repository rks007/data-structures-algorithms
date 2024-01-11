public class houseRobber {
    private static  int calls = 0;
    private static int rob(int[] houses,int idx,int[] dp){
        if (idx == houses.length - 1){
            return houses[idx];
        }
        if (idx >= houses.length){
            return 0;
        }
        if (dp[idx] != -1){
            return dp[idx];
        }

        calls++;
        int pick = houses[idx] + rob(houses,idx + 2,dp);//you can pick where you are then move to the right neighbour of yours

        int not_pick = rob(houses, idx + 1,dp);//second option is that you dont want to pick where you are so move to the next obne

        return dp[idx] = Math.max(pick,not_pick);
    }

    public static void main(String[] args) {
        int[] houses = {9,1,3,8};
        int[] dp = new int[houses.length + 1];
        for (int i = 0;i <= houses.length;i++){
            dp[i] = -1;
        }
        System.out.println(rob(houses,0,dp));
        System.out.println(calls);
    }
}
