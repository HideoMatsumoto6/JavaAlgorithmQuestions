public class NQueenProblem {
    private int N;
    public NQueenProblem(int N) {
        this.N = N;
    }

    private boolean isSafe(int[][] board, int row, int col) {

        for(int XPivot = row, YPivot = 0;  YPivot < col; YPivot++) {
            if(board[XPivot][YPivot] == 1) return false;
        }

        for(int XPivot = row, YPivot = col;  XPivot >= 0 && YPivot >= 0; YPivot--, XPivot--) {
            if(board[XPivot][YPivot] == 1) return false;
        }

        for(int XPivot = row, YPivot = col;  XPivot < N  && YPivot >= 0; YPivot--, XPivot++) {
            if(board[XPivot][YPivot] == 1) return false;
        }
        return true;
    }


    private boolean solveNQueensUntil(int[][] board, int col) {
        if(col >= N) {
            return true;
        }
        for(int i = 0; i < N; i++) {
            if(isSafe(board, i, col)) {
                board[i][col] = 1;
                if(solveNQueensUntil(board, col + 1)) return true;
                board[i][col] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int boardDimension = 15;
        NQueenProblem prob = new NQueenProblem(boardDimension);

        int[][] board = new int[boardDimension][boardDimension];
        if(prob.solveNQueensUntil(board, 0)) {
            System.out.println("NQeen is sovled");
            for(int[] arr : board) {
                for(int num: arr) {
                    System.out.print(num + ",");
                }
                System.out.println();
            }
        }


    }
}
