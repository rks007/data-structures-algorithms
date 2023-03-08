public class maxwealth {
    public static void main(String[] args) {
        int[][] accounts={
                {1,2,3},
                {4,5,6},
                {3,5,6}

        };
        System.out.println(maximumwealth(accounts));

    }
    public static int maximumwealth(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        for (int person=0;person< accounts.length;person++){
            int rowsum=0;
            for (int account=0;account<accounts[person].length;account++){
                rowsum += accounts[person][account];
            }
            if (rowsum>ans){
                ans=rowsum;
            }
        }
        return ans;
    }
}
