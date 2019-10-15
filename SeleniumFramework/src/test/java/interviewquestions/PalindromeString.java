package interviewquestions;

import java.util.Scanner;

public class PalindromeString {

	public static void isPalindromeString(String stringText) {
		System.out.print(stringText);
//		String stringText = text;
		int stringLength = stringText.length();
		String reversedStringText = "";
		
		for(int i = stringLength-1; i >= 0; i--) {
			reversedStringText = reversedStringText + stringText.charAt(i);
		}
		if(stringText.equals(reversedStringText)) {
			System.out.println(" is a palindrome string");
		}
		else {
			System.out.println(" is not a palindrome string");
		}
	}
	
	public static void main(String[] args) {
//		isPalindromeString("abcdefg");
//		isPalindromeString("abcba");
		Scanner inputString = new Scanner(System.in);
		System.out.println("Enter in a string please:");
		String stringText = inputString.next();
		isPalindromeString(stringText);
		inputString.close();
	}

}
