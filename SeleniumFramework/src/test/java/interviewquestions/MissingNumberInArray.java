package interviewquestions;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int arraySet[] = {1,2,3,4,5,6,8,9};
		int sum = 0;
		int sum1 = 0;
		
		for(int i = 0; i < arraySet.length; i++) {
			sum = sum + arraySet[i];
		}
		System.out.println(sum);
		
		for(int j = 1; j <= 9; j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum1);
		
		System.out.println("Missing number is: " + (sum1 - sum));
	}

}
