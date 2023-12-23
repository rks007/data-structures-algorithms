import java.net.Inet4Address;
import java.util.HashMap;

public class twoSum {
    //leetcode 1
    public static int[] twoSum(int[] nums, int target){
        int[] ans = new int[2];
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            int a = nums[i];
            int remaining = target - a;
            if (mp.containsKey(remaining)){
                ans[0] = i;
                ans[1] = mp.get(remaining);
                return ans;
            }
            else{
                mp.put(a,i);
            }
        }
        return ans;
    }
}
