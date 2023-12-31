package arrays.src;

public class setMatrixZeros {//leetcode 73
    public static void main(String[] args) {
        int[][] matrix = {
                {1,0,3},
                {4,5,6},
                {8,0,9}
        };

        for (int i = 0;i < matrix.length;i++){
            for (int j = 0;j < matrix[i].length;j++){
                if (matrix[i][j] == 0){
                    markRow(matrix,i);//mark
                    markCol(matrix,j);
                }
            }
        }

        minusOneToZero(matrix);

        //print
        for (int i = 0;i < matrix.length;i++){
            for (int j = 0;j < matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    private static void minusOneToZero(int[][] matrix) {
        for (int i = 0;i < matrix.length;i++){
            for (int j = 0;j < matrix[i].length;j++){
                if (matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void markCol(int[][] matrix,int j) {
        for (int i = 0;i < matrix.length;i++){
            if (matrix[i][j] != 0 ){
                matrix[i][j] = -1;
            }
        }
    }

    private static void markRow(int[][] matrix,int i) {
        for (int j = 0;j < matrix[i].length;j++){
            if (matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }
    }
}
