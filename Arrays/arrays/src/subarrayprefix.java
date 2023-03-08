public class subarrayprefix {
    public static void main(String[] args) {
        int[] arr = {5,10,6,7,14};
        System.out.println(equalsubarray(arr));

    }
    static int arraysum(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    static boolean equalsubarray(int[] arr){
        int sumofarray = arraysum(arr);
        int prefixsum = 0;
        for (int i = 0;i<arr.length;i++){
            prefixsum += arr[i];
            int suffixsum = sumofarray - prefixsum;
            if (suffixsum == prefixsum){
                return true;
            }
        }
        return false;
    }
}
