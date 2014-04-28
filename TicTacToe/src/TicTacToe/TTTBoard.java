package TicTacToe;

public class TTTBoard {
	public enum Field {NOUGHT, EMPTY,CROSS}
	private Field[] BoardArray = new Field[]{Field.EMPTY,Field.EMPTY,Field.EMPTY,
			Field.EMPTY,Field.EMPTY,Field.EMPTY,Field.EMPTY,Field.EMPTY,Field.EMPTY};
	
	public boolean isEmpty (int position){
		return this.BoardArray[position] == Field.EMPTY;
	}
	
	public void setCross (int position){
		this.BoardArray[position] = Field.CROSS;
	}
	
	public boolean hasCross (int position){
		return this.BoardArray[position] == Field.CROSS;
	}
	
	public void setNought (int position){
		this.BoardArray[position] = Field.NOUGHT;
	}
	
	public boolean hasNought (int position){
		return this.BoardArray[position] == Field.NOUGHT;
	}
}
