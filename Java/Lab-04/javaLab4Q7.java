// Java Lab 4
// Ayham Al-Ali - 201910486
// 4/4/2020
// Question 7

import java.util.Scanner;

class javaLab4Q7 {


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		pr("Enter the 1st triangle edge: ");
		int e1 = sc.nextInt();

		pr("Enter the 2nd triangle edge: ");
		int e2 = sc.nextInt();

		pr("Enter the 3rd triangle edge: ");
		int e3 = sc.nextInt();

		pr("Can edges " + e1 + ", " + e2 + " and " + e3 + " form a triangle? ");
		if (e1+e2 <= e3 || e1+e3 <= e3 || e2+e3 <= e1) {
			pr("False\n");
		}
		else{
			pr("True\n");
		}
		
	}

	public static void pr(String s){
		System.out.print(s);
	}

}