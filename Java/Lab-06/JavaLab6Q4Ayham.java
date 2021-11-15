/*
    Java Lab 6 - Q4
    Ayham AlAli - 201910486
*/

import java.util.Scanner;

public class JavaLab6Q4Ayham {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        pr("-= Program: Read positive number and print out its reversed number =-\n\n");

        pr("Enter the number: ");
        int num = s.nextInt();

        if (num < 0) {
            pr("Error! You must enter a positive number.\n");
            return;
        }
        
        for (int i = 1; i<= String.valueOf(num).length() ; i++) {

            pr(num % (int)Math.pow(10, i) / (int)Math.pow(10, i-1));
        }
        pr("\n");
        
    }


    public static void pr(Object m){
        System.out.print(m);
    }
}