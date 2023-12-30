package arrays.src;
//try to observe pattern through matching the indices of actual array and output array

public class rotateMatrix {
    private static int[][] brute(int[][] arr){

        int n = arr.length;
        int[][] ans = new int[n][n];
        for (int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                ans[j][n - 1 - i] = arr[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //int[][] rotated =  brute(arr);
        //int n = rotated.length;

        rotateMatrix(arr);

        for (int i = 0;i < arr.length;i++){
            for (int j = 0;j < arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //print the new array for brute approach
//        for (int i = 0;i < n;i++){
//            for (int j = 0;j < n;j++){
//                System.out.print(rotated[i][j]+" ");
//            }
//            System.out.println();
//        }
    }



    private static void rotateMatrix(int[][] arr ){ //optimal approach
        int n = arr.length;

        for (int i = 0;i < n;i++){ //transpose the matrix
            for (int j = i;j < n;j++){ //j = i just dry run for transpose once for j = 0 and once for j = i, you will get the understanding
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0;i < n;i++){ //swap the elements
            for (int j = 0;j < n/2;j++){ //this is just to swap one element once, if we put n istead of n/2 then there will no change. for better understanding dry run it
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - j - 1];
                arr[i][n - j - 1] = temp;
            }
        }

    }
}
