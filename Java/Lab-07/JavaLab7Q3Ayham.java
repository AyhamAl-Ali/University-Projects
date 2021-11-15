class JavaLab7Q3Ayham {

	public static void main(String[] args) {

		// Correct the following convertion from for loop to while loop

		// For loop
		/*
		for (int i = 0; i < 4; i++) {
			if (i % 3 == 0) {
				continue;
			}
			sum += i;
		}*/
		
		// While loop
		int i = 0;
		while (i < 4) {
			if (i % 3 == 0) {
				continue;
			}
			sum += i;
			i++;

			// !Answer!
			// Answer: The i++ will not be executed when the if condition is true and that will cause infinite loop at that value of i.
			// And in both codes, the sum variable is not declared so this is also gives an error
			// !Answer!
		}
		


	}


}