import java.util.Arrays;
import java.util.Scanner;

public class reversearray {


    public static void main(String[] args) {

        int[] arr={34,45,56,67,78};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public  static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public static void reverse(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
