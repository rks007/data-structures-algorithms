public class reverseWordInString {
    public static void main(String[] args) {
        String str = "I.LIKE.CAKE.VERY.MUCH";
        String ans = reverseWords(str);//ans = MUCH.VERY.CAKE.LIKE.I
        System.out.println(ans);
    }

    private static String reverseWords(String s) {
        String str = "";//here we will store the ans
        StringBuilder temp = new StringBuilder("");//temp string to store string
        for (int i = s.length() - 1;i >=0;i--){
            if (s.charAt(i) == '.'){
                temp.reverse();
                temp.append(s.charAt(i));
                str += temp;
                temp.delete(0,temp.length());
            }
            else{
                temp.append(s.charAt(i));
            }
        }
        //this is important because the last temp string will never be added to the str because no "." is present in the last so this step is important, if any doubt left so please dry run this
        temp.reverse();
        str += temp;

        return str;
    }
}
