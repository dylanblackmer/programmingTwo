//Dylan Blackmer     GrapeVine

//imports
import javax.swing.JOptionPane;


public class GrapeVine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//variable initialization
		int price = 0; //sets default price of table, determined by type of wood or whether or not table is finished (with sealant).
		int wood = 0; //sets default wood selection (0 corresponds with no type of wood)
		boolean finish = false; //sets initial selection of sealant choice
		boolean confirm = false; //sets initial confirmation choice
	
	//welcome message to users, explaining how to use the program
		JOptionPane.showMessageDialog(null, "Welcome to the Grape Vine furniture company!\nFirst, you will be asked to choose the type of wood you'd like. The price will be based on the type of wood.\nThen, you will decide whether or not you'd like a finsihed table (a table with sealant). This will increase the price.\nFinally, your final selection and price will be displayed.", "Introduction", JOptionPane.INFORMATION_MESSAGE);
	
	//wood input
		while (confirm == false) { //a boolean that stays false until the user confirms their selection, which turns "confirm" true and breaks the while loop.
		
		//Begins by asking the user what wood they'd like along with their options and then puts the value into an integer called "wood" and then outputs the value into the console for debugging
			String woodSelection = JOptionPane.showInputDialog(null, "Please select your wood type (number).\n\n1. Pine\n2. Oak\n3. Mahogany\n4. Cedar\n5. Bocote\n6. Sandelwood\n ", "Wood Selection", JOptionPane.QUESTION_MESSAGE);
			wood = Integer.parseInt(woodSelection);
			System.out.println("Wood: " + wood);
			if (wood == 1) {
			//After user makes their selection, the program prompts them to confirm their selection changing "confirm" to true or false and adding to their price
				String woodConfirm = JOptionPane.showInputDialog(null, "You have chosen Pine.\nIs this correct? (Y/N)\n ", "Confirm", JOptionPane.QUESTION_MESSAGE);
				if ((woodConfirm.equals("Y") || (woodConfirm.equals("y")))) {
					confirm = true;
					price += 100;
				} else {
					confirm = false;
					JOptionPane.showMessageDialog(null, "Sorry about that! Please select again.", "Oops!", JOptionPane.ERROR_MESSAGE);
				}
				
			} else if (wood == 2) {
			//All if/else loops in the "wood input" block have similar function
				String woodConfirm = JOptionPane.showInputDialog(null, "You have chosen Oak.\nIs this correct? (Y/N)\n ", "Confirm", JOptionPane.QUESTION_MESSAGE);
				System.out.println(woodConfirm);
				if ((woodConfirm.equals("Y") || (woodConfirm.equals("y")))) {
					confirm = true;
					price += 225;
				} else {
					confirm = false;
					JOptionPane.showMessageDialog(null, "Sorry about that! Please select again.", "Oops!", JOptionPane.ERROR_MESSAGE);
				}
				
			} else if (wood == 3) {
				String woodConfirm = JOptionPane.showInputDialog(null, "You have chosen Mahogany.\nIs this correct? (Y/N)\n ", "Confirm", JOptionPane.QUESTION_MESSAGE);
				if ((woodConfirm.equals("Y") || (woodConfirm.equals("y")))) {
					confirm = true;
					price += 1210;
				} else {
					confirm = false;
					JOptionPane.showMessageDialog(null, "Sorry about that! Please select again.", "Oops!", JOptionPane.ERROR_MESSAGE);
				}
				
			} else if (wood == 4) {
				String woodConfirm = JOptionPane.showInputDialog(null, "You have chosen Cedar.\nIs this correct? (Y/N)\n ", "Confirm", JOptionPane.QUESTION_MESSAGE);
				System.out.println(woodConfirm);
				if ((woodConfirm.equals("Y") || (woodConfirm.equals("y")))) {
					confirm = true;
					price += 975;
				} else {
					confirm = false;
/* nice */			JOptionPane.showMessageDialog(null, "Sorry about that! Please select again.", "Oops!", JOptionPane.ERROR_MESSAGE);
				}
				
			} else if (wood == 5) {
				String woodConfirm = JOptionPane.showInputDialog(null, "You have chosen Bocote.\nIs this correct? (Y/N)\n ", "Confirm", JOptionPane.QUESTION_MESSAGE);
				System.out.println(woodConfirm);
				if ((woodConfirm.equals("Y") || (woodConfirm.equals("y")))) {
					confirm = true;
					price += 6975;
				} else {
					confirm = false;
					JOptionPane.showMessageDialog(null, "Sorry about that! Please select again.", "Oops!", JOptionPane.ERROR_MESSAGE);
				}
				
			} else if (wood == 6) {
				String woodConfirm = JOptionPane.showInputDialog(null, "You have chosen Sandelwood.\nIs this correct? (Y/N)\n ", "Confirm", JOptionPane.QUESTION_MESSAGE);
				System.out.println(woodConfirm);
				if ((woodConfirm.equals("Y") || (woodConfirm.equals("y")))) {
					confirm = true;
					price += 2600;
				} else {
					confirm = false;
					JOptionPane.showMessageDialog(null, "Sorry about that! Please select again.", "Oops!", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "We're sorry. We don't have that item in stock. Please select again.", "Oops!", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		System.out.println("Price: " + price); //outputs price to console for debugging
		confirm = false; //resets "confirm" boolean to false for next while loop
		
	//sealant selection
		while (confirm == false) {
			
		//Begins by asking the user whether or they want a table with sealant, then asks them to confirm, changing the boolean to true or false, potentially breaking the while loop
			String finishSelection = JOptionPane.showInputDialog(null, "Would you like to add finishing to your table for an upcharge of $285? (Y/N)\n ", "Finish Selection", JOptionPane.QUESTION_MESSAGE);
			if ( finishSelection.equals("Y") || finishSelection.equals("y")) { //user chooses yes to sealant
			//prompts user to confirm their selection
				String finishConfirm = JOptionPane.showInputDialog(null, "You've chosen sealant.\nIs this correct? (Y/N)", "Confirm", JOptionPane.QUESTION_MESSAGE);
				if (finishConfirm.equals("Y") || finishConfirm.equals("y")) {
				//changes boolean and adjusts price
					confirm = true;
					finish = true;
					price += 285;
				} else {
				//changes boolean and provides error message
					confirm = false;
					JOptionPane.showMessageDialog(null, "Sorry about that! Please select again.", "Oops!", JOptionPane.ERROR_MESSAGE);
				}
			} else if (finishSelection.equals("N") || finishSelection.equals("n")) { //user chooses no sealant
			//this mini block is similar in functionality to the previous block
				String finishConfirm = JOptionPane.showInputDialog(null, "You've chosen no sealant.\nIs this correct? (Y/N)", "Confirm", JOptionPane.QUESTION_MESSAGE);
				if (finishConfirm.equals("Y") || finishConfirm.equals("y")) {
					confirm = true;
					finish = false;
				} else {
					confirm = false;
					JOptionPane.showMessageDialog(null, "Sorry about that! Please select again.", "Oops!", JOptionPane.ERROR_MESSAGE);
				}
			} else { //if the user inputs anything other than "y" or "n", program defaults to and unfinished table, breaking the while loop without adjusting price
				confirm = true;
			}
		}
		
		confirm = false; //resets confirm boolean (not necessarily needed)
		System.out.println("Price: " + price); //outputs final price to console for debug
		
	//final checkout/output
		//first checks whether or not user chooses sealant, after it checks which wood choice was made at the beginning, it outputs a similar checkout, with slight changes in price and wood types
		if (finish == true) {
			if (wood == 1) {
				JOptionPane.showMessageDialog(null, "Thanks for shopping with Grape Vine today!\nHere's your final order:\n\nTable: Pine table with finish\nPrice: $" + price + "\n\nHave a nice day!", "Checout", JOptionPane.INFORMATION_MESSAGE);
			} else if (wood == 2) {
				JOptionPane.showMessageDialog(null, "Thanks for shopping with Grape Vine today!\nHere's your final order:\n\nTable: Oak table with finish\nPrice: $" + price + "\n\nHave a nice day!", "Checout", JOptionPane.INFORMATION_MESSAGE);
			} else if (wood == 3) {
				JOptionPane.showMessageDialog(null, "Thanks for shopping with Grape Vine today!\nHere's your final order:\n\nTable: Mahogany table with finish\nPrice: $" + price + "\n\nHave a nice day!", "Checout", JOptionPane.INFORMATION_MESSAGE);
			} else if (wood == 4) {
				JOptionPane.showMessageDialog(null, "Thanks for shopping with Grape Vine today!\nHere's your final order:\n\nTable: Cedar table with finish\nPrice: $" + price + "\n\nHave a nice day!", "Checout", JOptionPane.INFORMATION_MESSAGE);
			} else if (wood == 5) {
				JOptionPane.showMessageDialog(null, "Thanks for shopping with Grape Vine today!\nHere's your final order:\n\nTable: Bocote table with finish\nPrice: $" + price + "\n\nHave a nice day!", "Checout", JOptionPane.INFORMATION_MESSAGE);
			} else if (wood == 6) {
				JOptionPane.showMessageDialog(null, "Thanks for shopping with Grape Vine today!\nHere's your final order:\n\nTable: Sandelwood table with finish\nPrice: $" + price + "\n\nHave a nice day!", "Checout", JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (finish == false) {
			if (wood == 1) {
				JOptionPane.showMessageDialog(null, "Thanks for shopping with Grape Vine today!\nHere's your final order:\n\nTable: Pine table without finish\nPrice: $" + price + "\n\nHave a nice day!", "Checout", JOptionPane.INFORMATION_MESSAGE);
			} else if (wood == 2) {
				JOptionPane.showMessageDialog(null, "Thanks for shopping with Grape Vine today!\nHere's your final order:\n\nTable: Oak table without finish\nPrice: $" + price + "\n\nHave a nice day!", "Checout", JOptionPane.INFORMATION_MESSAGE);
			} else if (wood == 3) {
				JOptionPane.showMessageDialog(null, "Thanks for shopping with Grape Vine today!\nHere's your final order:\n\nTable: Mahogany table without finish\nPrice: $" + price + "\n\nHave a nice day!", "Checout", JOptionPane.INFORMATION_MESSAGE);
			} else if (wood == 4) {
				JOptionPane.showMessageDialog(null, "Thanks for shopping with Grape Vine today!\nHere's your final order:\n\nTable: Cedar table without finish\nPrice: $" + price + "\n\nHave a nice day!", "Checout", JOptionPane.INFORMATION_MESSAGE);
			} else if (wood == 5) {
				JOptionPane.showMessageDialog(null, "Thanks for shopping with Grape Vine today!\nHere's your final order:\n\nTable: Bocote table without finish\nPrice: $" + price + "\n\nHave a nice day!", "Checout", JOptionPane.INFORMATION_MESSAGE);
			} else if (wood == 6) {
				JOptionPane.showMessageDialog(null, "Thanks for shopping with Grape Vine today!\nHere's your final order:\n\nTable: Sandelwood table without finish\nPrice: $" + price + "\n\nHave a nice day!", "Checout", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}