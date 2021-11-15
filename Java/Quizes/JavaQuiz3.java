import java.util.Scanner;

class JavaQuiz3Ayham {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		pr("Enter a number: ");
		int n = s.nextInt();
		
		float sum = 0, fact;

		for (int i = 2; i <= n; i++) {

			if (i % 2 != 0) { continue; }

			// Factorial
			fact = 1;
			for (int f = 1; f <= i; f++) {
				fact *= f+1;
			}

			sum += i/fact;
			//pr("i = " + i + " ---- fact = " + fact + "\n"); // Debugging
			
		}

		pr("Result: " + sum + "\n");

	}

	public static void pr(Object m) {
		System.out.print(m);
	}


}