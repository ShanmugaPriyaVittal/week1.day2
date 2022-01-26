Learnings:
1. The output I get is "Not Armstrong Number" for whatever input given. Please correct me

package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int input = 153;
		int input = 153, calculated=0, remainder, original;
		original = input;
		while (original!=0) {
			//original=input;
			remainder = original % 10;
			original = original/10;
			calculated = remainder^3 + calculated;
			
			
		}
		if (calculated==original) {
			System.out.println("Armstrong number");
			
		} else {
			System.out.println("Not Armstrong number");

		}
		
		
		

	}

}
