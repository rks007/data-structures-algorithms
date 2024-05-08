public class smallestInRotatedSortedArray {//leetcode 153
    public static void main(String[] args) {
        int[] nums = {11,12,13,14};
        int ans = smallest(nums);
        System.out.println(ans);
    }

    private static int smallest(int[] nums) {//please dry run to understand it better
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {

            if(nums[start] <= nums[end]){
                return nums[start];
            }

            int mid = start + (end - start) / 2;

            if (nums[mid] >= nums[start]) {//hint is that think about the inflection point, for better understanding see hint from leetcode 153
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return 0;
    }
}
