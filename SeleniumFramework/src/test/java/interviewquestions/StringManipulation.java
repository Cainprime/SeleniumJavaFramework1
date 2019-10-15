package interviewquestions;

public class StringManipulation {

	public static void main(String[] args) {
		String text = "The rains have started here selenium";
		String text1 = "The rains Have started here selenium";
		String text2 ="      hello world      ";
		String date = "01-01-2017";
		String text3 = "Hello_World_Test_Selenium";
		String finalString = "";
		
		System.out.println(text.length());
		System.out.println(text.charAt(5));
		System.out.println(text.indexOf('s'));
		System.out.println(text.indexOf('s', text.indexOf('s')+1));
		System.out.println(text.indexOf('s', text.indexOf('s',text.indexOf('s')+1)+1));
		System.out.println(text.indexOf("have"));
		System.out.println(text.indexOf("hello"));
		System.out.println(text.equals(text1));
		System.out.println(text.equalsIgnoreCase(text1));
		System.out.println(text.substring(0, 9));
		System.out.println(text2.trim());
		System.out.println(text2.replace(" ", ""));
		System.out.println(date.replace("-", "/"));
		
		String testArray[] = text3.split("_");
		
		for(int i = 0; i < testArray.length; i++) {
			finalString = finalString + testArray[i].concat(" ");
			System.out.println(testArray[i]);
		}
		System.out.println(finalString);
		
		String s2 = "cares";
		System.out.println(s2.concat("s"));
		
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x + y + (a + b));
		
	}

}
