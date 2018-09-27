import Yahtzee.*;
import java.util.Scanner;

public class PlayYahtzee{
	public static void main (String[] args){
		Yahtzee game = new Yahtzee();
		Scanner iDevice = new Scanner(System.in);
		char cont = 'y';
		
		while(cont != 'q'){
		System.out.println("You rolled a:");
		System.out.println("     " + game.toss());
		System.out.println("                            ");
		System.out.println("****************************");
		System.out.println(" What do you want to do?");
		System.out.println(" t) Toss your dice");
		System.out.println(" q) Quit game");
		System.out.println("*****************************");
		System.out.println("                            ");
		System.out.print("Choose an option: \n");
		cont = iDevice.next().charAt(0);
		iDevice.nextLine();

		}
	}
}





//////////////////////////////////////////////////////////
// import GameFiles.*;
// import java.util.Scanner;

// public class PlayYahtzee{
	
	// public static void main(String[] args){
		// boolean playing = true;
		// String action = "";
		// Scanner inputDevice = new Scanner (System.in);
		
		// while (playing == true){
			// System.out.println("Roll the dice, get two 6's for a Yahtzee!");
			// System.out.println("Or you can quit if you're not feeling lucky...");
			// System.out.println("What would you like to do?");
			
			// switch(action){
				// case "roll":
					// break;
				// case "quit":
					// break;
				// default:
			// }
			
			
		// }
	// }
// }