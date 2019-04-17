import javax.swing.JOptionPane;

//Dylan Blackmer     GrapeVine

//import


public class GrapeVine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//variable initialization
		int price = 0; //sets default price of table, determined by type of wood or whether or not table is finished (with sealant).
		int wood;
		boolean finish = false;
		boolean confirm = false;
	
	//welcome message to users, explaining how to use the program
		JOptionPane.showMessageDialog(null, "Welcome to the Grape Vine furniture company!\nFirst, you will be asked to choose the type of wood you'd like. The price will be based on the type of wood.\nThen, you will decide whether no not you'd like a finsihed table (a table with sealant). This will increase the price.\nFinally, your final selection and price will be displayed.", "Introduction", JOptionPane.INFORMATION_MESSAGE);
	
	//wood input
		while (confirm == false) {
		
			String woodSelection = JOptionPane.showInputDialog(null, "Please select your wood type (number).\n\n1. Pine\n2. Oak\n3. Mahogany\n4. Cedar\n5. Bocote\n6. Sandelwood\n ", "Wood Selection", JOptionPane.QUESTION_MESSAGE);
			wood = Integer.parseInt(woodSelection);
			System.out.println("Wood: " + wood);
			if (wood == 1) {
				String woodConfirm = JOptionPane.showInputDialog(null, "You have chosen Pine.\nIs this correct? (Y/N)\n ", "Confirm", JOptionPane.QUESTION_MESSAGE);
				if ((woodConfirm.equals("Y") || (woodConfirm.equals("y")))) {
					confirm = true;
					price += 100;
				} else {
					confirm = false;
					JOptionPane.showMessageDialog(null, "Sorry about that! Please select again.", "Oops!", JOptionPane.ERROR_MESSAGE);
				}
				
			} else if (wood == 2) {
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
					JOptionPane.showMessageDialog(null, "Sorry about that! Please select again.", "Oops!", JOptionPane.ERROR_MESSAGE);
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
		System.out.println("Price: " + price);
		confirm = false;
		while (confirm == false) {
			
			String finishSelection = JOptionPane.showInputDialog(null, "Would you like to add finishing to your table for an upcharge of $285? (Y/N)\n ", "Finish Selection", JOptionPane.QUESTION_MESSAGE);
			if ( finishSelection.equals("Y") || finishSelection.equals("y")) {
				String finishConfirm = JOptionPane.showInputDialog(null, "You've chosen sealant.\nIs this correct? (Y/N)", "Confirm", JOptionPane.QUESTION_MESSAGE);
				if (finishConfirm.equals("Y") || finishConfirm.equals("y")) {
					confirm = true;
					finish = true;
					price += 285;
				} else {
					confirm = false;
					JOptionPane.showMessageDialog(null, "Sorry about that! Please select again.", "Oops!", JOptionPane.ERROR_MESSAGE);
				}
			} else if (finishSelection.equals("N") || finishSelection.equals("n")) {
				String finishConfirm = JOptionPane.showInputDialog(null, "You've chosen no sealant.\nIs this correct? (Y/N)", "Confirm", JOptionPane.QUESTION_MESSAGE);
				if (finishConfirm.equals("Y") || finishConfirm.equals("y")) {
					confirm = true;
					finish = false;
				} else {
					confirm = false;
					JOptionPane.showMessageDialog(null, "Sorry about that! Please select again.", "Oops!", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				confirm = true;
			}
		}
		confirm = false;
		System.out.println("Price: " + price);
		if (finish == true) {
			if (wood == 1) {
				JOptionPane.showMessageDialog(null, "Thanks for shopping with Grape Vine today!\nHere's your final order:\n\nTable: Pine table with finish\nPrice: " + price + "\n\nHave a nice day!", "Checout", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

}
