package patterns;
import java.util.Scanner;
public class HillPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);

System.out.println("Input pattern dimension: ");
int n = sc.nextInt();
//Outer loop determines rows and inner loop determines columns.
//This pattern is made by an decreasing space, two increasing triangles of dollaar signs.
	
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
	
	
	
	}

}
