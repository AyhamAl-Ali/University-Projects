// Java Lab 7 Q5
import java.util.Scanner;

public class JavaLab7Q5Ayham {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = s.nextInt();
		
		float e = 0, fact = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++){
				fact *= j;
			}
			e += 1/fact;
		}
			
		e += 1;
		System.out.println("e = " + e);
			
		}

	}