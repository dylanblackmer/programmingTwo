//Dylan Blackmer	WuTang

//imports
import java.util.Scanner;


public class WuTang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//misc
		Methods wuTangClan = new Methods(3); //creates object that corresponds with the constructor in "Methods"
		Scanner input = new Scanner(System.in); //opens scanner used for the six methods
		
		/*
	//methodMan
		//input
		System.out.println("1. Method Man"); //displays title
		System.out.print("\tPlease choose a whole number: "); //prompts user for an int
		int repeat = input.nextInt(); //stores input
		System.out.print("\tPlease choose a number with decimal: "); //promts for decimal
		double num = input.nextDouble(); //stored
		//output
		System.out.println("\t" + wuTangClan.methodMan(repeat, num)); //calls first method, displaying the return
	
		
	//rZA
		//input
		boolean doYouLike = false; //changes default from true to false
		System.out.println("\n2. RZA"); //displays title
		System.out.print("\tTrue or False: Is 63.7 a cool number? "); //asks user a VERY important question
		doYouLike = input.nextBoolean(); //stores their VERY important answer
		//output
		System.out.println("\t" + wuTangClan.rZA(doYouLike)); //calls method and displays return
		
		
	//gZA
		//input
		System.out.println("\n3. GZA"); //displays title
		System.out.print("\tSpell a single digit number (ex. One): "); //asks user to spell out a number
		String numString1 = input.next(); //stores the string
		System.out.print("\tSpell another one: "); // asks for another number
		String numString2 = input.next(); //stores that one
		//output
		System.out.println("\t" + wuTangClan.gZA(numString1, numString2)); //calls and displays
		
		
	//raekwon
		//input
		System.out.println("\n4. Rawkwon"); //displays title
		System.out.print("\tPick a whole number: "); //asks user for in
		int numInt1 = input.nextInt(); //stores
		System.out.print("\tAnother: "); // asks for more
		int numInt2 = input.nextInt(); //stores
		System.out.print("\tLast one: "); //asks for final
		int numInt3 = input.nextInt(); //stores
		//output
		System.out.println("\t" + wuTangClan.raekwon(numInt1, numInt2, numInt3)); //calls and displays
		
	
	//inspectahDeck
		//input
		System.out.println("\n5. Inspectah Deck"); //displays title
		System.out.print("\tPick a number with decimal: "); //asks for decimal
		double numDouble1 = input.nextDouble(); //stores
		System.out.print("\tPick a whole number: "); //asks for int
		int numInt4 = input.nextInt(); //stores
//nice	//output
		System.out.println("\t" + wuTangClan.inspectahDeck(numDouble1, numInt4)); // calls and displays
		*/
		
	//cappadonna
		//input
		System.out.println("\n6. Cappadonna"); //displays title
		System.out.print("\tType a word: "); //asks user for random string
		String phrase = input.next(); //stores
		//output
		System.out.println("\tYour word is " + wuTangClan.cappadonna(phrase) + " characters long!"); //calls and displays
		
	//final
		input.close(); //closes scanner
	}
}
