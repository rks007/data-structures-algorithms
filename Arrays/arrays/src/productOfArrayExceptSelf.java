package arrays.src;

import java.util.Arrays;

public class productOfArrayExceptSelf { //leetcode 238
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        int[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] productExceptSelf(int[] nums) {//dry run for better understanding

        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        prefix[0] = nums[0];
        for(int i = 1; i < nums.length ;i++){//creating prefix product array
            prefix[i] = prefix[i - 1] * nums[i];
        }

        suffix[suffix.length - 1] = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--){//creating suffix product array
            suffix[i] = suffix[i + 1] * nums[i];
        }

        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length ;i++){//now filling the answer array

            if(i == 0){//from saving us from the out of bound error
                ans[i] = suffix[i + 1];
            }
            else if (i == nums.length - 1) {//from saving us from the out of bound error
                ans[i] = prefix[i - 1];
            }
            else{
                ans[i] = prefix[i - 1] * suffix[i + 1];
            }

        }

        return ans;

    }
}
