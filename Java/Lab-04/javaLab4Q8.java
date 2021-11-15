// Java Lab 4
// Ayham Al-Ali - 201910486
// 4/4/2020
// Question 8

import java.util.Scanner;

class javaLab4Q8 {


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		pr("Enter a number: ");
		int num = sc.nextInt();

		pr("Is " + num + " an even number? ");
		pr(num%2 == 0 ? "True\n" : "False\n");
		
	}

	public static void pr(String s){
		System.out.print(s);
	}

}