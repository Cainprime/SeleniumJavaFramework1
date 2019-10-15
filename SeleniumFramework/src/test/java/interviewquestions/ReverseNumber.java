package interviewquestions;

public class ReverseNumber {

	public static void main(String[] args) {
		int numbers = 123456789;
		int reversedNumbers = 0;
		
		while(numbers != 0) {
			reversedNumbers = reversedNumbers * 10 + numbers % 10;
			numbers = numbers / 10;
		}
		System.out.println(reversedNumbers);
	}
}
