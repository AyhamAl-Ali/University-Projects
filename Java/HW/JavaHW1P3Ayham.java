
/*
	Made with ❤ By Ayham Al-Ali - 201910486
	Java Home Work 1 Part 3
*/

public class JavaHW1P3Ayham {
	public static void main(String[] args) {
		System.out.println("Pattern III");
		// Lines
		for (int i = 1; i <= 6; i++) {
			// Spaces
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print("  ");
			}
			
			// Numbers
			for (int k = i; k >= 1; k--) {
				System.out.print(k + " ");
			}
			System.out.print("\n");
		}


    }
}