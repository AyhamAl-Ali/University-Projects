// Java Lab 4
// Ayham Al-Ali - 201910486
// 4/4/2020
// Question 9

import java.util.Scanner;

class javaLab4Q9 {


	public static void main(String[] args){

		// Console Colors
		String yelc = "\u001b[33m";
		String grnc = "\u001b[32m";
		String redc = "\u001b[31m";

		Scanner sc = new Scanner(System.in);

		pr("Enter the Bus Model (year): ");
		int busmodel = sc.nextInt();

		pr("Enter the Bus Seats count: ");
		int busseats = sc.nextInt();

		pr("Enter the Students count: ");
		int stcount = sc.nextInt();

		if (busmodel < 2000 || stcount > busseats) {
			pr(redc + "Trip is rejected.\n");
		}
		else if (busmodel > 2000 && stcount < busseats) {
			pr(grnc + "Trip is approved.\n");
		}
		else {
			pr(yelc + "Trip might be approved.\n");
		}
		
	}

	public static void pr(String s){
		System.out.print(s + "\u001b[0m");
	}

}