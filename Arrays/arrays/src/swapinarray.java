import java.util.Arrays;
import java.util.Scanner;

public class swapinarray {


    public static void main(String[] args) {

        int[] arr = {34, 45, 56, 67, 78};
        swap(arr,0,2);

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
