package nikeeta;

import java.util.*;

public class Treeset {
	public static void main(String[] args) {
        // Step 1: Create an ArrayList
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(10);
        numbers.add(1);
        numbers.add(8);
        
        // Step 2: Initialize a TreeSet with the ArrayList
        TreeSet<Integer> sortedNumbers = new TreeSet<>(numbers);
        
        // Step 3: Retrieve sorted elements
        System.out.println("Sorted numbers:");
        for (Integer number : sortedNumbers) {
            System.out.println(number);
        }
	}

}
