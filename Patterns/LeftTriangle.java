package patterns;

import java.util.Scanner;

public class LeftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Input pattern dimension: ");
		int n = sc.nextInt();
		// Outer loop determines rows and inner loop determines columns.
		//This pattern is made up of 1.Decreasing space and 2.Increasing star
		for (int i = 1; i <= n; i++) {
			System.out.println();
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("$ ");
			}

		}
	}
}
