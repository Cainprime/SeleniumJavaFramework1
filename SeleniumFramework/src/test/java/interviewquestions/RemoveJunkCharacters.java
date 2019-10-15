package interviewquestions;

public class RemoveJunkCharacters {
	
	public static void main(String[] args) {
		String text = "NHKワールド JAPANは、テレビ、ラジオ、インターネットで日本やアジアの 123 again";
		text = text.replaceAll("[^a-zA-Z0-1]", "");
		System.out.println(text);

	}
}
