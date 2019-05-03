//Dylan Blackmer	FormatMaster
public class FormatMaster {

	public FormatMaster() {
		
	}
	
	public void bigChart() {
	
/*	before apiphany

	//line 1
		for (int i = 0; i <= 12; i++) {
			System.out.format("%4d", i);
		}
	//line 2
		System.out.println(" ");
		System.out.println("-------------------------------------------------------");
	//line 3
		System.out.format("%4d", 1);
		System.out.print("|");
		System.out.format("%3d", 1);
		for (int i = 2; i <= 12; i++) {
			System.out.format("%4d", i);
		}
	//line 4
		System.out.println(" ");
		System.out.format("%4d", 2);
		System.out.print("|");
		System.out.format("%3d", 2);
		for (int i = 4; i <= 24; i += 2) {
			System.out.format("%4d", i);
		}
	//line 5
		System.out.println(" ");
		System.out.format("%4d", 3);
		System.out.print("|");
		System.out.format("%3d", 3);
		for (int i = 6; i <= 36; i += 3) {
			System.out.format("%4d", i);
		}
	//line 6
		System.out.println(" ");
		System.out.format("%4d", 4);
		System.out.print("|");
		System.out.format("%3d", 4);
		for (int i = 8; i <= 48; i += 4) {
			System.out.format("%4d", i);
		}
	//line 7
		System.out.println(" ");
		System.out.format("%4d", 5);
		System.out.print("|");
		System.out.format("%3d", 5);
		for (int i = 10; i <= 60; i += 5) {
			System.out.format("%4d", i);
		}
	//line 8
		System.out.println(" ");
		System.out.format("%4d", 6);
		System.out.print("|");
		System.out.format("%3d", 6);
		for (int i = 12; i <= 72; i += 6) {
			System.out.format("%4d", i);
		}
	//line 9
		System.out.println(" ");
		System.out.format("%4d", 7);
		System.out.print("|");
		System.out.format("%3d", 7);
		for (int i = 14; i <= 84; i += 7) {
			System.out.format("%4d", i);
		}
	//line 10
		System.out.println(" ");
		System.out.format("%4d", 8);
		System.out.print("|");
		System.out.format("%3d", 8);
		for (int i = 16; i <= 96; i += 8) {
			System.out.format("%4d", i);
		}
	//line 11
		System.out.println(" ");
		System.out.format("%4d", 9);
		System.out.print("|");
		System.out.format("%3d", 9);
		for (int i = 18; i <= 108; i += 9) {
			System.out.format("%4d", i);
		}
	//line 12
		System.out.println(" ");
		System.out.format("%4d", 10);
		System.out.print("|");
		System.out.format("%3d", 10);
		for (int i = 20; i <= 120; i += 10) {
			System.out.format("%4d", i);
		}
	//line 13
		System.out.println(" ");
		System.out.format("%4d", 11);
		System.out.print("|");
		System.out.format("%3d", 11);
		for (int i = 22; i <= 132; i += 11) {
			System.out.format("%4d", i);
		}
	//line 14
		System.out.println(" ");
		System.out.format("%4d", 12);
		System.out.print("|");
		System.out.format("%3d", 12);
		for (int i = 24; i <= 144; i += 12) {
			System.out.format("%4d", i);
		}
*/
		
	//after apiphany
		for (int i = 0; i <= 12; i++) { //first for loops prints out the top row of numbers
			System.out.format("%4d", i); //prints 1 to 12
		}
		System.out.println(" "); //creates new line on console
		System.out.println("-------------------------------------------------------"); //adds divider between top line and chart
		for (int v = 1; v <= 12; v++) { //creates the 12 multiple lines
			System.out.format("%4d", v); //creates first number outside the divider, 1 to 12
			System.out.print("|"); //adds divider after each initial number
			System.out.format("%3d", v); //adds first multiple, only included outside of the below for loop to make look chart look nicer
			for (int i = (v * 2); i <= (v * 12); i += v) { //creates almost every number within the chart
				System.out.format("%4d", i); //1 to 144
			}
			System.out.println(" "); //creates new line in console after every multiple line
		}
		
	}
	
	
}
