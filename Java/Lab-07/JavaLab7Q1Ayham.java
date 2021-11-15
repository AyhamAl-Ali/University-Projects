class JavaLab7Q1Ayham {

	public static void main(String[] args) {

		// Convert this for loop to while loop and do while loop
		/*
		long sum = 0;
		for (int i = 0; i <= 1000; i++)
		sum = sum + i;
		*/

		// while loop
		
		long sum = 0, i = 0;
		while (i <= 1000) {
			sum += i;
			i++;
		}
		
		// do while loop
		/*
		long sum = 0, i = 0;
		do {
			sum += i;
			i++;
		} while (i <= 1000);
		*/
	}


}