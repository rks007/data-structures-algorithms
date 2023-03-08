public class linearsearchstring {
    public static void main(String[] args) {
        String name="google";
        char x='f';
        System.out.println(search(name,x));
    }
    public static boolean search(String name,char x){
        if(name.length()==0){
            return false;
        }
        for (int i=0;i<name.length();i++){
            if(name.charAt(i)==x){
                return true;
            }
        }
        return false;
    }
}
