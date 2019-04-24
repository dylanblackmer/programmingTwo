//Dylan Blackmer	WuTang

//imports
import java.util.Scanner;


public class WuTang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//misc
		Methods wuTangClan = new Methods(3);
		Scanner input = new Scanner(System.in);
		
		
	//methodMan
		//input
		System.out.println("1. Method Man");
		System.out.print("\tPlease choose a whole number: ");
		int repeat = input.nextInt();
		System.out.print("\tPlease choose a number with decimal: ");
		double num = input.nextDouble();
		//output
		System.out.println("\t" + wuTangClan.methodMan(repeat, num));
	
		
	//rZA         talk to mr carruthers
		//input
		boolean doYouLike = false;
		System.out.println("\n2. RZA");
		System.out.print("\tTrue or False: Is 63.7 a cool number? ");
		doYouLike = input.nextBoolean();
		//output
		System.out.println("\t" + wuTangClan.rZA(doYouLike));
		
		
	//gZA
		//input
		System.out.println("\n3. GZA");
		System.out.print("\tSpell a single digit number (ex. One): ");
		String numString1 = input.next();
		System.out.print("\tSpell another one: ");
		String numString2 = input.next();
		//output
		System.out.println("\t" + wuTangClan.gZA(numString1, numString2));
		
		
	//raekwon
		//input
		System.out.println("\n4. Rawkwon");
		System.out.print("\tPick a whole number: ");
		int numInt1 = input.nextInt();
		System.out.print("\tAnother: ");
		int numInt2 = input.nextInt();
		System.out.println("\tLast one: ");
		int numInt3 = input.nextInt();
		//output
		System.out.println("\t" + wuTangClan.raekwon(numInt1, numInt2, numInt3));
		
	
	//inspectahDeck
		//input
		System.out.println("\n5. Inspectah Deck");
		System.out.print("\tPick");
	}
}
