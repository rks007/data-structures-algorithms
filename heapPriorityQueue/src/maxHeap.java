import java.util.ArrayList;
import java.util.List;

public class maxHeap {
    public static void insert_in_maxHeap(List<Integer> heap, int element){
        heap.add(element);
        int index = heap.size() - 1;
        pushup_in_maxHeap(heap,index);
    }

    private static void pushup_in_maxHeap(List<Integer> heap, int i) {
        int parent_index = (i - 1)/2;
        if(i == 0 || heap.get(parent_index) > heap.get(i)){ //only change in isertion of min and max heap
            return;
        }
        swap(heap, i, parent_index);
        pushup_in_maxHeap(heap,parent_index);
    }

    private static void swap(List<Integer> heap, int i, int parentIndex) {
        int temp = heap.get(i);
        heap.set(i,heap.get(parentIndex));
        heap.set(parentIndex,temp);
    }

    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(60);
        heap.add(50);
        heap.add(40);
        heap.add(30);
        heap.add(20);
        heap.add(30);
        heap.add(10);
        System.out.println(heap);
        insert_in_maxHeap(heap,40);
        System.out.println(heap);

    }
}
