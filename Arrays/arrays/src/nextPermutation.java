package arrays.src;

import java.util.Arrays;

public class nextPermutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        permutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void permutation(int[] nums){//for better understanding dry run
        int ind1 = -1;
        int ind2 = -1;

        //check for break point where
        for(int i = nums.length - 2;i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                ind1 = i;
                break;
            }
        }
        //if break point does not exist this means your array is sorted in decreasing order
        //so just reverse the given array
        if(ind1 == -1){//ind1 == -1 means no breakpoint has been found
            reverse(nums,0);
            return;
        }
        else {
            //now find a greater number than nums[ind1] to swap with
            for(int i = nums.length - 1; i >= 0; i--){
                if(nums[i] > nums[ind1]){
                    ind2 = i;
                    break;
                }
            }
        }
        swap(nums,ind1,ind2);
        //also reverse the right half of the ind1
        reverse(nums,ind1 + 1);

    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private static void reverse(int[] nums,int start){
        int i = start;
        int j = nums.length - 1;
        while (i < j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}
