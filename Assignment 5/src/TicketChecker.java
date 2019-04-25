import javax.swing.JOptionPane;

//Dylan Blackmer	TicketChecker

//imports
public class TicketChecker {

	public TicketChecker() {
		
	}
	
	public int ticketCheck() {
		String ticketString = JOptionPane.showInputDialog(null, "Please enter ticket number: ", "Enter Ticket", JOptionPane.QUESTION_MESSAGE);
		int firstFive = Integer.parseInt(ticketString.substring(0, 6));
		System.out.println(firstFive);
		int lastOne = Integer.parseInt(ticketString.substring(6));
		System.out.println(lastOne);
		return 0;
		
	}
	
}
