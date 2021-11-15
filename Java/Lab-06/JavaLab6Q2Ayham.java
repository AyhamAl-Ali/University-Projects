/*
    Java Lab 6 - Q2
    Ayham AlAli - 201910486
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class JavaLab6Q2Ayham {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        pr("-= Program: Read 10 numbers and print the max and the min of them =-\n\n");

        // Method 1
        
        int i = 1, num, max = 0;
        Integer  min = null; // int is primitive data type and can not be null, using Integer allows us to use if ( min == null)
        
        do {
            pr("Enter a number: ");
            num = s.nextInt();

            max = Math.max(max, num);
            min = min == null ? min = num : Math.min(min, num);

            i++;
        } while (i <= 10);
        
        pr("Max: " + max + "\n");
        pr("Min: " + min + "\n");
        

        // Method 2
        /*
        ArrayList<Integer> num = new ArrayList<Integer>(); // or Float
        int i = 1;

        do {
            pr("Enter a number: ");
            num.add(s.nextInt());
            i++;
        } while (i <= 10);

        Collections.sort(num);
        pr("Max: " + num.get(num.size() - 1) + "\n");
        pr("Min: " + num.get(0) + "\n");
        */

    }


    public static void pr(Object m){
        System.out.print(m);
    }
}