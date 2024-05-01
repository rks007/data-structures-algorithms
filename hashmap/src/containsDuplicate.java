import java.util.HashMap;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1};
        boolean ans = findDuplicate(nums);
        System.out.println(ans);

    }
    private static boolean findDuplicate(int[] nums){
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(var el : nums){
            if(!mp.containsKey(el)){
                mp.put(el,1);
            }
            else{
                return true;
            }
        }
        return false;
    }
}
