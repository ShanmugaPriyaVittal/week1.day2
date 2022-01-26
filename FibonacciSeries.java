//Learnings:
//Only if I print the secNum also, the output I get is 0 1 1 2 3.... otherwise the output is 0 1 2 3...Please correct me

package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range=7, firstNum = 0, secNum = 1, sum;
		System.out.println(firstNum);
		//System.out.println(secNum);
		
		for (int i = 1; i <= range; i++) {
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum=sum;
			System.out.println(sum);
			
		}

	}

}
