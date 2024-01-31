package arrays.src;

import java.util.Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {45,34,78,56,63};
        int n = arr.length;
        int ans = findSecondLargest(n,arr);
        System.out.println(ans);
    }
    public static int findSecondLargest(int n, int[] arr) {
        // Write your code here.
        Arrays.sort(arr);
        if(n <= 1){
            return -1;
        }
        if(arr[0] == arr[n - 1]){
            return -1;
        }
        Arrays.sort(arr);
        int largest = arr[n - 1];
        int secSmall = Integer.MIN_VALUE;
        for(var i : arr){
            if (i != largest){
                secSmall = Math.max(secSmall, i);
            }
        }
        return secSmall;
    }
}
