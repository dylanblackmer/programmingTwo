//imports
import java.util.Random;
import javax.swing.JOptionPane;


public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//initialize
		ChoiceChecker checker = new ChoiceChecker();
		Random rand = new Random();
		
	//rules
		JOptionPane.showMessageDialog(null, "Welcome to Rock, Paper, Scissors!\nFirst, the computer randomly chooses a number.\nThen, you will be asked if you'd like a random pick, you may reply yes (Y) or no (N).\nFinally, choices will be compared and a winner announced.", "Welcome", JOptionPane.INFORMATION_MESSAGE);
		
	//computer choose
		String compChoiceString = checker.computerSelect();
		
	//player choose
		String chooseOrNo = JOptionPane.showInputDialog(null, "Would you like to randomize your selection? (Y/N)", "Choose?", JOptionPane.QUESTION_MESSAGE);
		checker.playerSelect(chooseOrNo);
		
	}

}

