/*
 *
 *Laxmi Namboodiri
 *11/4/20
 *User.java
 *
 */

import java.util.Scanner;

public class User{
	Scanner scan = new Scanner(System.in);
	int count = 0;
	public void assignColor() {
		System.out.print("Player 1: Would you like Yellow or Red? (Enter Yellow or Red): ");
		if (scan.next().toLowerCase().equals("red")){
			String p1 = "R";
			String p2 = "Y";
		}
		else if(scan.next().toLowerCase().equals("yellow")) {
			String p1 = "Y";
			String p2 = "R";

		}
	}
	
	public int[] placeChips(){
	count++;
	if(count%2 == 0) {
	System.out.print("Player 1, what column (between 1-7) would you like to place your chip? "); 
	}
	else {
System.out.print("Player 2, what column (between 1-7) would you like to place your chip? "); 
	}

	int col = scan.nextInt();
	String temp = scan.nextLine();
	int[] colcount = new {col, count};
	
	return col, count;
	}
}
