package nikeeta;

class nik{
	boolean checkPalindromeString(String input) {
		boolean result = true;
		//int length = input.length();

		for (int i = 0; i < input.length()/2; i++) {
			if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
				result = false;
				break;
			}
		}

		return result;
	}
}

public class palindromString {
	public static void main(String[] args) {
	
		nik n = new nik();
		System.out.println(n.checkPalindromeString("ninnin"));
	
		
	}

}
