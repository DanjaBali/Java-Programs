package patterns;

import java.util.Scanner;

public class RightDownwardTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Input pattern dimension: ");
		int n = sc.nextInt();
		// Outer loop determines rows and inner loop determines columns.
		//This pattern is made up of decreasing space and increasing star.
		for (int i = 1; i <= n; i++) {
			System.out.println();
			for (int j = i; j <= n; j++) {
				System.out.print("$ ");
			}

		}
	}
}
