package patterns;
import java.util.Scanner;
public class ReverseHillPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Input pattern dimension: ");
int n= sc.nextInt();
// Made by one increasing space and 2 decreasing dollar signs

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
	
	
	}

}}
