import GameFiles.*;
import java.util.Scanner;

public class PlayYahtzee{
	
	public static void main(String[] args){
		boolean playing = true;
		String action = "";
		Scanner inputDevice = new Scanner (System.in);
		
		while (playing == true){
			System.out.println("Roll the dice, get two 6's for a Yahtzee!");
			System.out.println("Or you can quit if you're not feeling lucky...");
			System.out.println("What would you like to do?");
			
			switch(action){
				case "roll":
					break;
				case "quit":
					break;
				default:
			}
			
			
		}
	}
}