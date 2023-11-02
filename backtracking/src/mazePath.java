public class mazePath {
    public static void main(String[] args) {
        int rows = 2;
        int cols = 3;
        int count = maze(0,0,rows - 1,cols - 1);
        System.out.println(count);
    }

    private static int maze(int sr, int sc, int er, int ec) { // sr & sc -starting row & starting col and er and ec are ending row and col
        if (sr > er || sc > ec) return 0;//base case
        if (sr == er && sc == ec) return 1;//base case

        int downways = maze(sr + 1,sc,er,ec);
        int rightways = maze(sr,sc + 1,er,ec);
        int totalways = downways + rightways;
        return totalways;
    }
}