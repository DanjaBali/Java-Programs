package patterns;
import java.util.Scanner;
public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n = sc.nextInt();

//Outer loop determines rows and inner loop determines columns.
//This pattern is made up of a hill and reverse hill pattern.

for(int i=1;i<=n;i++) {
	for (int j=i;j<=n;j++) {
	System.out.print(" ");
	}
	for (int j=1;j<i;j++) {
		System.out.print("$");
	}
	for(int j=1; j<=i;j++){
		System.out.print("$");
	}
	System.out.println();
}
for (int i = 1; i <= n; i++) {
	for (int j = 1; j <= i; j++) {
		System.out.print(" ");
	}

for (int j = i; j <n; j++) {
	System.out.print("$");
}
for (int j = i; j <= n; j++) {
	System.out.print("$");
}
System.out.println();	
	
	
}}
}
