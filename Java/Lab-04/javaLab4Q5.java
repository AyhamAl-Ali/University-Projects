// Java Lab 4
// Ayham Al-Ali - 201910486
// 4/4/2020
// Question 5

import java.util.Scanner;

class javaLab4Q5 {


	public static void main(String[] args){

		// Console Colors
		String yelc = "\u001b[33m";
		String grnc = "\u001b[32m";
		String redc = "\u001b[31m";
		String resc = "\u001b[0m";

		Scanner sc = new Scanner(System.in);

		pr(yelc + "Enter the 1st number: " + resc);
		int n1 = sc.nextInt();
		
		pr(yelc + "Enter the 2nd number: " + resc);
		int n2 = sc.nextInt();

		pr(grnc + "\n1. Addition (+)\n");
		pr(grnc + "2. Subtraction (-)\n");
		pr(grnc + "3. Multiplication (*)\n");
		pr(grnc + "4. Division (/)\n");


		for(;;){

			pr(yelc + "\nEnter operation number: ");
			int op = sc.nextInt();

			switch(op){

				case 1: {
					pr(grnc + "Operation (Addition) = " + resc + (n1+n2) + "\n");
					return;
				}
				case 2: {
					pr(grnc + "Operation (Subtraction) = " + resc + (n1-n2) + "\n");
					return;
				}
				case 3: {
					pr(grnc + "Operation (Multiplication) = " + resc + n1*n2 + "\n");
					return;
				}
				case 4: {
					pr(grnc + "Operation (Division) = " + resc + n1/n2 + "\n");
					return;
				}
				default: {
					pr("\u001b[31mERROR! Unknown operation number.\nTrying again..\n");
				}

			}
		}

	}

	public static void pr(String s){
		System.out.print(s + "\u001b[0m");
	}

}