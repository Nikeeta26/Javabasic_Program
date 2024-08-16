package nikeeta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftAndRigntShipting {

	
		    public static String getShiftedString(String s, int leftShifts, int rightShifts) {
		        int netShifts = (rightShifts - leftShifts) % s.length();

		        if (netShifts == 0) {
		            return s;
		        } else if (netShifts > 0) { // right shift
		            return rightShift(s, netShifts);
		        } else { // left shift
		            return leftShift(s, -netShifts);
		        }
		    }

		    private static String leftShift(String s, int shifts) {
		        shifts = shifts % s.length();
		        return s.substring(shifts) + s.substring(0, shifts);
		    }

		    private static String rightShift(String s, int shifts) {
		        shifts = shifts % s.length();
		        return s.substring(s.length() - shifts) + s.substring(0, s.length() - shifts);
		    }

		    public static void main(String[] args) throws IOException {
		        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		        System.out.print("Enter the string: ");
		        String s = reader.readLine();

		        System.out.print("Enter the number of left shifts: ");
		        int leftShifts = Integer.parseInt(reader.readLine());

		        System.out.print("Enter the number of right shifts: ");
		        int rightShifts = Integer.parseInt(reader.readLine());

		        String result = getShiftedString(s, leftShifts, rightShifts);
		        System.out.println("Resulting string: " + result);
		    }
		}
