
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
		if (choice.equals("Y") || choice.equals("y")) {
			
		}
		return null;
	}
	
	public String winnerSelcection() {
		
		return null;
	}
	
}
