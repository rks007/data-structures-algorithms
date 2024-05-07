package arrays.src;

public class maximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        int ans = maximumSubarray(nums);
        System.out.println(ans);
    }

    private static int maximumSubarray(int[] nums) {
        //brute force method
//        if(nums.length == 1){
//            return nums[0];
//        }
//        int maximum = 0;
//
//        for (int i = 0; i < nums.length; i++){
//            int product = nums[i];
//            maximum = Math.max(product, maximum);//for tackling the edge cases like [0,2], check with dry run
//            for (int j = i + 1; j < nums.length; j++){
//                product = product * nums[j];
//                maximum = Math.max(product, maximum);
//            }
//        }
//        return maximum;

        //--------------------------------------------------*******----------------------------------------------------//

        //better approach
        //dont try to use kadanes algo here, it will be so complex
        //this is a better approacb
        //please dry run it
        int prefix = 1;
        int suffix = 1;
        int maximum = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i< nums.length;i++){
            if(prefix == 0){
                prefix = 1;
            }
            if(suffix == 0){
                suffix = 1;
            }

            prefix = prefix * nums[i];

            suffix = suffix * nums[n - i - 1];

            maximum = Math.max(maximum, Math.max(prefix, suffix));
        }

        return maximum;
    }
}
