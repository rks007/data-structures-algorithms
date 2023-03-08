public class digitproduct {
    public static void main(String[] args) {
        System.out.println(product(55));
    }
    static int product(int n){
        //base condition
        if (n%10 == n){//why not n == 0 because then whatever you give the input your answer will only come zero at the end thats why just return the the last single digit value left of the number for coorect answer
            return n;
        }
        return (n%10) * product(n/10);
    }
}
