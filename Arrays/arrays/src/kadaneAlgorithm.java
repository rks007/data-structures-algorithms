package arrays.src;

public class kadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-5,4,6,-3,4,1};

        int ans = maxSubarraySum(arr);
        System.out.println(ans);
    }

    private static int maxSubarraySum(int[] arr) {
        int sum = 0;
        int ans = arr[0];

        for (int i = 0;i < arr.length; i++){ //using kadanes algo
            sum = sum + arr[i];

            ans = Math.max(sum, ans);

            if (sum < 0){//in kadanes algo we do not include negative values to the ans
                sum = 0;
            }
        }

        return ans;
    }
}
