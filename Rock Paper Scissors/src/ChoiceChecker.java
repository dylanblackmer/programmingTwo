//imports
import java.util.Random;

import javax.swing.JOptionPane;

public class ChoiceChecker {

	public ChoiceChecker() {
		
	}
	
	public String checkTheChoice(int compChoice) {
		
		if (compChoice == 1) {
			return "rock";
		} else if (compChoice == 2) {
			return "paper";
		} else if (compChoice == 3) {
			return "scissors";
		} else {
			return "error";
		}
	}
	
	public String playerSelect(String choice) {
		Random rand = new Random();
		if (choice.equals("Y") || choice.equals("y")) {
			int playerChoice = rand.nextInt(3) + 1;
			String playerChoiceString = checkTheChoice(playerChoice);
			System.out.println("Player chooses " + playerChoiceString);
			return playerChoiceString;
		} else {
			String playerChoice = JOptionPane.showInputDialog(null, "Rock, Paper, or Scissors?", "Choose", JOptionPane.QUESTION_MESSAGE);
			System.out.println("Player chooses " + playerChoice);
			return playerChoice;
		}
	}
	
	public String winnerSelcection() {
		
		return null;
	}
	
}
