public class digitsum {
    public static void main(String[] args) {
        System.out.println(digitsum(233));
    }
    static int digitsum(int n){
        //base condition
        if (n == 0){
            return 0;
        }
        return (n%10) + digitsum(n/10);
    }
}
