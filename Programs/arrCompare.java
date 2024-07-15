package nikeeta;

import java.util.*;
public class arrCompare {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 30, 25, 40 }; 
		  
        // Initializing the second array 
        int b[] = { 30, 25, 40 };  
        // whether two arrays are equal or not 
        boolean result = Arrays.equals(a, b); 
        if(result==true) {
        	  System.out.println("Two arrays are equal"); 
        } 
        else { 
            // Print the result 
            System.out.println("Two arrays are not equal"); 
        } 

	}
}
