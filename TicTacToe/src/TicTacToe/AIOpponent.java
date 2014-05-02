package TicTacToe;

import java.util.ArrayList;
import java.util.List;

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
	/*@Override
	public int getNextMove(TTTBoard board){
		ArrayList<Integer> emptyFieldsList = new ArrayList<Integer>();
		emptyFieldsList = this.getEmptyFields(board);
		for (int i = 0; i<emptyFieldsList)*/
	}
