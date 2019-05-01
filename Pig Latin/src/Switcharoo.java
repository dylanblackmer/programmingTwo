import javax.swing.JOptionPane;

public class Switcharoo {

	public Switcharoo() {
		
	}
	//initialization
	public int test = 0;
	public int yesNo = 0;
	
	public void initialize() {
		if (test == 0) {
			yesNo = JOptionPane.showConfirmDialog(null, "Hello and welcome to the Pig Latin translator!\nAre you going from English to Pig Latin?", "Pig Latin Translator", JOptionPane.YES_NO_OPTION);
			test = 1;
		} else if (test == 1) {
			yesNo = JOptionPane.showConfirmDialog(null, "Are you going from English to Pig Latin?", "Pig Latin Translator", JOptionPane.YES_NO_OPTION);
		}
		
		if (yesNo == 0) {
			System.out.println("User chose eng to pig");
			String englishWord = JOptionPane.showInputDialog(null, "What word would you like to translate?", "Pig Latin Translator", JOptionPane.QUESTION_MESSAGE).toLowerCase();
			String latinWord = englishToPig(englishWord);
			int translateAgain = JOptionPane.showConfirmDialog(null, "All done!\nOriginal word: " + englishWord + ".\nPig Latin: " + latinWord + ".\nTranslate again?", "Pig Latin Translator", JOptionPane.YES_NO_OPTION);
			if (translateAgain == 0) {
				initialize();
			} else {
				JOptionPane.showMessageDialog(null, "Thanks for translating with us.\nHave a nice day!", "Pig Latin Tanslator", JOptionPane.PLAIN_MESSAGE);
			}
		} else if (yesNo == 1) {
			System.out.println("User chose pig to eng");
			String latinWord = JOptionPane.showInputDialog(null, "What word would you like to translate?", "Pig Latin Translator", JOptionPane.QUESTION_MESSAGE).toLowerCase();
			String englishWord = pigToEnglish(latinWord);
		} else {
			JOptionPane.showMessageDialog(null, "Error: Please restart program.", "Pig Latin Translator", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public String pigToEnglish(String latinWord) {
		String newWord = null;
		latinWord = latinWord.toLowerCase();
		int latinIndex = latinWord.length() - 1;
		System.out.println("Latin word: " + latinWord);
		if (latinWord.substring(0, 1).equals("a") || latinWord.substring(0, 1).equals("e") || latinWord.substring(0, 1).equals("i") || latinWord.substring(0, 1).equals("o") || latinWord.substring(0, 1).equals("u") || latinWord.substring(0, 1).equals("y")) {
			newWord = latinWord.substring(0, latinIndex - 2);
			System.out.println("New word: " + newWord);
		}
		return null;
		
	}
	
	public String englishToPig(String englishWord) {
		String newWord = null;
		englishWord = englishWord.toLowerCase();
		System.out.println("English word: " + englishWord);
		if (englishWord.substring(0, 1).equals("a") || englishWord.substring(0, 1).equals("e") || englishWord.substring(0, 1).equals("i") || englishWord.substring(0, 1).equals("o") || englishWord.substring(0, 1).equals("u") || englishWord.substring(0, 1).equals("y")) {
			newWord = englishWord + "way";
		} else {
			newWord = englishWord.substring(1) + englishWord.substring(0, 1) + "ay";	
		}
		return newWord;
		
	}
	
}
