//imports
import java.util.Scanner;


public class baseKaddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//variable initialize
		int base = 10; //sets default base number to 10
		String num1 = ""; //creates a string that will perform as number 1
		String num2 = ""; //creates string that acts as number 2
		int sum = 0; //creates final sum
		
	//input
		Scanner input = new Scanner(System.in);
		System.out.print("Please choose a base number: ");
		base = input.nextInt();
		System.out.print("Please choose a first number: ");
		num1 = input.next();
		System.out.print("Please choose a second number: ");
		num2 = input.next();
		
		System.out.println(base);
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
