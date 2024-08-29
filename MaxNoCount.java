package nikeeta;

import java.util.Scanner;

public class MaxNoCount {

	public static void main(String[] args) {
		// TODO Auto-generated amethod stub
       Scanner sc = new Scanner(System.in);
       int n =sc.nextInt();
        
       int arr[] = new int[n];
       for(int i=0;i<n;i++) {
    	  arr[i] = sc.nextInt();
       }
       
       int max = 0;
       
       int count = 0;
       for(int i=0; i<n; i++) { 
    	   if(arr[i]>max) {
    		   max = arr[i];
    		   count++;
    	   }
       }
       
       System.out.println(count);

	}

}
