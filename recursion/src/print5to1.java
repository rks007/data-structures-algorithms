public class print5to1 {
    public static void main(String[] args) {
        System.out.println(printnto1(5));
    }
    public static int printnto1(int n){
        //base condition
        if (n == 1){
            return 1;
        }
        System.out.println(n);
        return printnto1(n-1);
    }
}
