import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        Boolean ans = isprime(n);
        System.out.println(ans); 
    }
    static Boolean isprime(int n) {
        if (n<1) {
            return false;
        }
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
                
            }
        }
        return true;
        
    }
    
}
