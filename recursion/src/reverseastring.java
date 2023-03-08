public class reverseastring {
    public static void main(String[] args) {
        String str = "abcdef";
        reverse(str,str.length()-1);
    }
    static void reverse(String str,int i){
        //base case
        if (i < 0){
            return ;
        }
        System.out.println(str.charAt(i));
        reverse(str,i-1);

    }
}
