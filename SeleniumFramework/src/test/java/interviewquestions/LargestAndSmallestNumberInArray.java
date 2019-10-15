package interviewquestions;

import java.util.Arrays;

public class LargestAndSmallestNumberInArray {

	public static void main(String[] args) {
		int numbers[] = {-100, 24, 50, -88, 129847, 1000000};
		int largestNumber = numbers[0];
		int smallestNumber = numbers[0];
		
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i] > largestNumber) {
				largestNumber = numbers[i];
			}
			else if(numbers[i] < smallestNumber) {
				smallestNumber = numbers[i];
			}
		}
		System.out.println("\nGiven the array is: " + Arrays.toString(numbers));
		System.out.println("Largest number is: " + largestNumber);
		System.out.println("Smallest number is: " + smallestNumber);

	}

}
