import java.util.HashMap;
//leetcode 205
public class isomorphicStrings { //bigoh(nsquare)
    public boolean isIsomorphic(String s, String t){
        HashMap<Character,Character> mp = new HashMap<>();
        for (int i = 0;i < s.length();i++){
            Character sch = s.charAt(i); //treating s string like keys
            Character tch = t.charAt(i); // treating t string like values

            if(mp.containsKey(sch)){
                if(mp.get(sch) != tch ) return false;
            } else if (mp.containsValue(tch)) { //checking that 2 or more characters are not mapping single value
                return false;
            }
            else{ //otherwise the key and value in the map
                mp.put(sch,tch);
            }
        }
        return true;
    }
}
