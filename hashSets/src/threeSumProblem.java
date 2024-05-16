import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class threeSumProblem { //leetcode 15

    public static List<List<Integer>> threeSum1(int[] nums){ //brute force  t.c = n^3
        HashSet<List<Integer>> st = new HashSet<>();
        for (int i = 0;i < nums.length;i++){
            for (int j = i + 1;j < nums.length;j++){
                for (int k = j + 1;k < nums.length;k++){
                    if (nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                        temp.sort(null); //sorting this to be sure that if any time an list occur same as previous any list then it will not add in hashset
                        st.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;

    }

    public static List<List<Integer>> threeSum(int[] nums) {//better aproach  t.c = n^2
        HashSet<List<Integer>> st = new HashSet<>();

        for (int i = 0;i < nums.length;i++){
            HashSet<Integer> hashset = new HashSet<>(); //it will reset after every change in i
            for (int j = i + 1;j < nums.length;j++){
                int third = -(nums[i] + nums[j]);
                if (hashset.contains(third)){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    temp.sort(null);
                    st.add(temp);
                }
                else{
                    hashset.add(nums[j]); //adding this because if not found third then j will move to next index so before moving add j indexed value to the hashset
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
}
