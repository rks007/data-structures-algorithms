import java.util.ArrayList;

public class reversearraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(25);
        list.add(56);
        list.add(78);
        list.add(89);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }
    static void reverse(ArrayList<Integer> list){
        int i = 0;
        int j = list.size()-1;
        while(i < j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
}
