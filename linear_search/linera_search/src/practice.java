public class practice {
    public static void main(String[] args) {
        int[] nums={12,345,6666,77,890};
        System.out.println(numberofevendigits(nums));

    }
    public static int numberofevendigits(int[] nums){
        int count=0;
        for (int num:nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

     static boolean even(int num) {
        int noofdigits=digits(num);
        return noofdigits % 2 == 0;
    }
    static  int digits(int num){
        int count=Integer.MIN_VALUE;
        while (num>0){
            count++;
            num /=10;

        }
        return count;
    }
}
