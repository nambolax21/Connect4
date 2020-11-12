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
	//count determines what round it is; i.e. which player's turn it is
	int count = 0;
	//method assignColor()
	//allows player 1 to choose the color they want between yellow and red for their chips
	public String[] assignColor() {
		//p1 and p2 are player 1 and 2, respectively
		String p1 = "I";
		String p2 = "I";
		//prompts p1 to input their color of choice 
		System.out.print("Player 1: Would you like Yellow or Red? (Enter Yellow or Red): ");
		String p3 = scan.nextLine();
		//System.out.println(p1);
		//if the p1 enters they want red, they are assign "R" and p2 is "Y" as red and yellow to place as chips
		if (p3.toLowerCase().equals("red")){
			p1 = "R";
			p2 = "Y";
		//	System.out.println(p1); just for debugging
		}//end if statement
		else if(p3.toLowerCase().equals("yellow")) {
			p1 = "Y";
			p2 = "R";
			//System.out.println(p1); just for debugging
		}// end else if statement
		String[] player = new String[]{p1, p2};
		return player; //returns who is who
	}//end assignColor() method
	

	//method placeColumn()
	//prompts user for where they want to place their chip and returns the value of the column 1-7
	public int[] placeColumn(){
	count++;
	if(count%2 == 0) {
	System.out.print("Player 1, what column (between 1-7) would you like to place your chip? "); 
	}
	else {
System.out.print("Player 2, what column (between 1-7) would you like to place your chip? "); 
	}

	int col = scan.nextInt();
	String temp = scan.nextLine();
	int[] colcount = new int[2];
	colcount[0] = col;
	colcount[1] = count;
	
	return colcount;
	}//end placeChips()
}//end User.java
