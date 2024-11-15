package nikeeta;

public class findPrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
        boolean isPrime = true;  // Use boolean to make it more intuitive

        // Edge case for numbers less than 2
        if (num < 2) {
            isPrime = false;
        } else {
            // Loop to check divisibility
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output based on the result
        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
		}
	}

}
