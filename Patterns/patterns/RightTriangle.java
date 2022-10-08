package patterns;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input pattern dimension: ");
		int n = sc.nextInt();
		// Outer loop determines rows and inner loop determines columns.
		for (int i = 1; i <= n; i++) {
			System.out.println();
			for (int j = 1; j <= i; j++) {
				System.out.print("$ ");
			}

		}

	}

}