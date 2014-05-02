package TicTacToe;

import java.util.Scanner;

public class Game {
	int roundNumber = 1;
	
	public String getThePlayerToken(Scanner input){
		String in;
		System.out.println("Please choose either 'X' or 'O':");
		in= input.nextLine();
		while (!(in.equals("X")|| in.equals("O"))){
			System.out.println("The inputed text is not X nor O. Please input either X or O and press enter");
			in = input.next();
		
		}
		return in;
	}
	
	public void welcomeScreen(String message){
		System.out.println(message);
	}
	
	public void printRound(){
		System.out.println("======== Round " +this.roundNumber+" ========");
		System.out.println();
	}
}
