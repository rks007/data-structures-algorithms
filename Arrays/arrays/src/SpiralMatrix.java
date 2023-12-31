package arrays.src;
/*

*/

import java.util.Scanner;

public class SpiralMatrix {
    private static void printMatrix(int[][] matrix){
        for (int i = 0;i < matrix.length;i++){
            for (int j = 0;j < matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int r = sc.nextInt();
        System.out.println("enter col");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for (int i = 0;i < r;i++){
            for (int j = 0;j < c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("input Matrix");
        printMatrix(matrix);

        System.out.println("spiral Matrix");
        printSpiralOrder(matrix,r,c);
    }
    private static void printSpiralOrder(int[][] matrix, int r, int c){
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1; //important observation

        int totalElements = 0;

        while(totalElements < r * c){
            //top row --> leftcol to rightcol
            for (int j = leftCol;j <= rightCol && totalElements < r * c;j++){
                System.out.print(matrix[topRow][j]+" ");
                totalElements++;
            }
            topRow++;

            //rightCol -> toprow to Bottom row
            for (int i = topRow; i <= bottomRow && totalElements < r * c;i++){
                System.out.print(matrix[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;

            //Bottom Row -> rightCol to leftCol
            for (int j = rightCol;j >= leftCol && totalElements < r * c;j--){
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;

            //leftCol -> bottomRow to TopRow
            for (int i = bottomRow;i >= topRow && totalElements < r * c;i--){
                System.out.print(matrix[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;

        }
    }
}
