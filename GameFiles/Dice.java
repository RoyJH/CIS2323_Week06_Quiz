public class Dice{
	private int someNumber;
	
	public void roll (){
		Random random = new Random();
		someNumber = random.nextInt(6) -1;
	}
	public int get_roll(){
		return someNumber;
	}
	public string toString (){
		return Integer.toString(someNumber);
	}
}