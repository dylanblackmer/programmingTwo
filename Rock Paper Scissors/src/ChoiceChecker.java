//imports
import java.util.Random;
import javax.swing.JOptionPane;


public class ChoiceChecker {

//initialize
	public ChoiceChecker() {
		//constructor to create communication with tester class
	}
	Random rand = new Random(); //creates randomization object
	public int compWins = 0; //initializes player wins variable
	public int playerWins = 0; //computer wins
	public int numOfGames = 1;
	
//functions
	public void initialize() {
		//gives player the rules
		JOptionPane.showMessageDialog(null, "Welcome to Rock, Paper, Scissors!\nFirst, you will be asked if you'd like to choose a random choice.\nThen, your selection will be compared to the computer's and a winner will be announced.\nThe game can be replayed over and over and your score, as well as the computer's, will be kept.\nEnjoy the game!", "Introduction", JOptionPane.INFORMATION_MESSAGE);
		String name = JOptionPane.showInputDialog(null, "What's your name?", "Introduction", JOptionPane.QUESTION_MESSAGE); //prompts user for their name
		theGame(name); //runs main game block
	}
	
	public void theGame(String name) {
		//misc
		System.out.println("Game " + numOfGames + ":");
		//computer choose
		String compChoiceString = computerSelect(); //randomly assigns a choice to the computer
		//player choose
		//asks player if they want a random selection 
		int chooseOrNo = JOptionPane.showConfirmDialog(null, "Would you like to randomize your selection, " + name + "?", "Game " + numOfGames, JOptionPane.YES_NO_OPTION);
		String playerChoiceString = playerSelect(chooseOrNo); //runs "playerSelect" with the player's input
		//convert to numbers
		int compChoiceInt = choiceStringToNum(compChoiceString); //converts computer's choice to number
		int playerChoiceInt = choiceStringToNum(playerChoiceString); //converts player's choice to number
		//announcment
		
		//winner select
		String winner = winnerSelcection(compChoiceInt, playerChoiceInt); //using the computer and player's choices, winner is selected
		System.out.println("Winner: " + winner); //output to console for debug
		//final output
		if (winner.equals("Tie")) { //if "winnerSelect" returns a tie, also shows overall score
			JOptionPane.showMessageDialog(null, "It was a tie!\n\n" + name + "'s Wins: " + playerWins + "    Computer Wins: " + compWins, "Game " + numOfGames, JOptionPane.INFORMATION_MESSAGE);
		} else if (winner.equals("Player")) { //if player wins, adds one point to their score and tells them they won. Also includes score board
			playerWins += 1;
			JOptionPane.showMessageDialog(null, name + " won!\n\n" + name + "'s Wins: " + playerWins + "    Computer Wins: " + compWins, "Game " + numOfGames, JOptionPane.INFORMATION_MESSAGE);
		} else if (winner.equals("Computer")) { //if computer wins, adds one point to its  score and alerts the player. Also includes score board
			compWins += 1;
			JOptionPane.showMessageDialog(null, "Computer won!\n\n" + name + "'s Wins: " + playerWins + "    Computer Wins: " + compWins, "Game " + numOfGames, JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Error: Please restart program.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		System.out.println(""); //adds a space in the console between games
		//replay?
		//asks player if they'd like to replay
		int replay = JOptionPane.showConfirmDialog(null, "Would you like to play again, " + name + "?", "Game " + numOfGames, JOptionPane.YES_NO_OPTION);
		if (replay == 0) { //if player says yes, rerun "theGame" method
			numOfGames += 1;
			theGame(name);
		} else if (replay == 1) { //if player says no, they're thanked for playing and ends program
			JOptionPane.showMessageDialog(null, "Thanks for playing " + name + "!", "Thanks", JOptionPane.PLAIN_MESSAGE);
		} else { //if anything else is input, error is displayed and program restarted
			JOptionPane.showMessageDialog(null, "Error: Please restart program.", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}
	
	public String choiceNumToString(int choice) { //checks which number is selected (computer or player number) and then converts the number to a string
		if (choice == 1) {
			return "rock";
		} else if (choice == 2) {
			return "paper";
		} else if (choice == 3) {
			return "scissors";
		} else {
/* nice */	return "error";
		}
	}
	
	public int choiceStringToNum(String choice) { //checks which string is chosen (computer or player input) and converts to an integer
		if (choice.equals("rock") || choice.equals("Rock")) {
			return 1;
		} else if (choice.equals("paper") || choice.equals("Paper")) {
			return 2;
		} else if (choice.equals("scissors") || choice.equals("Scissors")) {
			return 3;
		} else {
			return 0;
		}
	}
	
	public String computerSelect() { //creates a selection for computer
		int compChoice = rand.nextInt(3) + 1; //chooses random number (1-3)
		String compChoiceString = choiceNumToString(compChoice); //converts the number to a string
		System.out.println("Computer chooses " + compChoiceString); //outputs to console for debug
		return compChoiceString; //returns computer choice as a string
	}
	

	public String playerSelect(int choice) { //allows selection for player
		if (choice == 0) { //if yes for randomization
			int playerChoice = rand.nextInt(3) + 1; //chooses a random number (1-3)
			String playerChoiceString = choiceNumToString(playerChoice); //converts number to string
			System.out.println("Player chooses " + playerChoiceString); //outputs to console for debug
			return playerChoiceString; //returns choice as string
		} else if (choice == 1) { //if no
			String playerChoice = JOptionPane.showInputDialog(null, "Rock, Paper, or Scissors?", "Game " + numOfGames, JOptionPane.QUESTION_MESSAGE); //asks user for selection
			System.out.println("Player chooses " + playerChoice); //outputs to console for debug
			return playerChoice; //outputs choice as string
		} else { //if anything else
			JOptionPane.showMessageDialog(null, "Error: Please restart program.", "Error", JOptionPane.ERROR_MESSAGE); //display error
			return null;
		}
	}
	
	public String winnerSelcection(int comp, int player) { //decides who wins
		if (comp == 1) { //if computer chooses rock
			if (player == 1) { //player chooses rock
				return "Tie";
			} else if (player == 2) { //player chooses paper
				return "Player";
			} else if (player == 3) { //player chooses scissors
				return "Computer";
			} else { //if program gets here, something is wrong
				return null;
			}
		} else if (comp == 2) { //computer chooses paper
			if (player == 1) { //player chooses rock
				return "Computer";
			} else if (player == 2) { //player chooses paper
				return "Tie";
			} else if (player == 3) { //player chooses scissors
				return "Player";
			} else { //something's wrong
				return null;
			}
		} else if (comp == 3) { //computer chooses scissors
			if (player == 1) { //player chooses rock
				return "Player";
			} else if (player == 2) { //player chooses paper
				return "Computer";
			} else if (player == 3) { //player chooses scissors
				return "Tie";
			} else { //wrong
				return null;
			}
		} else { //also bad
			return null;
		}
	
	}
	
}
