import java.util.ArrayList;
import java.util.List;

public class Main {
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
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);
        System.out.println(heap);
        insertMinHeap(heap,5);
        System.out.println(heap);

    }
}