
/*
	Made with ❤ By Ayham Al-Ali - 201910486
	Java Home Work 2
*/

import java.util.Scanner;

public class JavaHW2Ayham {
	public static void main(String[] args) {
		System.out.println("Program: Prime or Not Prime");

		Scanner s = new Scanner(System.in);

		pr("Enter a number: ");
		int num = s.nextInt();

		// 0 and 1 are not prime numbers
		if (num == 1 || num == 0) {
			pr(num + " is not a prime number.\n");
			return;
		}
		
		// if any of these values passes the condition then $num is not prime
		// Note: We could use the 'flag' method but since this is only a prime and not prime program we can use the 'return' method for short
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				pr(num + " is not a prime number.\n");
				return;
			}
		}
		pr(num + " is a prime number.\n");
		
	}
	
	public static void pr(Object m) {
		System.out.print(m);
	}
}