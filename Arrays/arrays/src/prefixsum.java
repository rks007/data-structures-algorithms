import java.util.Scanner;

public class prefixsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for (int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(arr);
        System.out.println(prefixsumarray(arr));
    }
    static int[] prefixsumarray(int[] arr){
        arr[0]= arr[0];
        for (int i = 1;i < arr.length;i++){
            arr[i] = arr[i-1] + arr[i] ;
        }
        return arr;
    }
}
