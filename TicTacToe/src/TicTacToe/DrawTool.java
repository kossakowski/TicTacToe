package TicTacToe;

public class DrawTool {
	private TTTBoard DrawnTTTBoard;
	
	public DrawTool(TTTBoard DrawnTTTBoard){
		this.DrawnTTTBoard = DrawnTTTBoard;
	}
	
	public void DrawBoard (){
		for (int i = 0; i<9;i++){
			if (i != 0 && i % 3 == 0){
					System.out.println();
					System.out.print("-----------");
					System.out.println();
				}
			if (DrawnTTTBoard.isEmpty(i)){
					System.out.print("   ");
				}
			if (DrawnTTTBoard.hasCross(i)){
					System.out.print(" X ");
				}
			if (DrawnTTTBoard.hasNought(i)){
					System.out.print(" O ");
				}
			if (i != 2 && i != 5 && i != 8){
				System.out.print("|");
				}
		}
	}
	
}
