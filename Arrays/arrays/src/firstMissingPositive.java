package arrays.src;

import java.util.Arrays;

public class firstMissingPositive { //leetcode 41
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int n = arr.length;
        System.out.println(missing(arr,n));
    }
    private static int missing(int[] arr, int n){
        // in the first loop change all the 0 and negative values to n+1
        for (int i = 0; i < n;i++){
            if (arr[i] < 1){
                arr[i] = n + 1;
            }
        }

        //in this loop change use negative marking for correct position
        for(int i = 0;i < n;i++){
            int index = Math.abs(arr[i]) - 1;//for this step only we setted 0 and negative values to n-1, now they will get rejected in the next if statement
            if(index < n && arr[index] > 0){
                arr[index] *= -1;
            }
        }

        //if you not understand the solution please dry run it
        for (int i = 0;i < n;i++){
            if (arr[i] > 0){
                return i + 1;
            }
        }

        return n + 1;
    }
}
