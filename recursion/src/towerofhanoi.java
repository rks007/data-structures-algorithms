public class towerofhanoi {
    public static void main(String[] args) {
        towerhanoi(3,"s","h","d");
    }
    static void towerhanoi(int n ,String src,String helper ,String dest){
        //base case
        if (n == 0){
            return;
        }
        towerhanoi(n-1,src,dest,helper);
        System.out.println(src+"->"+dest);//put the last disc
        towerhanoi(n-1,helper,src,dest);
    }
}
