public class fibonacci_series {
    public static void main(String[] args) {
        System.out.println(fibo(7 ));

    }
    public static int fibo(int n){
        if (n == 1 || n == 2){
            return 1;
        }

        return fibo(n-1)+fibo(n-2);
    }
}