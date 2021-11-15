import java.util.Scanner;

public class JavaQuiz {
	public static void main(String[] arg) {

		Scanner s = new Scanner(System.in);
		
		pr("Enter the course name: ");
		String course = s.next();

		int mark, fail = 0;
		
		for (int i = 1; i <= 30; i++) {
			pr("Enter the mark student (" + i + "): ");
			mark = s.nextInt();

			while (mark > 100 || mark < 0) {
				pr("(!) Result of student  (" + i + "): Invalid\n");
				pr("Enter the mark student (" + i + ") [Again]: ");
				mark = s.nextInt();
			}
			
			if (mark < 50) {
				pr("> Result of student  (" + i + "): Fail");
				fail++;
			} else if (mark >= 50 && mark <= 75) {
				pr("> Result of student  (" + i + "): Good");
			} else {
				pr("> Result of student  (" + i + "): Excellent");
			}

			pr("\n");

		}
		
		pr("Average of failed students in course (" + course + "): " + fail/30.0 + "\n");

	}

	public static void pr(Object m) {
		System.out.print(m);
	}
}