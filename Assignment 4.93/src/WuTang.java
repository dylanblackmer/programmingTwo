//Dylan Blackmer	WuTang

//imports
import java.util.Scanner;


public class WuTang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//misc
		Scanner input = new Scanner(System.in);
		
	/*	
	//meathodMan
		//input
		System.out.println("1. Meathod Man");
		System.out.print("\tPlease choose a whole number: ");
		int repeat = input.nextInt();
		System.out.print("\tPlease choose a number with decimal: ");
		double num = input.nextDouble();
		//output
		System.out.println("\t" + Methods.methodMan(repeat, num));
		
	
	//rZA         talk to mr carruthers
		//input
		boolean doYouLike = false;
		System.out.println("\n2. RZA");
		System.out.print("\tTrue or False: Is 63.7 a cool number? ");
		doYouLike = input.hasNext();
		//output
		System.out.println("\t" + Methods.rZA(doYouLike));
		*/
		
	//gZA
		//input
		System.out.println("\n3. GZA");
		System.out.print("\tSpell a single digit number (ex. One): ");
		String num1 = input.nextLine();
		System.out.print("\tSpell another one: ");
		String num2 = input.nextLine();
		//output
		System.out.println("\t" + Methods.gZA(num1, num2));
		
		
	}

}
