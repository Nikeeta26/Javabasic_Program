package nikeeta;

public class swapNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 9;
int b = 0;
	    System.out.println("a is " + a + " and b is " + b);

		a = a + b;
		b = a - b;
		a = a - b;

	    System.out.println("After swapping, a is " + a + " and b is " + b);
	    
	    a = a % b;
		b = a * b;
		a = a * b;

	    System.out.println("After swapping, a is " + a + " and b is " + b);
	    
	   
	   
	
	    
	}
}
