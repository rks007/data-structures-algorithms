package arrays.src;

public class transposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int n = arr.length;

        transposeMatrix(arr);

        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }



    private static void transposeMatrix(int[][] arr ){ //transpose using extra array
        int n = arr.length;
        for (int i = 0;i < n;i++){
            for (int j = i;j < n;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

    }
}
