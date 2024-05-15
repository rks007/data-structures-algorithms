public class removeConsecutive {
    public static void main(String[] args) {
        String S = "aabbbaaacde";
        String ans = removeConsecutiveCharacter(S);
        System.out.println(ans);
    }
    public static String removeConsecutiveCharacter(String S){
        String ans = "";
        if(S.length() == 1){
            return ans + S.charAt(0);
        }
        int n = S.length() - 1;
        for(int i = 0; i < n; i++){
            char curr = S.charAt(i);
            char fast = S.charAt(i + 1);
            if(curr != fast){
                ans += curr;
            }
            if(i + 1 == n){
                ans += fast;
            }
        }
        return ans;
    }
}
