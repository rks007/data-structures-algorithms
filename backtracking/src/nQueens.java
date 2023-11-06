public class nQueens {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                board[i][j] = 'X';
            }
        }
        nqueens(board,0);
    }

    private static void nqueens(char[][] board, int row) { //placing queens in row
        int n = board.length;
        if (row == n){ //if the all queens get placed in the all rows
            for (int i = 0;i < n;i++){
                for (int j = 0;j < n;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println(); //
            }
            System.out.println();// spacing bw the boards
            return;
        }
        for (int j = 0;j < n;j++){ // checking that particular row for safe place
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nqueens(board,row + 1); //call lagao
                board[row][j] = 'X'; //backtracking
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        //check the row
        for (int j = 0;j < n;j++){
            if (board[row][j] == 'Q') return false;
        }
        //check col
        for (int i = 0;i < n;i++){
            if (board[i][col] == 'Q') return false;
        }
        //check north east
        int i = row;
        int j = col;
        while(i>=0 && j<n){ // less than n because of 0 based indexing
            if (board[i][j] == 'Q') return false;
            i--;
            j++;
        }
        //check south east
        i = row;
        j = col;
        while(i<n && j<n){
            if (board[i][j] == 'Q') return false;
            i++;
            j++;
        }
        //check south west
        i = row;
        j = col;
        while(i<n && j>=0){
            if (board[i][j] == 'Q') return false;
            i++;
            j--;
        }
        //check nort west
        i = row;
        j = col;
        while(i>=0 && j>=0){
            if (board[i][j] == 'Q') return false;
            i--;
            j--;
        }
        return true;
    }
}
