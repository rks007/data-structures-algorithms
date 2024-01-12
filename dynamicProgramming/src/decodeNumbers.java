public class decodeNumbers {
    private static int calls = 0;
    private static int decode(String num,int idx,int[] dp){
        if (idx <= 0){
            return 1;
        }

        if (dp[idx] != -1){
            return dp[idx];
        }
        calls++;
        //you have the choice to just take all the possibilities from n-1 and just add your value in the last
        int notCombine = 0;//for not having scope issues we are declaring it outside the if conditions
        if (num.charAt(idx) != '0'){
            notCombine = decode(num, idx - 1,dp);
        }
        //then also you can combine with the left of yours and add with the n-2 possiblities
        int combine = 0;
        if (num.charAt(idx - 1) == '1' || (num.charAt(idx - 1) == '2' || num.charAt(idx) <= '6')){
            combine = decode(num,idx - 2,dp);
        }
        //in last return the combine and not combine possiblities together
        return dp[idx] = notCombine + combine;
        //this is a fibbonacci questions with sum additional conditions
    }
    public static void main(String[] args) {
        String num = "11126";
        int[] dp = new int[num.length()];
        for (int i= 0;i < num.length();i++){
            dp[i] = -1;
        }
        System.out.println(decode(num,num.length() - 1,dp));//starting the recursion from last
        System.out.println(calls);
    }
}
