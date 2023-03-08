public class functions {
    public static void main(String[] args) {
        //int ans= sum1(40,45);
        //System.out.println("sum="+ans);
        String personalized= greet("yoyo");
        System.out.println(personalized);

    }
    /*public static int sum1(int a,int b) {
        int sum= a + b;
        return sum;
        
    } */   
    public static String greet(String name) {
        String mygreet="hello "+name;
        return mygreet;
        
    }
}
