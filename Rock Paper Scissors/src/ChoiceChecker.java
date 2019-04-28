//imports
import java.util.Random;

import javax.swing.JOptionPane;

public class ChoiceChecker {

//initialize
	public ChoiceChecker() {
		
	}
	Random rand = new Random();
	
//functions
	public String choiceNumToString(int choice) {
		if (choice == 1) {
			return "rock";
		} else if (choice == 2) {
			return "paper";
		} else if (choice == 3) {
			return "scissors";
		} else {
			return "error";
		}
	}
	
	public int choiceStringToNum(String choice) {
		if (choice.equals("rock")) {
			return 1;
		} else if (choice.equals("paper")) {
			return 2;
		} else if (choice.equals("scissors")) {
			return 3;
		} else {
			return 0;
		}
	}
	
	public String computerSelect() {
		int compChoice = rand.nextInt(3) + 1;
		String compChoiceString = choiceNumToString(compChoice);
		System.out.println("Computer chooses " + compChoiceString);
		return compChoiceString;
	}
	

	public String playerSelect(String choice) {
		if (choice.equals("Y") || choice.equals("y")) {
			int playerChoice = rand.nextInt(3) + 1;
			String playerChoiceString = choiceNumToString(playerChoice);
			System.out.println("Player chooses " + playerChoiceString);
			return playerChoiceString;
		} else {
			String playerChoice = JOptionPane.showInputDialog(null, "Rock, Paper, or Scissors?", "Choose", JOptionPane.QUESTION_MESSAGE);
			System.out.println("Player chooses " + playerChoice);
			return playerChoice;
		}
	}
	
	public String winnerSelcection(int comp, int player) {
		//key: 0 = tie, 1 = player, 2 = computer, 3 = error
		if (comp == 1) {
			if (player == 1) {
				return "Tie";
			} else if (player == 2) {
				return "Player";
			} else if (player == 3) {
				return "Computer";
			} else {
				return null;
			}
		} else if (comp == 2) {
			if (player == 1) {
				return "Computer";
			} else if (player == 2) {
				return "Tie";
			} else if (player == 3) {
				return "Player";
			} else {
				return null;
			}
		} else if (comp == 3) {
			if (player == 1) {
				return "Player";
			} else if (player == 2) {
				return "Computer";
			} else if (player == 3) {
				return "Tie";
			} else {
				return null;
			}
		} else {
			return null;
		}
	
	}
	
}
