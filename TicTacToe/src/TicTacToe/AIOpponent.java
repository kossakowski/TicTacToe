package TicTacToe;

import java.util.ArrayList;
import java.util.Random;

public class AIOpponent extends Player{
	public ArrayList<Integer> getEmptyFields (TTTBoard board){
		ArrayList<Integer> emptyFieldsList = new ArrayList<Integer>();
		for (int i = 0; i < 9; i++){
			if (board.isEmpty(i)){
				emptyFieldsList.add(i);
			}
		}
		return emptyFieldsList;
	}
	
	public void printEmptyFields(ArrayList<Integer> emptyFieldsList){
		System.out.println(emptyFieldsList.toString());
	}
	
	public int getNextMove(TTTBoard board){
		ArrayList<Integer> emptyFieldsList = new ArrayList<Integer>();
		emptyFieldsList = this.getEmptyFields(board);
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(emptyFieldsList.size());
		return emptyFieldsList.get(randomNumber);
	}
	
	public void setCharacterToOpposite(String Character){
		if (Character.equals("X")){
			this.setCharacter("O");
		}
		if (Character.equals("O")){
			this.setCharacter("X");
		}
	}
}
