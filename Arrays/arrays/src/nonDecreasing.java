package arrays.src;

public class nonDecreasing { //https://www.codingninjas.com/studio/problems/non-decreasing-array_699920?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube&count=25&page=1&search=&sort_entity=order&sort_order=ASC&leftPanelTabValue=PROBLEM
    public static void main(String[] args) {
        int[] arr = {-71, -46, -41, -8, 7, 35, 219, -150, 57, 59};
        int n = arr.length;

        boolean ans = isPossible(arr,n);
        System.out.println(ans);
    }
    public static boolean isPossible(int[] arr, int n) {
        int count = 0;
        for (int i = 0;i < n - 1;i++){
            if (arr[i] > arr[i + 1]){
                count++;
            }
            if (i > 0 && arr[i + 1] < arr[i - 1]) { //very important step where if convert the smallest element of i + 1 to the same value of i so that the further calculations will be correct {-71, -46, -41, -8, 7, 35, 219, -150, 57, 59}
                arr[i + 1] = arr[i]; // Modify the next element
            }
        }
        if (count > 1){
            return false;
        }
        else {
            return true;
        }
    }
}
