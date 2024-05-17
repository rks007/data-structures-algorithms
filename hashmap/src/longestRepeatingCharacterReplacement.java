import java.util.HashMap;

public class longestRepeatingCharacterReplacement {//leetcode 424
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        int ans = characterReplacement(s,k);
        System.out.println(ans);
    }
    public static int characterReplacement(String s, int k) {
        int maxLen = 0;
        int maxFreq = 0;
        int left = 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int right = 0; right < s.length(); right++){//dry run for better understanding

            char rightCurr = s.charAt(right);
            mp.put(rightCurr, mp.getOrDefault(rightCurr, 0) + 1);
            maxFreq = Math.max(maxFreq, mp.get(rightCurr));//getting the most frequent element from the current window ie maxFreq

            if((right - left + 1) - maxFreq > k){//imp concept
                char leftCurr = s.charAt(left);
                mp.put(leftCurr, mp.get(leftCurr) - 1);
                left++;
            }

            // Calculate the maximum length of the substring
            maxLen = Math.max(maxLen, right - left + 1);
        }


        return maxLen;
    }

}
