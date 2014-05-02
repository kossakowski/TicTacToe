package TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
	String Character;
	Scanner input = new Scanner(System.in);

	public String getCharacter() {
		return Character;
	}

	public void setCharacter(String character) {
		Character = character;
	}
	
	public void setToken(int position, TTTBoard board) {
		if (board.isEmpty(position)){
			if (this.Character.equals("X")){
				board.setCross(position);
			}
			if (this.Character.equals("O")){
				board.setNought(position);
			}
		}
	}
	public int getNextMove(){
		int nextMovePosition;
		System.out.println("Please specify where you want to place the " +this.Character+" by typing its position (1-9):");
		nextMovePosition = input.nextInt();
		/*do {
		System.out.println("Please specify where you want to place the " +this.Character+" by typing its position (1-9):");
		nextMovePosition = input.nextInt();
		}
		while(!(input.hasNextInt()));
		while (nextMovePosition > 9 || nextMovePosition< 1){
			System.out.println("Please specify and integer ranging from 1 to 9:");
			nextMovePosition = input.nextInt();
		}*/
		return nextMovePosition-1;
		
	}
}
