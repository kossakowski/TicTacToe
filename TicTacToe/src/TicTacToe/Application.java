/**
 * 
 */
package TicTacToe;

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
		TTTBoard GameBoard = new TTTBoard ();
		DrawTool GameBoardDrawTool = new DrawTool(GameBoard);
		GameBoard.setCross(0);
		GameBoard.setNought(1);
		GameBoard.setCross(2);
		GameBoardDrawTool.DrawBoard();
	}

}
