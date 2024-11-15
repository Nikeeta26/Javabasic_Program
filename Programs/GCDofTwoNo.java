package nikeeta;

import java.util.Scanner;

public class GCDofTwoNo {
public static void gcd(int x,int y) {
	
	// using for loop
//	for(int i = 1; i <= x && i <= y; i++)  
//	{  
//	//returns true if both conditions are satisfied   
//	if(x%i==0 && y%i==0)  
//	//storing the variable i in the variable gcd  
//	gcd = i;  
//	}  
//	//prints the gcd  
//	System.out.printf("GCD of %d and %d is: %d", x, y, gcd);  
	
	
	while(x!=y) {
		if(x>y) {
			x = x-y;
			//System.out.println(x);
			
		}
		else {
			y = y-x;
			//System.out.println(y);
		}
	}
	System.out.println(y);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    gcd(a,b);
    
	}

}
