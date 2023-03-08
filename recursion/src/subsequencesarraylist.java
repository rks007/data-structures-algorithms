import java.util.ArrayList;

public class subsequencesarraylist {
    public static void main(String[] args) {
        ArrayList<String> ans = getsubseq("abcd");
        System.out.println(ans);
    }
    static ArrayList<String> getsubseq(String s){
        ArrayList<String> ans = new ArrayList<>();
        //base case
        if (s.length() == 0){
            ans.add(" ");
            return ans;
        }
        char curr = s.charAt(0);
        ArrayList<String> smallAns = getsubseq(s.substring(1));
        for (String ss : smallAns){
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }
}
