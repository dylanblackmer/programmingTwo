//Dylan Blackmer	Methods

//imports
import java.util.Scanner;


public class Methods {
	
	private int var; //variable used in constructor
	public Methods(int x) { //constructor used for communication between "Methods" class and "WuTang" class.
		var = x;
	}
	
//methods
	
	//methodMan
	public String methodMan(int repeat, double num) {
		double newNumber = repeat * num; //multiplies the user's two numbers
		if (((newNumber > -10) && (newNumber <= 10)) || ((newNumber >= 90) && (newNumber <= 110))) { //checks to see if the new number is within 10 of zero or 100
			return "You had a cool number. Here it is: " + newNumber; //if new number fits, compliments user and displays their number
		} else {
			return "Your number wasn't cool enough. Sorry."; //if new number is no good, insults to user
		}
	}
	
	//rZA
	public double rZA(boolean doYouLike) { //simple control flow whose outcome is based on user's true/false input
		if (doYouLike) { 
			return 63.7;
		} else {
			return 6.9;
		}
	}
	
	//onceUponATime
	public void onceUponATime() { //nothin to see here
		//String name = JOptionPane.showInputDialog(null, "You found our secret album, welcome to the clan.\n\nWhat's your name??", "Congrats and welcome!", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "1. Method Man\n2. RZA\n3. Ol' Dirty Bastard\n4. GZA\n5. Ghostface Killah\n6. " + name + "\n7. Raekwon\n8. Inspectah Deck\n9. U-God\n10. Cappadonna\n\nWelcome to the clan.", "The Clan", JOptionPane.PLAIN_MESSAGE);
		Scanner input = new Scanner(System.in);
		System.out.print("You found our secret album, welcome to the clan.\n\nWhat's your name?? ");
		String name = input.nextLine();
		System.out.println("The Clan: ");
		System.out.println("1. Method Man\n2. RZA\n3. Ol' Dirty Bastard\n4. GZA\n5. Ghostface Killah\n6. " + name + "\n7. Raekwon\n8. Inspectah Deck\n9. U-God\n10. Cappadonna\n\nWelcome to the clan.");
		input.close();
		
		
	}
	
	//gZA
	public int gZA(String num1, String num2) { 
		int x = 0; //represents the first number as an int
		int y = 0; //represents the second number as an int
		
		//a long control flow that checks the the two stings the user provided, this block checks for which single number the user has spelt, adding an int value to x and y
		if (num1.equals("zero") || num1.equals("Zero")) {
			x = 0;
		} else if (num1.equals("one") || num1.equals("One")) {
			x = 1;
		} else if (num1.equals("two") || num1.equals("Two")) {
			x = 2;
		} else if (num1.equals("three") || num1.equals("Three")) {
			x = 3;
		} else if (num1.equals("four") || num1.equals("Four")) {
			x = 4;
		} else if (num1.equals("five") || num1.equals("Five")) {
			x = 5;
		} else if (num1.equals("six") || num1.equals("Six")) {
			x = 6;
		} else if (num1.equals("seven") || num1.equals("Seven")) {
			x = 7;
		} else if (num1.equals("eight") || num1.equals("Eight")) {
			x = 8;
		} else if (num1.equals("nine") || num1.equals("Nine")) {
			x = 9;
		} else {
/* nice */	return 999;
		}
		
		if (num2.equals("zero") || num2.equals("Zero")) {
			y = 0;
		} else if (num2.equals("one") || num2.equals("One")) {
			y = 1;
		} else if (num2.equals("two") || num2.equals("Two")) {
			y = 2;
		} else if (num2.equals("three") || num2.equals("Three")) {
			y = 3;
		} else if (num2.equals("four") || num2.equals("Four")) {
			y = 4;
		} else if (num2.equals("five") || num2.equals("Five")) {
			y = 5;
		} else if (num2.equals("six") || num2.equals("Six")) {
			y = 6;
		} else if (num2.equals("seven") || num2.equals("Seven")) {
			y = 7;
		} else if (num2.equals("eight") || num2.equals("Eight")) {
			y = 8;
		} else if (num2.equals("nine") || num2.equals("Nine")) {
			y = 9;
		} else {
			return 999;
		}
		
		return x + y; //outputs the users 2 numbers added together as an integer
	}
	
	//raekwon
	public boolean raekwon(int x, int y, int z) {
		int total = x + y + z; //adds all of the users numbers together
		//tests to see if total is divisible by 10, outputting a boolean
		if ((total % 10) == 0) { 
			return true;
		} else {
			return false;
		}
	}
	
	//inspectahDeck
	public String inspectahDeck(double x, int y) {
		double total = x + y; //adds user's numbers
		//checks to see if total is bigger, smaller, or equal to 50
		if (total < 50) {
			return "Number too small.";
		} else if (total > 50) {
			return "Number too big.";
		} else if (total == 50) {
			return "Number is juuuust right.";
		} else {
			return null;
		}
	}
	
	//cappadonna
	public double cappadonna(String x) {
		//takes user's word and counts how many characters are in it
		if (x.contentEquals("OnceUponaTimeinShaolin") || x.equals("onceuponatimeinshaolin") || x.equals("OnceUponATimeInShaolin")) {
			onceUponATime();
		} else {
			double wordLength = x.length(); //counts characters in string
			return wordLength;
		}
		return 0;
		
	}
}
