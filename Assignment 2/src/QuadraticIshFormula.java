//Dylan Blackmer, QuadraticIshFormula

//imports
import java.util.Scanner;

public class QuadraticIshFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//initialize
		Scanner letterInput = new Scanner(System.in); //opens scanner used to input A, B, and C for the formula
		
	//inputs
		//prompts user for "A"
		System.out.print("Input 'A': ");
		double numA = letterInput.nextDouble();
		//prompts user for "B"
		System.out.print("Input 'B': ");
		double numB = letterInput.nextDouble();
		//prompts user for "C"
		System.out.print("Input 'C': ");
		double numC = letterInput.nextDouble();
		
	//calculations
		double numAA = numA * numA; //creates new var for numA squared
		double num2B = numB * 2; //new var for 2 times numB
		
		double numerator = numAA + num2B + numC; //adds together the elements included in the numerator of the formula
		double finalAnswer = numerator / 2; //divides the numerator by 2 to receive the final answer
		
	//output
		System.out.println("");
		System.out.print(finalAnswer);
		
		
		
	}

}
