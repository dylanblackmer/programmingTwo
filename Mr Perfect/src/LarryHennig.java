//Dylan Blackmer	LarryHennig    Epiphany took place at 08:07 on 5/8/19

//imports


public class LarryHennig {

	public LarryHennig() { //constructor to establish connection between "CurtHennig" and "LarryHennig"
		
	}
	
	public void numberRunner() {
		for (int i = 1; i <= 327000; i++) { //sends every number between 1 and 327000 to the method, "axeSwing".
			axeSwing(i);
		}
	}
	
	public void axeSwing(int testNum) {
		int total = 0; //initiate variable to test later
		for (int i = testNum - 1; i >= 1; i--) { //runs every number from 327000 to 1
			if ((testNum % i) == 0) { //if the testNum is divisible by the given number, adds to total
				total += i;
			}
		}
		if (total == testNum) { //checks to see if total is equal to original number
			System.out.println(testNum);
		}
	}
	
	
}
