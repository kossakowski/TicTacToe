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
	
	public boolean isSolvedForCrosses() {
		if (this.hasCross(0) && this.hasCross(1) && this.hasCross(2)){
				return true;
			}
		else if (this.hasCross(3) && this.hasCross(4) && this.hasCross(5)){
				return true;
			}
		else if (this.hasCross(6) && this.hasCross(7) && this.hasCross(8)){
				return true;
			}
		else if (this.hasCross(0) && this.hasCross(3) && this.hasCross(6)){
				return true;
			}
		else if (this.hasCross(1) && this.hasCross(4) && this.hasCross(7)){
				return true;
			}
		else if (this.hasCross(2) && this.hasCross(5) && this.hasCross(8)){
			return true;
			}
		else if (this.hasCross(0) && this.hasCross(4) && this.hasCross(8)){
			return true;
			}
		else if (this.hasCross(2) && this.hasCross(4) && this.hasCross(6)){
			return true;
			}
		else {
			return false;
			}
		}
	public boolean isSolvedForNought() {
		if (this.hasNought(0) && this.hasNought(1) && this.hasNought(2)){
				return true;
			}
		else if (this.hasNought(3) && this.hasNought(4) && this.hasNought(5)){
				return true;
			}
		else if (this.hasNought(6) && this.hasNought(7) && this.hasNought(8)){
				return true;
			}
		else if (this.hasNought(0) && this.hasNought(3) && this.hasNought(6)){
				return true;
			}
		else if (this.hasNought(1) && this.hasNought(4) && this.hasNought(7)){
				return true;
			}
		else if (this.hasNought(2) && this.hasNought(5) && this.hasNought(8)){
			return true;
			}
		else if (this.hasNought(0) && this.hasNought(4) && this.hasNought(8)){
			return true;
			}
		else if (this.hasNought(2) && this.hasNought(4) && this.hasNought(6)){
			return true;
			}
		else {
			return false;
			}
		}
	
}
			
