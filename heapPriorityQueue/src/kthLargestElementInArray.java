import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class kthLargestElementInArray { //leetcode 215
    public static void main(String[] args) {
        int k = 3;
        List<Integer> arr = new ArrayList<>();
        arr.add(87);
        arr.add(72);
        arr.add(11);
        arr.add(56);
        arr.add(23);

        PriorityQueue<Integer> pq = new PriorityQueue<>(); //min heap
        for (int i = 0;i < arr.size();i++){
            if (pq.size() == k){//if heap size get equal to k then
                if (pq.peek() < arr.get(i)){ //check if its top element is smaller than the current coming element if it is then remove top element and add the new one
                    pq.remove();
                    pq.add(arr.get(i));
                }

            }
            else {//if size is less than k than do normal insertion
                pq.add(arr.get(i));
            }
        }
        System.out.println(pq.peek());

    }
}
