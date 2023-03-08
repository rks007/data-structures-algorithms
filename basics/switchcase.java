import java.util.Scanner;

public class switchcase{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*System.out.println("enter a fruit");
        String fruit=sc.next();
          switch(fruit){

            case "mango":
            System.out.println("king of fruits");
            break;

            case "apple":
            System.out.println("red fruit");
            break;

            case "orange" :
            System.out.println("rich in vitamin c");
            break;
            
            default:
            System.out.println("enter valid fruit");
        }


        //enhanced switch case 
        switch(fruit){
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("red fruit");
            case "orange" -> System.out.println("rich in vitamin c");
            case "banana" -> System.out.println("long fruit with yellow covering");
            default -> System.out.println("enter a valid fruit");
        }*/

        // basic calculator

        System.out.println(" enter the numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();

        System.out.println(" enter the operation you want");
        String opt = sc.next();
        

        switch(opt){
            case "+":
            System.out.println(a+b);
            break;

            case "-":
            System.out.println(a-b);
            break;

            case "*":
            System.out.println(a*b);
            break;

            case "/":
            System.out.println(a/b);
            break;

            default:
            System.out.println("enter a valid operation");
        }

    }
}