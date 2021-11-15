/*
    Java Lab 6 - Q3
    Ayham AlAli - 201910486
*/

import java.util.Scanner;

public class JavaLab6Q3Ayham {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        pr("-= Program: Read student marks and print the Sum, avg and classification (Enter -1 to calculate) =-\n\n");

        int markCount = 0, sum = 0, mark;
        
        for (;;) {
            pr("Enter a mark: ");
            mark = s.nextInt();

            if (mark == -1) {break;}
            sum += mark;
            markCount++;
        }
        
        int avg = sum/markCount;

        pr("Sum: " + sum + "\n");
        pr("Average: " + avg + "\n");
        
        if (avg >= 90 && avg <= 100) {
            pr("Classification of the Average: A\n");}
        
        else if (avg >= 80 && avg <= 89) {
            pr("Classification of the Average: B\n");}
        
        else if (avg >= 70 && avg <= 79) {
            pr("Classification of the Average: C\n");}
        
        else if (avg >= 60 && avg <= 69) {
            pr("Classification of the Average: D\n");}
        
        else if (avg >= 50 && avg <= 59) {
            pr("Classification of the Average: P\n");}
        
        else if (avg >= 0 && avg <= 49) {
            pr("Classification of the Average: F\n");}

        else {
            pr("Error! The average of your marks is not between 0 and 100. \n");}
        
    }


    public static void pr(Object m){
        System.out.print(m);
    }
}