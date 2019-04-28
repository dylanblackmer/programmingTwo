//imports
import java.util.Random;
import javax.swing.JOptionPane;

public class ChoiceChecker {

//initialize
	public ChoiceChecker() {
		
	}
	Random rand = new Random();
	public int compWins = 0;
	public int playerWins = 0;
	
//functions
	public void initialize() {
		JOptionPane.showMessageDialog(null, "Welcome to Rock, Paper, Scissors!\nFirst, the computer randomly chooses a number.\nThen, you will be asked if you'd like a random pick, you may reply yes (Y) or no (N).\nFinally, choices will be compared and a winner announced.", "Welcome", JOptionPane.INFORMATION_MESSAGE);
		String name = JOptionPane.showInputDialog(null, "What's your name?", "Introduction", JOptionPane.QUESTION_MESSAGE);
		theGame(name);
	}
	public void theGame(String name) {
		//computer choose
		String compChoiceString = computerSelect();
		//player choose
		String chooseOrNo = JOptionPane.showInputDialog(null, "Would you like to randomize your selection, " + name + "? (Y/N)", "Randomize?", JOptionPane.QUESTION_MESSAGE);
		String playerChoiceString = playerSelect(chooseOrNo);
		//convert to numbers
		int compChoiceInt = choiceStringToNum(compChoiceString);
		int playerChoiceInt = choiceStringToNum(playerChoiceString);
		//winner select
		String winner = winnerSelcection(compChoiceInt, playerChoiceInt);
		System.out.println("Winner: " + winner);
		//final output
		if (winner.equals("Tie")) {
			JOptionPane.showMessageDialog(null, "It was a tie!\n\n" + name + "'s Wins: " + playerWins + "    Computer Wins: " + compWins, "Tie", JOptionPane.INFORMATION_MESSAGE);
		} else if (winner.equals("Player")) {
			playerWins += 1;
			JOptionPane.showMessageDialog(null, name + " won!\n\n" + name + "'s Wins: " + playerWins + "    Computer Wins: " + compWins, "You win!", JOptionPane.INFORMATION_MESSAGE);
		} else if (winner.equals("Computer")) {
			compWins += 1;
			JOptionPane.showMessageDialog(null, "Computer won!\n\n" + name + "'s Wins: " + playerWins + "    Computer Wins: " + compWins, "You lose.", JOptionPane.INFORMATION_MESSAGE);
		}
		//replay?
		String replay = JOptionPane.showInputDialog(null, "Would you like to play again, " + name + "? (Y/N)", "Replay?", JOptionPane.QUESTION_MESSAGE);
		if (replay.equals("y") || replay.equals("Y")) {
			theGame(name);
		} else if (replay.equals("n") || replay.equals("N")) {
			JOptionPane.showMessageDialog(null, "Thanks for playing " + name + "!", "Thanks", JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Error: Please restart program.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
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
		} else  if (choice.equals("N") || choice.equals("n")) {
			String playerChoice = JOptionPane.showInputDialog(null, "Rock, Paper, or Scissors?", "Choose", JOptionPane.QUESTION_MESSAGE);
			System.out.println("Player chooses " + playerChoice);
			return playerChoice;
		} else {
			JOptionPane.showMessageDialog(null, "Error: Please restart program.", "Error", JOptionPane.ERROR_MESSAGE);
			return null;
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
