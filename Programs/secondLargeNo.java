package nikeeta;

import java.util.Arrays;

public class secondLargeNo {
	public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array size should be at least 2");
            return -1;  // Or handle as appropriate for your application
        }
        
        // Sort the array in ascending order
        Arrays.sort(arr);
        
        // The second largest number will be at index arr.length - 2 after sorting
        return arr[arr.length - 2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 5, 3, 8, 1, 2, 7 }; // Example array
		        
		        int secondLargest = findSecondLargest(arr);
		        
		        System.out.println("Second largest number in the array is: " + secondLargest);
		    
	}

}
