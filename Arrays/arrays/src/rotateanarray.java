package arrays.src;

import java.util.Arrays;

public class rotateanarray {
    static void reverse(int[] arr,int st,int end){
        while(st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    static void rotatearray(int[] arr,int k ){
        if(arr.length == 1) return;

        k %= arr.length;
        reverse(arr,0, arr.length - 1);
        reverse(arr,0,k - 1);
        reverse(arr,k, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotatearray(arr,2);
        System.out.println(Arrays.toString(arr));
    }
}
