import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {28,7,6,5,4,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        for (int i = 0;i < arr.length - 1 ;i++){
            for (int j = 0;j < arr.length - i - 1;j++){
                if (arr[j] > arr[j + 1]){
                    //then swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}