import java.util.Arrays;
import java.util.Scanner;

public class linear{
    static void reverse(int[] arr){
        int temp;
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
