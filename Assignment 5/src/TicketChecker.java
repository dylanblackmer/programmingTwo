//Dylan Blackmer	TicketChecker

//imports
import javax.swing.JOptionPane;


public class TicketChecker {

	public TicketChecker() {
		
	}
	
	public int ticketCheck() { 
		String ticketString = JOptionPane.showInputDialog(null, "Please enter ticket number: ", "Enter Ticket", JOptionPane.QUESTION_MESSAGE); //prompts user for ticket number
		if (ticketString.length() != 6) { //checks ticket number for being too short or too long
			JOptionPane.showMessageDialog(null, "Error: Invalid number, please re-enter.", "Error", JOptionPane.ERROR_MESSAGE); //alerts user
			ticketCheck(); //restarts process
		}
		int ticketNumber = Integer.parseInt(ticketString); //turns the ticket string into an int to return later
		int firstFive = Integer.parseInt(ticketString.substring(0, 5)); //takes first 5 digits and adds to int
		System.out.println(firstFive); //output for debug
		int lastOne = Integer.parseInt(ticketString.substring(5)); //takes last digit and adds to int
		System.out.println(lastOne); //output for debug
		
		int remainder = firstFive % 7; //takes the remainder of the first 5 digits after dividing by 7
		if (remainder == lastOne) { //checks to make sure the remainder is equal to the last digit 
			return ticketNumber; //returns ticket
		} else {
			return 0; //returns 0
		}
		
		
	}
	
}
