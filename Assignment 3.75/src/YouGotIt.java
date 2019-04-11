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
		System.out.println(num); //prints random number in console to help debug
		int counter = 0; //initiates variable used to count number of guesses
		int guess = 0; //creates var for user guess
		
	//main control flow
		while ((num != guess) && (counter <= 5)) { //loop continues so long as user guesses incorrectly or guess count goes too high
			String guessPromt = JOptionPane.showInputDialog("Guess a number between 1 and 300."); //promts user for a guess
			guess = Integer.parseInt(guessPromt); //stores user guess
			if (num == guess) {
				JOptionPane.showMessageDialog(null, "Great guess! The number was " + num + ".");
			}
			
			
			
		}
		
		
	}

}
