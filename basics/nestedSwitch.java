import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int empId = sc.nextInt();
        String department = sc.nextLine();
         switch (empId) {
            case 1:
                System.out.println("jasvinder singh");
                break;
            case 2:
            System.out.println("mahipal");
            switch (department) {
                case "it":
                    System.out.println("it department");
                    break;
                case "cse" :
                System.out.println("cse department");  
                break; 
            
                default:
                System.out.println("enter valid department");
                break;
            }
            break;

         
            default:
            System.out.println("enter valid empId");
            break;
         }
        
        
        
    }
    
}
