// Java Lab 4
// Ayham Al-Ali - 201910486
// 4/4/2020
// Question 6

import java.util.Scanner;

class javaLab4Q6 {


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		pr("Enter a number between 0 and 1000: ");
		int num = sc.nextInt();
		
		if (num > 1000 || num < 0){ // remove this and any number will be acceptable and functional
			pr("ERROR! The number must be between 0 and 1000.\nTrying again..\n\n");
			main(null);
			return;
		}

		int sum = 0, temp, length = String.valueOf(num).length();
		for(int i = 1; i <= length; i++){
			temp = num % 10;
			sum += temp;
			pr(String.valueOf(num).length() > 1 ? temp + " + " : temp + " = " + sum + "\n");
			num /= 10;
		}
		
	}

	public static void pr(String s){
		System.out.print(s);
	}

}