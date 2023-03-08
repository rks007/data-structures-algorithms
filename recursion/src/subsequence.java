public class subsequence {
    public static void main(String[] args) {
        printsubseq("abc","");

    }
    static void printsubseq(String s,String currans){
        //base case
        if (s.length() == 0){
            System.out.println(currans);
            return;
        }


        char curr = s.charAt(0);
        String remstr = s.substring(1);
        //include curr in remstr
        printsubseq(remstr,currans + curr);
        //exclude curr in remstr
        printsubseq(remstr,currans);
    }
}
