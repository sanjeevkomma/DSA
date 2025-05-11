package com.demo.core.algos.backtracking_algos;

public class NQueens_Problem {
    public static boolean solveNQueens(int board[][], int row) {
        if (row == board.length) return true;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                if (solveNQueens(board, row + 1)) return true;
                board[row][col] = 0; // Backtrack
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        for (int i = 0; i < row; i++)
            if (board[i][col] == 1) return false;
        return true;
    }
}
