package nikeeta;

import java.util.Scanner;

public class OccurenceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String s = "bbbbabaaaaaaabb";
//int countA = 0;
//
//for (int i = 0; i < s.length(); i++) {
//    if (s.charAt(i) == 'a') {
//    	countA++;
//	}
//}
//System.err.println("A is occurse "+countA+ "time");
	
		
		        Scanner sc = new Scanner(System.in);
		        String str = sc.next();  // Input string of curtains
		        int L = sc.nextInt();    // Length of each box
		        int maxAqua = 0, N = str.length();

		        for (int i = 0; i < N; i += L) {
		            String subStr = str.substring(i, Math.min(i + L, N));
		            int countA = 0;
		            for (char ch : subStr.toCharArray()) {
		                if (ch == 'a') countA++;
		            }
		            maxAqua = Math.max(maxAqua, countA);
		        }

		        System.out.println(maxAqua);  // Output maximum number of 'a's in any box
		    }
		}
