import java.util.HashSet;

public class longestConsecutiveSequence { //leetcode 128
    public static int longestConsecutive(int[] nums){
        int longest = 0;
        HashSet<Integer> mp = new HashSet<>();

        for (int i = 0;i < nums.length;i++){ //add all the values in the hashset from the array
            mp.add(nums[i]);
        }
        for (int i : mp) { //traverse whole hashset
            if (!mp.contains(i - 1)){ //if true then num is starting point of a sequence
                int count = 1; //if it is starting then make count 1
                int currNum = i; //also store your value in a variable
                while(mp.contains(currNum + 1)){ //now check it that hashset have it sequences or not, if yes
                    count++; // then increase the count
                    currNum++; // alse increase the currNum
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}
