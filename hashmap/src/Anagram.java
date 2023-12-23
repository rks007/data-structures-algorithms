import java.util.HashMap;

public class Anagram { //leetcode 242
    public static boolean isAnagram(String s,String t){ //brute force approach
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> mp1 = makeFreqMap(s);
        HashMap<Character,Integer> mp2 = makeFreqMap(t);
        return mp1.equals(mp2); //if both maps are equal in terms of keys and values then it will return true otherwise false

    }
    public static HashMap<Character,Integer> makeFreqMap(String str){
        HashMap<Character,Integer> mp = new HashMap<>();
        for (int i = 0;i < str.length();i++){
            Character ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                mp.put(ch, mp.get(ch) + 1);
            }
        }
        return mp;
    }
    public static boolean isAnagram2(String s,String t){ //optimised approach to use less space
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> mp = makeFreqMap(s);
        for (int i = 0;i < t.length();i++){
            Character ch = t.charAt(i);
            if(!mp.containsKey(ch)){
                return false;
            }
            else {
                mp.put(ch, mp.get(ch) - 1);
                if(mp.get(ch) == 0){//if any key's value become 0 then remove it from the map
                    mp.remove(ch);
                }
            }
        }
        //if hashmap is empty then it is anagram
        if(!mp.isEmpty()){
            return false;
        }
        return true;

    }
}
