//Dylan Blackmer	NameFlipper

//imports
import javax.swing.JOptionPane;

public class NameFlipper {

	public NameFlipper() { //establishes connection between classes
		
	}
	
	public void initialize() {
	//name input
		//welcomes user, asks for name, and stores it
		String name = JOptionPane.showInputDialog(null, "Welcome to Redrum!\nPlease enter a name and it will be flipped and returned to you.", "Redrum", JOptionPane.INFORMATION_MESSAGE);
		System.out.println("Name: " + name); //outputs name for debug
		String flippedName = nameFlip(name); //flips name
	//output and replay
		//gives user their fliped name, offers to flip another
		int yesNo = JOptionPane.showConfirmDialog(null, "All done!\nYour name: " + name + "\nFlipped name: " + flippedName + "\n\nWould you like to flip another name?", "Redrum", JOptionPane.YES_NO_OPTION);
		if (yesNo == 0) { //checks user's response
			initialize(); //reruns program
		} else if (yesNo == 1) {
			JOptionPane.showMessageDialog(null, "Thanks for droppin' by!\nHave a nice day!", "Redrum", JOptionPane.PLAIN_MESSAGE); //thanks user and says goodbye
		} else {
			JOptionPane.showMessageDialog(null, "Error: Please restart program.", "Redrum", JOptionPane.ERROR_MESSAGE); //shows error message
		}
	}
	
	public String nameFlip(String name) {
		
		int nameIndex = name.length() - 1; //takes length and subtracts one for index number
		System.out.println("Name length: " + (nameIndex + 1)); //outputs length for debug
		String flippedName = ""; //initializes flipped name string
		
		for (int i = nameIndex; i >= 0; i--) {
			flippedName += name.substring(i, i + 1); //adds the last character from the name to the beginning of the sting
			System.out.println(flippedName); //output for debug
		}
		
		flippedName = flippedName.toLowerCase(); //makes lowercase
		return flippedName; //returns name
		
		
	}
	
	
}