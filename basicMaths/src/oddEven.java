import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n) {
        //we know that any number and with 1 gives the same number back,and we also know this thing with the observation that odd number in binary form has last digit as 1
        return (n & 1) == 1;
    }
}