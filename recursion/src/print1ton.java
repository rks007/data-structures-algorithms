public class print1ton {
    public static void main(String[] args) {
        print1ton(5);

    }
    static void print1ton(int n){
        //base condition
        if (n == 0){
            return ;
        }
        print1ton(n - 1);
        System.out.println(n);
    }
}

