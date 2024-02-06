public class reverseStringWordWise {
    public static void main(String[] args) {
        String str = "Welcome to the cohort";
        System.out.println(reverseWordWise(str));

    }
    private static String reverseWordWise(String input){
        int n = input.length();
        String ans = "";
        String str = "";
        for (int i = n - 1;i >= 0;i--){
            if (input.charAt(i) == ' '){
                ans += helper(str);
                ans += " ";
                str = "";

            }
            else{
                char ch = input.charAt(i);
                str += ch;
            }
        }
        ans += helper(str);
        return ans;

    }
    private static String helper(String str){
        int n = str.length();
        String newStr = "";
        for (int i = n - 1;i >= 0;i--){
            char ch = str.charAt(i);
            newStr += ch;
        }
        return newStr;
    }
}
