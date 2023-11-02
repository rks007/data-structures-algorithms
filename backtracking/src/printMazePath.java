public class printMazePath {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        print(0,0,rows-1,cols-1,"");
    }
    public static void print(int sr,int sc,int er,int ec,String s){
        if (sr > er || sc > ec) return;
        if (sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        //downways
        print(sr + 1,sc,er,ec,s + "D");
        //rightways
        print(sr,sc + 1,er,ec,s + "R");

    }
}
