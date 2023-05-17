import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class Main {
    public static void hashmapMethods(){
        HashMap<String,Integer> mp = new HashMap<>();
        mp.put("akash",21);
        mp.put("yash",16);
        mp.put("lav",17);
        mp.put("rishika",19);
        mp.put("harry",18);

        System.out.println(mp.get("akash")); //21

        mp.put("akash",25); //updating values
        System.out.println(mp.get("akash"));

        mp.remove("akash"); //akash will be removed

        System.out.println(mp.containsKey("akash")); //false

        mp.putIfAbsent("yashika",30);

        System.out.println(mp.keySet()); //get all keys

        System.out.println(mp.values());

        System.out.println(mp.entrySet());

        //traversing

        //first method
        for (String key: mp.keySet()) {
            System.out.println("age of "+key+" is "+mp.get(key));
        }

        System.out.println();

        //second method
        for (HashMap.Entry<String,Integer> e:mp.entrySet()) {
            System.out.println("age of "+e.getKey()+" is "+e.getValue());
        }

        System.out.println();

        //third method
        for (var e:mp.entrySet()) {
            System.out.println("age of "+e.getKey()+" is "+e.getValue());
        }
    }


    public static void main(String[] args) {
        hashmapMethods();
    }
}