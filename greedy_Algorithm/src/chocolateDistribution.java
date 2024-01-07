import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class chocolateDistribution {//gfg
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 8, m = 5;//n is the number of chocolate packets and m is total number of children

        ArrayList<Integer> a = new ArrayList<>();//(3, 4, 1, 9, 56, 7, 9, 12)
        System.out.println("enter values for arraylist");
        for (int i = 0; i < 8;i++){
            int temp = sc.nextInt();
            a.add(temp);
        }
        int ans = findMinDiff(a, n, m);
        System.out.println(ans);
    }

    private static int findMinDiff(ArrayList<Integer> a, int n, int m) { //for better understanding dry run the code
        a.sort(null);
        int i = 0;
        int j = m - 1;
        int mini = Integer.MAX_VALUE;//just to be safe declare mini has maximum to be safe side
        while(j < a.size()){
            int diff = a.get(j) - a.get(i);
            mini = Math.min(diff,mini);
            i++;
            j++;
        }

        return mini;
    }
}
