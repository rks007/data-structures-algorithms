import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr = {43,32,22,12,9,5,1};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionsort(int[] arr){
        //run loop on imaginary unsorted part of array thats why taking i = 1
        for (int i = 1;i < arr.length ;i++){
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}
