package interviewquestions;

public class SwapString {

	public static void main(String[] args) {
		
		String text1 = "Hello";
		String text2 = "World";
		System.out.println("Before swapping");
		System.out.println(text1);
		System.out.println(text2);
		
		text1 = text1 + text2; //HelloWorld
		text2 = text1.substring(0, text1.length() - text2.length());
		text1 = text1.substring(text2.length());
		
		System.out.println("\nAfter swapping");
		System.out.println(text1);
		System.out.println(text2);
		

	}

}
