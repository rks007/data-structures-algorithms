import java.util.Arrays;

public class linearsearch2darray {
    public static void main(String[] args) {
        int[][] arr={
                {23,54,76},
                {45,44,34},
                {89,78,87}};
        int target=44;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] search(int[][] arr,int target){
        if(arr.length==0){
            return new int[]{-1};
        }

        for (int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1};
    }

}
