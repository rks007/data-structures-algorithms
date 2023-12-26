import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void delete_from_minHeap(List<Integer> heap){
        swap(heap,0,heap.size() -  1);
        heap.remove(heap.size() - 1);// now delete the last positioned element
        push_down_in_minHeap(heap,0, heap.size() - 1); //now fix the first positioned element
    }
    public static void heapify(List<Integer> arr){//build heap using better method i.e heapify  //o(n) for this
        int first_non_leaf_node = ((arr.size() - 1) - 1) / 2; //last element ka parent node

        for (int i = first_non_leaf_node;i >= 0;i--){
            push_down_in_minHeap(arr,i, arr.size() - 1);
        }
    }

    private static void push_down_in_minHeap(List<Integer> heap, int index,int n) {
        if(index == n){ //if you reach end then just return //base condition
            return;
        }
        int left_index = (2 * index) + 1;
        int right_index = (2 * index) + 2;
        int smallest = index; //assume that index value is smallest

        if(left_index <= n && heap.get(left_index) < heap.get(smallest)){//left_index <= n check is important because if left index is not present then it will give null pointer error so always chech for it
            smallest = left_index;
        }
        if(right_index <= n && heap.get(right_index) < heap.get(smallest)){
            smallest = right_index;
        }
        //2nd base condition
        if(smallest == index){//above both comparison failed then returned because tou are at correct positioned
            return;
        }
        // now swap the values
        swap(heap,index,smallest);
        //recursive call
        push_down_in_minHeap(heap, smallest, n);
    }

    public static void insertMinHeap(List<Integer> heap, int element){
        heap.add(element);//add the value in the last

        int index = heap.size() - 1; //it will give the index of your latest insertion beacuse you always insert in the end
        //if this insertion has destroyed the heap then reset the heap
        push_up_in_minHeap(heap,index);

    }

    private static void push_up_in_minHeap(List<Integer> heap, int i) {
        int parent_index = (i - 1)/2; //get parent index through formula
        if (i == 0 || heap.get(parent_index) < heap.get(i)){ //if root reached or current position found
            return;
        }
        // when if condition fail then swap
        swap(heap, i, parent_index);
        push_up_in_minHeap(heap,parent_index);//recursion untill it reaches its correct position
    }

    private static void swap(List<Integer> heap, int i, int parent_index ) {
        int temp = heap.get(i);
        heap.set(i,heap.get(parent_index));
        heap.set(parent_index,temp);
    }

    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(90);
        heap.add(80);
        heap.add(70);
        heap.add(20);
        heap.add(10);
        heap.add(50);
        heap.add(60);
        System.out.println(heap);
        //insertMinHeap(heap,5);
        //delete_from_minHeap(heap);
        heapify(heap);
        System.out.println(heap);

    }
}