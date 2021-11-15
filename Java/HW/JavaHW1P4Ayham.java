
/*
	Made with ❤ By Ayham Al-Ali - 201910486
	Java Home Work 1 Part 4
*/

public class JavaHW1P4Ayham {
	public static void main(String[] args) {
		System.out.println("Pattern IV");
		// Lines
		for (int i = 1; i <= 6; i++) {
			// Space
			for (int j = 1; j <= i-1; j++) {
				System.out.print("  ");
			}

			// Numbers
			for (int k = 1; k <= 7-i; k++) {
				System.out.print(k + " ");
			}
			System.out.print("\n");
		}


    }
}