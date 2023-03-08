import java.util.Scanner;

public class basic {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("output");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }*/
    public static void main(String[] args) {
        boolean ans = isPrime(6);
        System.out.println(ans);
        
    }
    public static boolean isPrime(int n) {
        if(n<1){
            return false;
        }
        for(int i=1;i<n/2;i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
        
    }
}