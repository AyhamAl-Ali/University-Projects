/*
    Java Lab 6 - Q1
    Ayham AlAli - 201910486
*/

import java.util.Scanner;

public class JavaLab6Q1Ayham {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        pr("-= Program: Calculate multiple integer numbers (Enter -1 to calculate) =-\n\n");
        int num, sum = 0;
        
        while ( true ) {
            pr("Enter an integer number: ");

            num = s.nextInt();
            if (num == -1) { break; }
            sum += num;
            
        }

        pr("Sum: " + sum + "\n");

    }


    public static void pr(String m){
        System.out.print(m);
    }
}