package arrays.src;

public class nonDecreasing { //leetcode 665
    public static void main(String[] args) {
        int[] arr = {-1,4,2,3};
        int n = arr.length;

        boolean ans = isPossible(arr,n);
        System.out.println(ans);
    }
    public static boolean isPossible(int[] arr, int n) {
        int count = 0;
        for (int i = 0;i < n - 1;i++) {
            if (arr[i] > arr[i + 1]) {
                count++;

                if(count > 1){
                    return false;
                }
                //this is for checking that which number needs modification
                // i > 0 so that array out of bound does not occur
                if(i > 0 && arr[i + 1] < arr[i - 1]){
                    arr[i + 1] = arr[i];
                }
                else {
                    arr[i] = arr[i + 1];
                }
            }
        }
        return true;
    }
}
