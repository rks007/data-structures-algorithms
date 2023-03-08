import java.util.Scanner;

public class maxinarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={23,45,89,46,67};
        System.out.println(maxinArray(arr));


    }
    public static int maxinArray(int[] arr){
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }return  max;
    }
}
