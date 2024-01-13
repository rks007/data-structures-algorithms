public class fibonacciTabulation {
    public static void main(String[] args) {
        int n = 10;

        int prev1 = 1;//extracted from base condition
        int prev2 = 1;//extracted from base condition

        int current = 0;

        for (int i = 3;i <= n;i++){
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        System.out.println(current);

    }
}
