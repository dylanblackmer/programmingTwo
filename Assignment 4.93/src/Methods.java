//Dylan Blackmer	Methods

//imports


public class Methods {

	private int var;
	
	public Methods(int x) {
		var = x;
	}
	
	public static String methodMan(int repeat, double num) {
		double newNumber = repeat * num;
		if (((newNumber > 0) && (newNumber <= 5)) || ((newNumber >= 90) && (newNumber <= 110))) {
			return "You had a cool number. Here it is: " + newNumber;
		} else {
			return "Your number wasn't cool enough. Sorry.";
		}
	}
	
	public static double rZA(boolean doYouLike) {
		if (doYouLike) {
			return 63.7;
		} else {
			return 6.9;
		}
	}
	
	public static int gZA(String num1, String num2) {
		int x = 0; //represents the first number as an int
		int y = 0; //represents the second number as an int
		
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
		}
		
		return x + y;
	}
	
}
