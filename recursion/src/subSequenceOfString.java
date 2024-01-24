import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class subSequenceOfString {
    public static void main(String[] args) {
        String s = "abc";
        List<String> ans = subSequence(s);
        System.out.println(ans);
    }
    private static List<String> subSequence(String s){
        int n = s.length();
        List<String> ans = new ArrayList<>();
        helper(s,"",ans,n,0);
        Collections.sort(ans);//doing this for making it in lexicographically sorted  order
        return ans;
    }
    private static void helper(String s,String newStr,List<String> ans,int n,int idx){
        //base case
        if (idx == n ){
            if (!newStr.isEmpty()) {//this is because we dont want to include the empty string in our answer
                ans.add(newStr);
            }
            return;
        }

        //pick
        if (newStr.length() < n){
            helper(s,newStr + s.charAt(idx),ans,n,idx + 1);
        }
        //not pick
        if (idx < n){
            helper(s,newStr,ans,n,idx + 1);
        }
    }
}
