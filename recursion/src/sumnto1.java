public class sumnto1 {
    public static void main(String[] args) {
        System.out.println(sumfrom(5));
    }
    static int sumfrom(int n){
        ///base condition
        if (n <= 1){
            return 1;
        }
        return n + sumfrom(n-1);
    }
}
