import java.util.HashMap;

public class largestSubArrayWithSum0 {
    public static int largestSumSubarray(int[] arr,int n){
        int maxLen = 0;
        int prefixSum = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i < n;i++){
            prefixSum += arr[i];

            if(prefixSum == 0){
                maxLen = i + 1;
            }

            if(mp.containsKey(prefixSum)){
                maxLen = Math.max(maxLen, i - mp.get(prefixSum));
            }
            else{
                mp.put(prefixSum,i);
            }
        }
        return maxLen;
    }
}
