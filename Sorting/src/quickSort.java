import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {5,9,7,8,3,7,1};
        quicksort(arr,0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static void quicksort(int[] arr,int st,int end){
        //base case
        if (st >= end) return;

        int pi = partition(arr,st ,end);
        quicksort(arr,st,pi - 1);
        quicksort(arr,pi + 1, end);
    }
    static int partition(int[] arr,int st,int end){
        int pivot = arr[st];
        int count = 0;
        for (int i = st + 1;i <= end;i++){
            if (arr[i] <= pivot) count++;//counting elemnts smaller than pivot and "=" is used to deal with duplicate elements
        }
        int pivotidx = count + st;
        swap(arr,st ,pivotidx);

        //now arrange all smaller element than pivot to left and greater elements than pivot to right
        int i = st,j = end;
        while (i < pivotidx && j > pivotidx) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if (i < pivotidx && j > pivotidx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotidx;
    }

}
