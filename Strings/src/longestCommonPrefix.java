public class longestCommonPrefix { //leetcode 14
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String ans = findLongestCommonPrefix(strs);
        System.out.println(ans);
    }
    public static String findLongestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        int n = strs.length;
        String ans = "";
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {//imp line
                    return ans;
                }
            }
            ans += ch;//otherwise add that character to the ans string
        }
        return ans;
    }
}
