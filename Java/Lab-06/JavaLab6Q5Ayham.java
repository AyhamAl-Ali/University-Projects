/*
    Java Lab 6 - Q5
    Ayham AlAli - 201910486
*/

import java.util.Scanner;

public class JavaLab6Q5Ayham {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        pr("-= Program: Read positive number and print out its factorial =-\n\n");

        pr("Enter the number: ");
        long fact = 1, num = s.nextInt(); // long for bigger numbers
        
        for (int i = 1; i<= num; i++) { // or from num to 1, all the same
            fact *= i;
        }
        pr("Fact of (" + num + ") = " + fact + " \n");
        
    }


    public static void pr(Object m){
        System.out.print(m);
    }
}