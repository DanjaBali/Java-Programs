package patterns;

import java.util.Scanner;

public class LeftDownwardTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input pattern dimension");
		int n = sc.nextInt();
		// Outer loop determines rows and inner loop determines columns.

		//This pattern is made up of increasing space and decreasing sign
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("$ ");
			}
			System.out.println();
		}

	}

}
