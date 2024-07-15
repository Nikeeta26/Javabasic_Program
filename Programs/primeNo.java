//package nikeeta;
//
//public class primeNo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		 int limit = 100;  // Limit to find prime numbers up to
//	        
//	        System.out.println("Prime numbers up to " + limit + ":");
//	        
//	        // Iterate through numbers from 2 to the limit
//	        for (int num = 2; num <= limit; num++) {
//	            boolean isPrime = true;
//	            
//	            // Check if the number is prime
//	            for (int i = 2; i <= Math.sqrt(num); i++) {
//	                if (num % i == 0) {
//	                    isPrime = false;
//	                    break;
//	                }
//	            }
//	            
//	            // Print the number if it is prime
//	            if (isPrime) {
//	                System.out.print(num + " ");
//	            }
//	        }
//		       
//		      
//	
//		    }
//		}
//
//	

package nikeeta;

public class primeNo {

    public static void main(String[] args) {

        System.out.println("Prime numbers up to 7:");

        int n = 100;
        for (int i = 2; i <= n; i++) {
            boolean prime = true;

            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(i + " is a prime number");
            }
//            else {
//                System.out.println(i + " is not a prime number");
//            }
        }

    }
}

