package Find_n;

import java.util.Scanner;

public class Missing_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of consecutive integers: ");
		int n = sc.nextInt(); // Read the integers
		int[] numbers = new int[n - 1]; // Create an array with n-1 elements to simulate the missing number
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < n - 1; i++) {
			numbers[i] = sc.nextInt(); // Take the integer representation of the array.
		}
		sc.close();
		int expectedSum = n * (n + 1) / 2; // Firstly, it calculates the total sum of n numbers user inputs, using the
		int actualSum = 0; // -arithmetic series sum formula (n∗(n+1))/2
		for (int num : numbers) {// Then, it traverse through the array
			// -and calculates the actual sum of all integers user entered in input list
			actualSum += num;
		}
		int missingNumber = expectedSum - actualSum; // Finally, missing number is the difference between the expected
														// and actual sums
		System.out.println("The missing number is: " + missingNumber);
	}
}