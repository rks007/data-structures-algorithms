import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {//leetcode 22
    public static void main(String[] args) {
        int n = 3;
        List<String> ans = generateParenthesis(n);
        System.out.println(ans);
    }
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper("",0 ,0,n,ans);
        return ans;
    }
    private static void helper(String str,int open,int close,int n,List<String> ans){
        //base case
        if (open == n && close == n){//if the open and closed become equal to the n that means one of the many possibilities is generated so push that in the answer list of string
            ans.add(str);
            return;
        }

        //open
        if (open < n){//for adding '(' check that this '(' is less than n
            helper(str + "(", open + 1,close,n,ans);
        }
        //close
        if (close < open){//for adding ')' check that number of '(' > number of ')'
            helper(str + ")", open, close + 1,n,ans);
        }
    }
}
