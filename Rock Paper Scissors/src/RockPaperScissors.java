//imports
import java.util.Random;

import javax.swing.JOptionPane;


public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//initialize
		ChoiceChecker checker = new ChoiceChecker();
		Random rand = new Random();
		
	//computer choose
		int randomChoice = rand.nextInt(3) + 1;
		System.out.println("Computer choice: " + randomChoice);
		String compChoice = checker.checkTheChoice(randomChoice);
		System.out.println("Computer chooses " + compChoice);
		
	//
		String chooseOrNo = JOptionPane.showInputDialog(null, "Would you like to randomize your selection? (Y/N)", "Choose?", JOptionPane.QUESTION_MESSAGE);
		checker.playerSelect(chooseOrNo);
		
	}

}
