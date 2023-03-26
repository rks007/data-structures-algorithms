public class bruteoflongestsubarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,2,4,2,3};
        int sumk = 3;
        int longest = 0;
        for (int i = 0 ;i < arr.length;i++){
            int sum = 0;
            for (int j = i;j < arr.length;j++){
                sum += arr[j];
                if (sum == sumk)
                    longest = Math.max(longest,j - i + 1);// j-i+1 because it gives the lenght between the j and i pointer in the current position
            }
        }
        System.out.println(longest);
    }
}
