/**
 * 
 */
package TicTacToe;

import java.util.Scanner;

import TicTacToe.TTTBoard.Field;

/**
 * @author £ukasz Kossakowski kossakowski87[at]gmail.com
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Game TTTGame = new Game();
		Player GamePlayer = new Player ();
		TTTBoard GameBoard = new TTTBoard ();
		DrawTool GameBoardDrawTool = new DrawTool(GameBoard);
		TTTGame.welcomeScreen("Welcome to the Awsome Tic Tac Toe game!");
		GamePlayer.setCharacter(TTTGame.getThePlayerToken(input));
		TTTGame.printRound();
		GameBoardDrawTool.DrawBoard();
		System.out.println();
		System.out.println();
		GamePlayer.setToken(GamePlayer.getNextMove(), GameBoard);
	}
}
