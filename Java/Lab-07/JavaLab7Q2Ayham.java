class JavaLab7Q2Ayham {

	public static void main(String[] args) {

		// Q2 Part A
		/*
		int i = 1;
		while (i > 10) {
			if ((i++) % 2 == 0) {
				System.out.println(i);
			}
		}
		*/

		// !Answer!
		// Answer: It should repeat 10 times but it will only repeat 0 times and prints nothing because (i = 1) while the condotion is (i > 10) so it's false
		// !Answer!

		int i = 1;
		while (i < 10) {
			if ((i++) % 2 == 0) {
				System.out.println(i);
			}
		}

		// !Answer!
		// Answer: It will repeat 10 times and prints 
		// 3
		// 5
		// 7
		// 9
		// Note: The code in the lab picture shows (int i - 1) whilwI don't know if this is a mistake so i assumed it is (int i = 1)
		// However, if it is (int i - 1) it will give an error
		// !Answer!


	}


}