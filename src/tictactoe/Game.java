package tictactoe;

import java.util.Scanner;

public class Game {
	private Board board;
	private Player player1;
	private Player player2;
	private boolean againstComputer;

	public Game(boolean againstComputer) {
		this.againstComputer = againstComputer;
		board = new Board();
		player1 = new Player("Jogador 1", 'X');
		if (againstComputer) {
			player2 = new Player("Computador", 'O');
		} else {
			player2 = new Player("Jogador 2", 'O');
		}
	}

	public void startGame() {
		Scanner scanner = new Scanner(System.in);
		Player currentPlayer = player1;
		boolean gameWon = false;

		while (!board.isBoardFull() && !gameWon) {
			board.printBoard();
			System.out.println("Vez de " + currentPlayer.getName() + " (" + currentPlayer.getSymbol() + "):");

			int row, col;
			if (currentPlayer.getName().equals("Computador")) {
				row = (int) (Math.random() * 3);
				col = (int) (Math.random() * 3);
			} else {
				System.out.print("Informe a linha (0-2): ");
				row = scanner.nextInt();
				System.out.print("Informe a coluna (0-2): ");
				col = scanner.nextInt();
			}

			if (board.placeMove(row, col, currentPlayer.getSymbol())) {
				if (board.checkWin(currentPlayer.getSymbol())) {
					gameWon = true;
					System.out.println(currentPlayer.getName() + " venceu!");
				} else {
					currentPlayer = (currentPlayer == player1) ? player2 : player1;
				}
			} else {
				System.out.println("Movimento inválido. Tente novamente.");
			}
		}

		if (!gameWon) {
			System.out.println("Empate!");
		}

		board.printBoard();
		scanner.close();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Jogar contra o computador? (sim/nao): ");
		String response = sc.nextLine();
		boolean againstComputer = response.equalsIgnoreCase("sim");

		Game game = new Game(againstComputer);
		game.startGame();
	}
}
