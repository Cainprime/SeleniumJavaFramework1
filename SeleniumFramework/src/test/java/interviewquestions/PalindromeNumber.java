package interviewquestions;

public class PalindromeNumber {

	public static void isPalinDromeNumber(int number) {
		System.out.print(number);
		int remainderVal = 0;
		int sum = 0;
		int temp = 0;
		
		temp = number;
		
		while(number > 0) {
			remainderVal = number % 10;
			sum = (sum * 10) + remainderVal;
			number = number / 10;
			
		}
		if(temp == sum) {
			System.out.println(" is a palindrom number");
		}
		else {
			System.out.println(" is not a palindrome number");
		}
		
	}
	
	public static void main(String[] args) {
		isPalinDromeNumber(151);
		isPalinDromeNumber(152);
		isPalinDromeNumber(78987);
	}
	
}

