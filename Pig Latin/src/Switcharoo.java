import javax.swing.JOptionPane;

public class Switcharoo {

	public Switcharoo() {
		
	}
	
	public void initialize() {
		int yesNo = JOptionPane.showConfirmDialog(null, "Hello and welcome to the Pig Latin translator!\nAre you going from English to Pig Latin?", "Pig Latin Translator", JOptionPane.YES_NO_OPTION);
		
		if (yesNo == 0) {
			System.out.println("User chose eng to pig");
			englishToPig();
		} else if (yesNo == 1) {
			System.out.println("User chose pig to eng");
			pigToEnglish();
		} else {
			JOptionPane.showMessageDialog(null, "Error: Please restart program.", "Pig Latin Translator", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public String pigToEnglish() {
		return null;
		
	}
	
	public String englishToPig() {
		String englishWord = JOptionPane.showInputDialog(null, "What word would you like to translate?", "Pig Latin Translator", JOptionPane.QUESTION_MESSAGE);
		englishWord = englishWord.toLowerCase();
		System.out.println("English word: " + englishWord);
		return null;
		
	}
	
}
