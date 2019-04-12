//Dylan Blackmer     YouGotIt

//imports
import java.util.Random;

import javax.swing.JOptionPane;

public class YouGotIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//initial setup
		Random number = new Random(); //creates a random number generator
		int num = number.nextInt(300) + 1; //chooses a random number between 1-300
		int tenAbove = num + 10;
		int tenBelow = num - 10;
		System.out.println("Number: " + num); //prints random number in console to help debug
		int counter = 0; //initiates variable used to count number of guesses
		int guess = 0; //creates var for user guess
		
	//main control flow
		while ((num != guess) && (counter <= 5)) { //loop continues so long as user guesses incorrectly or guess count goes too high
			String guessPromt = JOptionPane.showInputDialog("Guess a number between 1 and 300."); //promts user for a guess
			guess = Integer.parseInt(guessPromt); //stores user guess
			System.out.println("Guess: " + guess);
			if (num == guess) {
				JOptionPane.showMessageDialog(null, "Great guess! The number was " + num + ".");
			} else if ((num < guess) && (guess <= tenAbove)) {
				JOptionPane.showMessageDialog(null, "Ooooof, so close bud. Just a liiiiiiittle too high, Guess again.");
			} else if ((tenBelow <= guess) || (guess < num)) {
				JOptionPane.showMessageDialog(null, "Ouch, that's gotta hurt. Just a tad too low. Guess again.");
			} else if ((guess > 300) || (guess < 1)){
				JOptionPane.showMessageDialog(null, "Error: Input out of range. Guess again");
				counter -= 1;
			} else if (guess > num) {
				JOptionPane.showMessageDialog(null, "Too high my guy. Guess again.");
			} //else if () {}
			System.out.println("Guess Count: " + counter);
			
			
		}
		
		
	}

}
