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

/*************** or ******************/
public static void name(String s) {
	boolean palindram = true;
	for(int i=0; i<s.length(); i++) {
		if(s.charAt(i) != s.charAt(s.length()-i-1)) {
			palindram = false;
			
			break;
		}
	}
	//return palindram;
	if(palindram) {
		System.out.println("yessssssssssssssssssssss");
	}
	else {
		System.out.println("notttttttttttttttttt");
	}
	
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   String s = sc.next();
//      String r =  name(s);
   //System.out.println( name(s));
   name(s);
}