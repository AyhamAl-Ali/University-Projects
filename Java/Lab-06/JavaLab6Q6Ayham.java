/*
    Java Lab 6 - Q1
    Ayham AlAli - 201910486
*/

import java.util.Scanner;

public class JavaLab6Q6Ayham {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		pr("Enter X value: ");
		float x = s.nextFloat();

		pr("Enter N value: ");
		float n = s.nextFloat();

		float r = 0;

		for (int i = 1; i <= n; i++) {
			r += i / Math.pow(x, i);
		}
		pr("R = " + r + "\n");

        
	}
	
	static void pr(Object m) {
		System.out.print(m);
	}

}