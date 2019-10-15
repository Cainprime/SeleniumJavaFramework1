package interviewquestions;

public class ArmstrongNumber {

	public static void isArmstrongNumber(int number) {
		System.out.print(number);
		int cube = 0;
		int remainder;
		int temp;
		temp = number;
		
		while(number > 0) {
			remainder = number % 10;
			number = number / 10;
			cube = cube + (remainder * remainder * remainder);
		}
		if(temp == cube) {
			System.out.println(" is an armstrong number");
		}else {
			System.out.println(" is not an armstrong number");
		}
	}
	
	public static void main(String[] args) {
		isArmstrongNumber(407);
		isArmstrongNumber(151);
		isArmstrongNumber(153);
		isArmstrongNumber(0);
		isArmstrongNumber(1);
	}

}

