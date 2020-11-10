/*
 *
 *Laxmi Namboodiri
 *11/4/20
 *Connect4.java
 *
 */

public class Connect4 {
	public static void main(String args[]) {
		//creates new board
		Board b1 = new Board();
		User u1 = new User();
		u1.assignColor();
		//calls makeBoard method
		String[][] display = b1.makeBoard();
		//displays the array 
		b1.printBoard();
		b1.guess(u1.placeChips());
		b1.printBoard();



	}
}
