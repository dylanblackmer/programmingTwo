import javax.swing.JOptionPane;

public class ShowMeMoreMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//input
		String numberOfCents = JOptionPane.showInputDialog("Please choose a number of cents."); //prompts user to provide cent amount
		int cents = Integer.parseInt(numberOfCents); //adds cent amount to integer variable
		
	//change sorter
		int hundreds = cents / 10000; //divides cent amount by 10,000 (one hundred dollars in cents), set as integer so program won't take the decimal into account.
		cents = cents % 10000; //takes the remainder after the hundreds have been taken out, resets original variable.
		int tens = cents / 1000; //divides cent remainder by 1,000 (ten dollars in cents), similar to hundreds set as integer.
		cents = cents % 1000; //once again takes remainder, this cycle repeats for all change categories.
		int ones = cents / 100;
		cents = cents % 100;
		int quarters = cents / 25;
		cents = cents % 25;
		int dimes = cents / 10;
		cents = cents % 10;
		int nickels = cents / 5;
		cents = cents % 5;
		int pennies = cents / 1;
		
	//variable call
		String hundred;
		String ten;
		String one;
		String quarter;
		String dime;
		String nickel;
		String penny;
		
	//control flow
		/* The following if/else statements check to see if each type of money is in "plural mode" (0 or 2 and higher)
		 or in "singular mode" (1). The program then decides whether to create a sting in the plural or singular form (used later) */
		if ((hundreds == 0) || (hundreds >= 2)) {
			hundred = "Hundreds";
		} else {
			hundred = "Hundred";
		}
		if ((tens == 0) || (tens >= 2)) {
			ten = "Tens";
		} else {
			ten = "Ten";
		}
		if ((ones == 0) || (ones >= 2)) {
			one = "Dollars";
		} else {
			one = "Dollar";
		}
		if ((quarters == 0) || (quarters >= 2)) {
			quarter = "Quarters";
		} else {
			quarter = "Quarter";
		}
		if ((dimes == 0) || (dimes >= 2)) {
			dime = "Dimes";
		} else {
			dime = "Dime";
		}
		if ((nickels == 0) || (nickels >= 2)) {
			nickel = "Nickels";
		} else {
			nickel = "Nickel";
		} 
		if ((pennies == 0) || (pennies >= 2)) {
			penny = "Pennies";
		} else {
			penny = "Penny";
		}
		
	//final output
		JOptionPane.showMessageDialog(null, "Your change is as follows:\n\n" + hundreds + "    " + hundred + "\n" + tens + "    " + ten + "\n" + ones + "    " + one + "\n" + quarters + "    " + quarter + "\n" + dimes + "    " + dime + "\n" + nickels + "    " + nickel + "\n" + pennies + "    " + penny);
	}

}
