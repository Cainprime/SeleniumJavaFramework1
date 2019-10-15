package interviewquestions;

public class SwapIntegers {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
//		int z;
//		
//		z = x;
//		x = y;
//		y = z;
		
//		x = x + y; //15
//		y = x - y; //10
//		x = x - y; //5
		
//		x = x * y; //50
//		y = x / y; //10
//		x = x / y; //5
		
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		
		
		System.out.println(x);
		System.out.println(y);
	}

}
