import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class subSet { //leetcode 78
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subsets(arr);
        System.out.println(ans);
    }
    public static List<List<Integer>> subsets(int[] nums){
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        helper(nums, n, ls, 0,ans);
        return ans;
    }
    private static void helper(int[] nums,int n,List<Integer> ls, int idx, List<List<Integer>> ans){
        //base case
        if (idx == n){
            ans.add(new ArrayList<>(ls)); //always add ls in new arraylist for maintaining the unique pairs
            return;
        }

        //pick
        if (idx < n){
            ls.add(nums[idx]);
            helper(nums, n, ls, idx + 1, ans);
            ls.remove(ls.size() - 1);//backtrack, this is the must step
        }
        //not pick
        if(idx < n){
            helper(nums, n, ls, idx + 1, ans);
        }
    }
}
