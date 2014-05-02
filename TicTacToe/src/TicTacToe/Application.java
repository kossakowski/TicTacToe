/**
 * 
 */
package TicTacToe;

import java.util.Scanner;



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
		AIOpponent Computer = new AIOpponent();
		TTTBoard GameBoard = new TTTBoard ();
		DrawTool GameBoardDrawTool = new DrawTool(GameBoard);
		TTTGame.welcomeScreen("Welcome to the Awsome Tic Tac Toe game!");
		GamePlayer.setCharacter(TTTGame.getThePlayerToken(input));
		Computer.setCharacterToOpposite(GamePlayer.getCharacter());
		while (!(GameBoard.isSolvedForCrosses() || GameBoard.isSolvedForNought())){
			TTTGame.printRound();
			GameBoardDrawTool.DrawBoard();
			System.out.println();
			System.out.println();
			GamePlayer.setToken(GamePlayer.getNextMove(GameBoard), GameBoard);
			GameBoardDrawTool.DrawBoard();
			if (GameBoard.isSolvedForCrosses() || GameBoard.isSolvedForNought()){
				break;
			}
			System.out.println();
			System.out.println();
			System.out.println("The Computer Opponent makes a move");
			System.out.println();
			Computer.setToken(Computer.getNextMove(GameBoard), GameBoard);
			GameBoardDrawTool.DrawBoard();
	
		}
		if (GameBoard.isSolvedForCrosses()){
			if (GamePlayer.getCharacter().equals("X")){
				System.out.println();
				System.out.println();
				System.out.println("Congratulations! You have won.");
			}
			else{
				System.out.println();
				System.out.println();
				System.out.println("I am sorry... You have lost.");
			}
		}
		if (GameBoard.isSolvedForNought()){
			if (GamePlayer.getCharacter().equals("O")){
				System.out.println();
				System.out.println();
				System.out.println("Congratulations! You have won.");
			}
			else{
				System.out.println();
				System.out.println();
				System.out.println("I am sorry... You have lost.");
			}
		}
	}
}
