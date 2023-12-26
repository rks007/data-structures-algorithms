import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class maxHeap {
    public static void delete_in_maxHeap(List<Integer> heap){
        swap(heap,0,heap.size() - 1);
        heap.remove(heap.size() - 1);
        push_down_in_maxHeap(heap,0,heap.size() - 1);
    }
    private static void heapify(List<Integer> arr){
        int first_non_leafNode = ((arr.size() - 1) - 1) / 2;

        for (int i = first_non_leafNode;i >= 0;i --) {
            push_down_in_maxHeap(arr, i, arr.size() - 1);
        }
    }
    private static void heapSort(List<Integer> arr){
        heapify(arr); //first convert the array in max heap for ascending order and for descending convert it into min heap
        int n = arr.size() - 1;
        for (int i = n;i > 0;i--){
            swap(arr,0,i);
            push_down_in_maxHeap(arr,0,i - 1); //remember you will send size as i-1 because dont want to apply push down to last  element
        }
    }

    private static void push_down_in_maxHeap(List<Integer> heap, int index, int n) {
        if(index == n){
            return;
        }
        int left_index = (2 * index) + 1;
        int right_index = (2 * index) + 2;
        int largest = index;//consider your current index as the largest
        if(left_index <=n && heap.get(left_index) > heap.get(largest)){
            largest = left_index;
        }
        if(right_index <=n && heap.get(right_index) > heap.get(largest)){
            largest = right_index;
        }
        if(largest == index){
            return;
        }

        swap(heap,index,largest);
        //recursive call
        push_down_in_maxHeap(heap,largest, n);
    }

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
        heap.add(90);
        heap.add(80);
        heap.add(70);
        heap.add(20);
        heap.add(10);
        heap.add(50);
        heap.add(60);
        System.out.println(heap);
        //insert_in_maxHeap(heap,40);
        //delete_in_maxHeap(heap);
        //heapify(heap);
        heapSort(heap);
        System.out.println(heap);

    }
}
