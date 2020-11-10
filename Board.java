/*
 *
 *Laxmi Namboodiri
 *11/4/20
 *Board.java
 *
 */
public class Board {
	//Makes board 
	String [][] display = new String[6][7];

	public String[][] makeBoard() {
	//sets placeholders as zero
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				display[i][j] ="0";
			}
		}
		return display;
	}
	public void printBoard() {
System.out.println("\n 1 2 3 4 5 6 7 ");
		for(int x = 0; x < 6; x++) {
		  	for(int y = 0; y < 7; y++) {                                                  					System.out.print(" " + display[x][y]);
			}
				System.out.println("");
		}
	}

	public void guess(int col, int count) {
		col = col - 1;
		
		boolean empty = false;
		int row = 5;
		display[5][6] = "R";
		while(!empty) {
			if (display[row][col].equals("0")) {
				display[row][col] = p1;
				empty = true;
			}
			else {
				row--;
			}
		}
	}


}



