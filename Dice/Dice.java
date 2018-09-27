package Dice;
import java.util.*;


public class Dice{
	private Random random = new Random();
	private int number;
	
	public Dice (){
		random = new Random();
		
	}	
	
	public int roll(){
		number = random.nextInt(6) + 1;
		return number;
		
	}
}





//////////////////////////////////////////////////////////
// public class Dice{
	// private int someNumber;
	
	// public void roll (){
		// Random random = new Random();
		// someNumber = random.nextInt(6) -1;
	// }
	// public int get_roll(){
		// return someNumber;
	// }
	// public string toString (){
		// return Integer.toString(someNumber);
	// }
// }