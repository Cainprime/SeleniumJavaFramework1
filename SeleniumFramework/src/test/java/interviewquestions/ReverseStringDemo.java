package interviewquestions;

public class ReverseStringDemo {

	public static void main(String[] args) {
		
		String text = "this is a string test";
		int stringLength = text.length();
		String reversedText = "";
		
		for(int i = stringLength-1; i >=0; i--) {
			reversedText = reversedText + text.charAt(i);
		}
		System.out.println(reversedText);
	}
}