public class findUnique {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,2,1,6,4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for(int n : arr){//xor the whole array, at the all duplicates will be cancelled out only unique element will survive
            unique ^= n;
        }

        return unique;
    }
}
