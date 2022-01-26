package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 42, remainder;
		boolean flag = false;
		for (int i = 2; i <=input / 2; i++) {
			remainder = input % i;
			while (remainder == 0) {
				flag = true;
				break;
			}

		}
		if (flag == false) {
			System.out.println("Prime Number");

		} else {
			System.out.println("Not Prime Number");
		}

	}

}
