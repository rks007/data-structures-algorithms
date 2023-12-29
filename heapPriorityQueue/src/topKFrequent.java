import java.security.KeyStore;
import java.util.*;

public class topKFrequent { //leetcode 347
    public static int[] topKFrequent(int[] nums, int k){
        if(nums.length == 1){
            return nums;
        }
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length;i++){
            if (mp.containsKey(nums[i])){
                mp.put(nums[i], mp.get(nums[i]) + 1);
            }
            else {
                mp.put(nums[i], 1);
            }
        }
//        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> mp.get(b) - mp.get(a));
//        pq.addAll(mp.keySet());
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));//Comparator.comparingInt(Mao.entry::getValue) is giving a parameter to queue to sort elements by their values not the keys
        for (var e: mp.entrySet()) {
            if(pq.size() == k){
                if(e.getValue() > pq.peek().getValue()){
                    pq.remove();
                    pq.add(e);
                }
            }
            else {
                pq.add(e);
            }
        }


        int[] result = new int[k];
        int i = 0;
        while(i != k){
            result[i] = pq.remove().getKey();
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {4,1,-1,2,-1,2,3};
        int[] ans = topKFrequent(arr,2);
        System.out.println(Arrays.toString(ans));
    }
}
