package nikeeta;
public class ArrayDivision {
    
    public static boolean compareArraySums(int[] array) {
        int length = array.length;

        // Handle edge cases
        if (length == 0) {
            return false;
        }
        if (length == 1) {
            return true; // Single element, both "parts" are equal
        }

        int mid = length / 2;

        // Calculate the sum of the first part
        int sum1 = 0;
        for (int i = 0; i < mid; i++) {
            sum1 += array[i];
        }

        // Calculate the sum of the second part
        int sum2 = 0;
        for (int i = mid; i < length; i++) {
            sum2 += array[i];
        }

        // Compare the sums
        return sum1 == sum2;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 0, 1, 5}; // Example array
        boolean result = compareArraySums(array);
        System.out.println("Are the sums of the two parts equal? " + result);
    }
}

