public class towerofhanoi {
    public static void main(String[] args) {
        towerhanoi(3,"s","h","d");
    }
    static void towerhanoi(int n ,String src,String helper ,String dest){
        //base case
        if (n == 1){
            System.out.println("disk transfer "+n+" from "+src+" to "+dest);
            return;
        }
        towerhanoi(n-1,src,dest,helper);
        System.out.println("disk transfer "+n+" from "+src+" to "+dest);
        towerhanoi(n-1,helper,src,dest);
    }
}
