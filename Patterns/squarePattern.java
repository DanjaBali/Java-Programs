package patterns;

import java.util.*;

public class squarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input square dimension: ");
		int n = sc.nextInt();
		// Inner loop print columns and outer loop prints rows
		for (int i = 1; i <= n; i++) {
			System.out.println();
			for (int j = 1; j <= n; j++) {
				System.out.print("$ ");
			}

		}

	}

}