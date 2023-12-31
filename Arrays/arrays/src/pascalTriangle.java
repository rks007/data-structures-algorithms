package arrays.src;
/*

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
property 1 is that always first column is 1 and the last column is 1
property 2 is that a[i][j] = a[i - 1][j] + a[i - 1][j - 1]
propert 3 is ith row has i + 1 columns
* */

import java.util.Scanner;

public class pascalTriangle {//leetcode 118
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int[][] ans = pascal(n);
        Print(ans);
    }
    private static  int[][] pascal(int n){
        int[][] ans = new int[n][];
        for (int i = 0;i < n;i++){
            //ith row has i + 1 col
            ans[i] = new int[i + 1]; //imp to remember i + 1

            //first and last element of every row is 1
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1;j < i;j++){
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        return ans;
    }
    private static void Print(int[][] matrix){
        for (int i = 0;i < matrix.length;i++){
            for (int j = 0;j < matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
