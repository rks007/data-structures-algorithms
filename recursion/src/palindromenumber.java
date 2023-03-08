public class palindromenumber {
    public static void main(String[] args) {
        reverse(12321);

        System.out.println(ispalindrome(12321 ));

    }
    static int sum = 0;
    static void reverse(int n){
        //base condition
        if (n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n / 10);
    }
    static boolean ispalindrome(int n){

        if ( n == sum){
            return true;
        }
        return false;
    }

}
