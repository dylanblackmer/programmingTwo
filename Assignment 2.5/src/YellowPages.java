//Dylan Blackmer       YellowPages

//imports
import java.util.Scanner; //used for Scanner functionality


public class YellowPages {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//initialize
		Scanner input = new Scanner(System.in); //opens scanner used for input
		
	//user input, takes information used in the "YellowPages"
		System.out.print("First Name: ");
		String firstName = input.nextLine();
		System.out.print("Last Name: ");
		String lastName = input.nextLine();
		System.out.print("Street Number: ");
		String streetNum = input.nextLine();
		System.out.print("Street Name: ");
		String streetName = input.nextLine();
		System.out.print("City: ");
		String city = input.nextLine();
		System.out.print("State: ");
		String state = input.nextLine();
		System.out.print("Zip Code: ");
		int zipCode = input.nextInt();
		
		
	//output
		System.out.println("");
		System.out.println("Your Mailing Address is:\n\n\n" + firstName + " " + lastName + "\n" + streetNum + " " + streetName + "\n" + city + ", " + state + " " + zipCode);
		
		
	}

}
