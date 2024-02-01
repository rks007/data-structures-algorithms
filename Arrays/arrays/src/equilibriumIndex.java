package arrays.src;

public class equilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        int n = arr.length;
        int ans = equiIndex(arr,n);
        System.out.println(ans);
    }
    private static int equiIndex(int[] arr,int n){
        //store all the sum in an arr
        int[] sum = new int[n];
        sum[0] = arr[0];//this is obvious that 0th index sum value will be its own value

        for(int i = 1;i < n;i++){
            sum[i] = sum[i - 1] + arr[i];//sum for other element is by its current value and previous index sum
        }

        //now finding the equilibrium index
        for (int i = 0;i < n;i++){
            int leftSum = (i == 0) ? 0 : sum[i - 1];
            int rightSum = sum[n - 1] - sum[i];

            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
}
