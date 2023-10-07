public class printallSubstrings {
    public static void main(String[] args) {

        // without using substring method

        String str = "abcd";
        for (int i = 0;i<str.length();i++){
            String st = "";
            char c = str.charAt(i);
            st += c;
            System.out.println(st);
            for (int j = i + 1;j < str.length();j++){
                char ch = str.charAt(j);
                st += ch;
                System.out.println(st);
            }
        }

         //with the help of substring method

//        String str = "abcd";
//        for (int i = 0;i < str.length();i++){
//            for (int j = i + 1;j <= str.length();j++){
//                System.out.println(str.substring(i,j)+" ");
//            }
//        }
    }
}
