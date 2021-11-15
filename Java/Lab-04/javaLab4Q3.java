// Java Lab 4
// Ayham Al-Ali - 201910486
// 4/4/2020
// Question 3

import javax.swing.JOptionPane;

class javaLab4Q3 {

	public static void main(String[] args){

		JOptionPane jo = new JOptionPane();

		int num1, num2;

		String n1 = jo.showInputDialog("Enter the 1st number: ");
		String n2 = jo.showInputDialog("Enter the 2nd number: ");

		if (n1 != null && n2 != null) {
			try {
				num1 = Integer.parseInt(n1);
				num2 = Integer.parseInt(n2);
			}
			catch(NumberFormatException ex) {
				jo.showMessageDialog(null, "ERROR! Only numbers accepted. (NumberFormatException)", "Error", 0);
				return;
			}
		}
		else {
			jo.showMessageDialog(null, "ERROR! Please enter numbers. (Input Expected)", "Error", 0);
			return;
		}

		// In case option was unknown, user won't have to re-do all the process, only the choice step will be re-done.
		for(;;){
			String choice = jo.showInputDialog( // No need to input an int
				"1st Number: " + num1 + 
				"\n2nd Number: " + num2 + 
				"\n***********************" + 
				"\n1. Sum" + 
				"\n2. Sum and Average" + 
				"\n3. Sum, Average and max" + 
				"\n***********************" + 
				"\nChoose your option [1, 2, 3]: "
				);

			// Sum
			if (choice.equals("1")){
				jo.showMessageDialog(null, "Sum: " + num1 + " + " + num2 + " = " + (num1+num2), "Results", 1);
				return;
			}

			// Sum, Avg
			else if (choice.equals("2")){
				jo.showMessageDialog(null, 
					"Sum: " + num1 + " + " + num2 + " = " + (num1+num2) + 
					"\nAverage: " + num1 + " and " + num2 + " = " + (num1+num2)/2, "Results", 1
					);
				return;
			}

			// Sum, Avg, Max
			else if (choice.equals("3")){
				jo.showMessageDialog(null, 
					"Sum: " + num1 + " + " + num2 + " = " + (num1+num2) + 
					"\nAverage: " + num1 + " and " + num2 + " = " + (num1+num2)/2 + 
					"\nMax: " + num1 + " and " + num2 + " = " + Math.max(num1, num2), "Results", 1
					);
				return;
			}

			// Error
			else{
				jo.showMessageDialog(null, "Error! Unknown option.\n trying again..", "Error", 0);
				//main(null); // Re-do all the steps again
			}
		}


	}

}