import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {34,23,19,12,9,2};
        selectsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectsort(int[] arr){
        for (int i = 0;i < arr.length - 1;i++){
            //declare a smallest index
            int smallest = i;
            for (int j = i + 1;j < arr.length;j++){
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
    }
}
