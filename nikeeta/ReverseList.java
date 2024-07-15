package nikeeta;

import java.util.*;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> numbers = new LinkedList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);
	        
	      Collections.reverse(numbers);
	      System.out.print(numbers+"\n");
	      
	} 

}
