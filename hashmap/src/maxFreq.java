import java.util.HashMap;

public class maxFreq {
    public static int maximumfreq(int arr[]){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int el:arr) {
            if (!mp.containsKey(el)){
                mp.put(el,1);
            }
            else{
                mp.put(el,mp.get(el) + 1);
            }
        }
        int maxfre = 0;
        int anskey = -1;
        for (var e:mp.entrySet()) {
            if (e.getValue() > maxfre){
                maxfre = e.getValue();
                anskey = e.getKey();
            }
        }
        return anskey;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,1,4,1,4,3,4,7,4,8,4};
        int x = maximumfreq(arr);
        System.out.println(x);


    }
}
