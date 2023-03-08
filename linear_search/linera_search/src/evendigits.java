public class evendigits {
    public static void main(String[] args) {
        int[] nums={23,456,45,67,789,674,2333};
        System.out.println(noofevendigitsnumber(nums));

    }
    public static int noofevendigitsnumber(int[] nums){
        int count=0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    public static boolean even(int num){
        int noofdigits=digits(num);
        return noofdigits % 2 == 0;
    }
    public static int digits(int num){
        int count=0;
        while (num>0){
            count++;
            num /=10;
        }
        return count;

    }
}
