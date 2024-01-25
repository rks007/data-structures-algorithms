import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class possibleWordsFromPhoneDigits {//gfg
    public static void main(String[] args) {
        int N = 3;
        int[] a = {2,3,4};
        ArrayList<String> ans = possibleWords(a,N);
        System.out.println(ans);
    }
    public static ArrayList<String> possibleWords(int a[], int N)
    {
        HashMap<Integer, ArrayList<String>> mp = new HashMap<>();
        mp.put(2, new ArrayList<>(List.of("a", "b", "c")));
        mp.put(3, new ArrayList<>(List.of("d", "e", "f")));
        mp.put(4, new ArrayList<>(List.of("g", "h", "i")));
        mp.put(5, new ArrayList<>(List.of("j", "k", "l")));
        mp.put(6, new ArrayList<>(List.of("m", "n", "o")));
        mp.put(7, new ArrayList<>(List.of("p", "q", "r", "s")));
        mp.put(8, new ArrayList<>(List.of("t", "u", "v")));
        mp.put(9, new ArrayList<>(List.of("w", "x", "y", "z")));

        ArrayList<String> ans = new ArrayList<>();
        helper("",0,N,a,ans,mp);
        return ans;


    }
    private static void helper(String curr,int idx,int N,int[] a, ArrayList<String> ans,HashMap<Integer, ArrayList<String>> mp){
        if (idx == N){
            ans.add(curr);
            return;
        }

        for (var e : mp.get(a[idx])){//iterate every element of strings//remenber to pass a[idx] in mp,get()
            helper(curr + e,idx + 1,N,a,ans,mp);
        }
    }
}
