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
				display[i][j] = "0";
			}//end nested for loop
		}//end for loop
		return display;
	}//end makeBoard()

	//prints out board
	public void printBoard() {
System.out.println("\n 1 2 3 4 5 6 7 ");
		for(int x = 0; x < 6; x++) {
		  	for(int y = 0; y < 7; y++) {                                  	System.out.print(" " + display[x][y]);
			}//end nested for loop
			System.out.println("");
		}//end for loop
	}//end printBoard()

	//method placeChips()
	//recieves the column the player guess, the count so with round, p1 and p2 who are who
	//places chips where the player wanted 
	public void placeChips(int[] colcount, String[] player) {
		int col = colcount[0];
	   	int count = colcount[1];
		String p1 = player[0];
		String p2 = player[1];	
		//subtracts 1 for index
		col = col - 1;
		
		boolean empty = false;
		int row = 5;
		//display[5][6] = "R";
		//places it in the column where it is free
		while(!empty) {
			if (display[row][col].equals("0")) {
				if (count%2 == 0){
					display[row][col] = p2;
				}//ends nested nested if
				else {
					display[row][col] = p1;
				}//ends nested nested else
				empty = true;
			}//end nested conditional
			else {
				row--;
			}//end nested else
		}//end while loop
	}//end placeChips()

	//determines if there is a winner
	public boolean winner() {
				//System.out.print("in winner");
				//check horizontally, sideways
			for(int i = 5; i >= 0; i--){
				for(int j = 0; j <= 3; j++) {
					if ((display[i][j].equals("R") || display[i][j].equals("Y")) && display[i][j].equals(display[i][j+1]) && display[i][j+1].equals(display[i][j+2]) && display[i][j+2].equals(display[i][j+3])) {
						
						System.out.println("You won!");
					
						return true;
					}
				}
			}
			//checks veritcally up and down
			for(int i = 5; i >= 3; i--){
				for(int j = 0; j <= 6; j++) {
					if ((display[i][j].equals("R") || display[i][j].equals("Y")) && display[i][j].equals(display[i-1][j]) && display[i - 1][j].equals(display[i - 2][j]) && display[i - 2][j].equals(display[i - 3][j])) {
						
						System.out.println("You won!");
					
						 return true;
					}
				}
			}
			//checks like staircase up
			for(int i = 5; i >= 3; i--){
				for(int j = 0; j <= 3; j++) {
					if ((display[i][j].equals("R") || display[i][j].equals("Y")) && display[i][j].equals(display[i-1][j + 1]) && display[i - 1][j + 1].equals(display[i - 2][j + 2]) && display[i - 2][j + 2].equals(display[i - 3][j + 3])) {
						
						System.out.println("You won!");
					
						 return true;
					}
				}
			}
			checks staircase down
			for(int i = 5; i >= 3; i--){
				for(int j = 6; j >= 3; j--) {
					if ((display[i][j].equals("R") || display[i][j].equals("Y")) && display[i][j].equals(display[i - 1][j - 1]) && display[i - 1][j - 1].equals(display[i - 2][j - 2]) && display[i - 2][j - 2].equals(display[i - 3][j - 3])) {
						
						System.out.println("You won!");
					
						 return true;
					}
				}
			}



		return false;
}
	


}



