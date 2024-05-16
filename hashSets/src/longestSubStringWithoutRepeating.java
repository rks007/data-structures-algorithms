import java.util.HashSet;

public class longestSubStringWithoutRepeating { //leetcode 3
    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {//for better understanding dry run
            while (set.contains(s.charAt(right))) {//only run if contains
                set.remove(s.charAt(left));
                left++;
            }
            //otherwise
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, (right - left) + 1);
        }

        return maxLength;
    }
}
