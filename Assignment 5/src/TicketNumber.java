//Dylan Blackmer	TicketNumber

//imports
import javax.swing.JOptionPane;


public class TicketNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TicketChecker ticketChecker = new TicketChecker(); //communicates with other class
		
		int ticket = ticketChecker.ticketCheck(); //calls method from "TicketChecker" and stores returned value to "ticket" 
		
		if (ticket != 0) { //if the ticket didn't work, "TicketChecker" returns "0", so long as "ticket" doesn't equal zero, the operator will receive a success message, otherwise they will be asked to retry and sent back to the beginning.
			JOptionPane.showMessageDialog(null, "Correct ticket number!\n\nTicket Number: \n" + ticket, "Success!", JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect ticket number, please re-enter.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}

}
