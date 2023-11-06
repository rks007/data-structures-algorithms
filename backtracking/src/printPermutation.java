import java.util.ArrayList;
import java.util.List;

public class printPermutation {
    public static void main(String[] args) {
        String str = "abc";
        List<String> l = new ArrayList<>();
        print(str,"",l);
        for (int i = 0;i < l.size();i++){
            System.out.println(l.get(i));
        }
    }
    public static void print(String str , String t,List<String> l){
        if (str.equals("")){
            l.add(t);
            return;
        }
        for (int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String rem = left + right;
            print(rem,t+ch,l);
        }
    }
}
