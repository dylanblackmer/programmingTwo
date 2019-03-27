//Dylan Blackmer	ShowMeTheMoney

//imports
import java.util.Scanner;

public class ShowMeTheMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of change in cents (¢): ");
		int cents = input.nextInt();
		input.close();
		
	//change sorter
		int hundreds = cents / 10000; //divides cent amount by 10,000 (one hundred dollars in cents), set as integer so program won't take the decimal into account.
		cents = cents % 10000; //takes the remainder after the hundreds have been taken out, resets original variable.
		int tens = cents / 1000; //divides cent remainder by 1,000 (ten dollars in cents), similar to hundreds set as integer.
		cents = cents % 1000; //once again takes remainder, this cycle repeats for all change catagories.
		int ones = cents % 100;
		cents = cents % 100;
		int quarters = cents / 25;
		cents = cents % 25;
		int dimes = cents / 10;
		cents = cents % 10;
		int nickels = cents / 5;
		cents = cents % 5;
		int pennies = cents / 1;
		
	//inital output
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Your change will be the following: ");
		System.out.println("");
		
	//control flow and final outputs
		if ((hundreds == 0) || (hundreds >= 2)) {
			System.out.println(hundreds + "\tHundreds");
		} else {
			System.out.println(hundreds + "\tHundred");
		}
		if ((tens == 0) || (tens >= 2)) {
			System.out.println(tens + "\tTens");
		} else {
			System.out.println(tens + "\tTen");
		}
		if ((ones == 0) || (ones >= 2)) {
			System.out.println(ones + "\tDollars");
		} else {
			System.out.println(ones + "\tDollar");
		}
		if ((quarters == 0) || (quarters >= 2)) {
			System.out.println(quarters + "\tQuarters");
		} else {
			System.out.println(quarters + "\tQuarter");
		}
		if ((dimes == 0) || (dimes >= 2)) {
			System.out.println(dimes + "\tDimes");
		} else {
			System.out.println(dimes + "\tDime");
		}
		if ((nickels == 0) || (nickels >= 2)) {
			System.out.println(nickels + "\tNickels");
		} else {
			System.out.println(nickels + "\tNickel");
		} 
		if ((pennies == 0) || (pennies >= 2)) {
			System.out.println(pennies + "\tPennies");
		} else {
			System.out.println(pennies + "\tPenny");
		}
		
		
		
	}

}
