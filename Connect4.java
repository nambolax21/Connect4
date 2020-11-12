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
		//assigns the player yellow or red
		String[] player = u1.assignColor();
		//calls makeBoard method
		b1.makeBoard();
		//displays the array 
		b1.printBoard();
		//looping until win = true
		boolean win = false;
		while(!win) {
		//calls method that allows the players to String[][] display = ick a column  and passes the column to placeChips() to place their chip at the respective place  
		b1.placeChips(u1.placeColumn(), player);
		//prints board with their guess
		b1.printBoard();
		win = b1.winner();
		}



	}
}
