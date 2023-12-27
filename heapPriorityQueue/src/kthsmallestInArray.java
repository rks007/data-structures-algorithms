import javax.swing.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class kthsmallestInArray {
    public static int kthSmallest(int[] arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //create a max heap priority queue
        for (int i = 0;i < arr.length;i++){
            if (pq.size() == k){
                if (pq.peek() > arr[i]){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
            else{
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] arr = {56,78,23,45,25};
        int smallest = kthSmallest(arr,3);
        System.out.println(smallest);//45 is the required kth smallest in the array
    }
}
