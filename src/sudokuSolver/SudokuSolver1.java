package sudokuSolver;

/* Sudoku Solver using Backtracking */

public class SudokuSolver1 {
	
	private static final int GRID_SIZE = 9;
	
	private static boolean isNumberInRow(int[][] board, int number, int row) {
		for (int i = 0; i < GRID_SIZE; i++) {
			if (board[row][i] == number) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean isNumberInColumn(int[][] board, int number, int column) {
		for (int i = 0; i < GRID_SIZE; i++) {
			if (board[i][column] == number) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean isNumberInBox(int[][] board, int number, int row, int column) {
		int boxRow = row - row % 3;
		int boxColumn = column - column % 3;
		
		for (int i = boxRow; i < boxRow + 3; i++) {
			for (int j = boxColumn; j < boxColumn + 3; j++) {
				if (board[i][j] == number) {
					return true;
				}
			}
		}
		return false;
	}
	
	private static boolean isPlaceValid(int[][] board, int number, int row, int column) {
		return !isNumberInRow(board, number, row) && 
			!isNumberInColumn(board, number, column) &&
			!isNumberInBox(board, number, row, column);
	}
	
	
	
	public static void main(String[] args) {
		int[][] board = {
				{6, 4, 1, 3, 0, 0, 0, 0, 0},
				{2, 0, 5, 0, 1, 4, 0, 7, 0},
				{0, 0, 7, 0, 6, 0, 0, 4, 1},
				{9, 7, 0, 0, 2, 6, 0, 3, 0},
				{5, 0, 0, 4, 9, 0, 6, 1, 0},
				{4, 1, 0, 0, 0, 3, 7, 0, 9},
				{8, 5, 0, 0, 3, 9, 1, 0, 0},
				{1, 0, 0, 7, 0, 5, 4, 0, 0},
				{0, 0, 0, 6, 0, 0, 2, 8, 0}
		};
	}

}
