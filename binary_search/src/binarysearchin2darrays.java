public class binarysearchin2darrays {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix,60));

    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length==0){
            return false;
        }
        int n = matrix.length;
        int m = matrix[0].length;

        int start = 0 ;
        int end = (n*m)-1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == matrix[mid/m][mid%m]){
                return true;
            }
            if(target < matrix[mid/m][mid%m]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }
        return false;
    }
}

