package nikeeta;

import java.io.IOException;
import java.util.*;

public class ARRprint {
	public static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
      
    
	public static void main(String[] args)  throws IOException {
		
		int[] numbers =  {10,20 ,8,9,7,};

        // Print the elements of the array
        System.out.println("Original Array:");
        printArray(numbers);

		
	    Scanner sc = new Scanner(System.in); 
	   
		int array[][]= new int[4][4];
	    

	    System.out.println("Enter array: ");
	    
	    
	    for(int row=0; row<array.length-1 ;row++){
	    for(int col = 0; col<array.length-1 ; col++) {
	    	
	    	array[row][col]=sc.nextInt();
	    	
	    }
	    }
	    
	    System.out.println("Array is : ");

	    for(int row=0; row<array.length-1 ;row++){
	        for(int col = 0; col<array.length-1 ; col++) {
	        	
	        	System.out.print(array[row][col] + "\t");
	        	
	        }
	    	System.out.println();
	        
	        }
	    
	    
	    //-------------------- take i.p from user ----------------------
	    
	    System.out.println("Enter rows in table: ");
	    int x = sc.nextInt();
	    System.out.println("Enter cols in table: ");
	    int y = sc.nextInt();
	    int  arr[][]  = new int[x][y];
	    for(int i =0; i<x; i++) {
	    	for(int j =0; j<y; j++) {
	    		arr[i][j] = sc.nextInt();
		    }
	    }
	     for(int i =0; i<x; i++) {
	    	for(int j =0; j<y; j++) { 
	    		
	    		 System.out.print(arr[i][j]+"\t");
		    }
	    	//System.out.println();
	    }
	}
}
