package TicTacToe;

import java.util.Scanner;

public class Player {
	String Character;
	Scanner input = new Scanner(System.in);

	public String getCharacter() {
		return Character;
	}

	public void setCharacter(String character) {
		this.Character = character;
	}
	
	public void setToken(int position, TTTBoard board) {
		if (board.isEmpty(position)){
			if (this.getCharacter().equals("X")){
				board.setCross(position);
			}
			if (this.getCharacter().equals("O")){
				board.setNought(position);
			}
		}
	}
	public int getNextMove(TTTBoard board){
		int nextMovePosition;
		System.out.println("Please specify where you want to place the " +this.Character+" by typing its position (0-8):");
		nextMovePosition = input.nextInt();
		while(!(board.isEmpty(nextMovePosition))){
			System.out.println("This position is occupied. Please specify another:");
			nextMovePosition = input.nextInt();
		}
		/*do {
		System.out.println("Please specify where you want to place the " +this.Character+" by typing its position (1-9):");
		nextMovePosition = input.nextInt();
		}
		while(!(input.hasNextInt()));
		while (nextMovePosition > 9 || nextMovePosition< 1){
			System.out.println("Please specify and integer ranging from 1 to 9:");
			nextMovePosition = input.nextInt();
		}*/
		return nextMovePosition;
		
	}
}
