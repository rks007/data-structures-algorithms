import java.util.Scanner;
//very much similar to fibonacci series
public class stairPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ways = stair(n);
        System.out.println(ways);
    }

    private static int stair(int n) {
        if( n == 1 || n == 2) {//base case
            return n;
        }
        int totalWays = stair(n - 1) + stair(n - 2);//it will count all the ways for you, for clarity dry run it through tree diagram
        return totalWays;
    }
}
