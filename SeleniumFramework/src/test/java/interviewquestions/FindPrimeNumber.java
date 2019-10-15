package interviewquestions;

public class FindPrimeNumber {
	
	public static boolean isPrimeNumber(int number) {
		
		if(number <= 1) {
			return false;
		}
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void getPrimeNumbers(int number) {
		for(int i = 2; i <= number; i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		getPrimeNumbers(7);
		getPrimeNumbers(13);
		getPrimeNumbers(20);
	}

}

