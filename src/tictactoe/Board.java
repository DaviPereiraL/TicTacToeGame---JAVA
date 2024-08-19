package tictactoe;

public class Board {
	private char[][] board;
	private int size = 3;

	public Board() {
		board = new char[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				board[i][j] = '-';
			}
		}
	}

	public void printBoard() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean placeMove(int row, int col, char symbol) {
		if (board[row][col] == '-') {
			board[row][col] = symbol;
			return true;
		}
		return false;
	}

	public boolean checkWin(char symbol) {
		
		return false;
	}

	public boolean isBoardFull() {
		
		return false;
	}
}
