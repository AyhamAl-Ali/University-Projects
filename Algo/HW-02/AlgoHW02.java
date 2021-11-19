/*
    Algorithm Homework 02
    Name: Ayham Al-Ali
    UID: 201910486
    Date: 31/10/2021
 */

// Question:
//      Write a code (in any language) to check the permutation of a sequence (array), you need to check if the numbers in the array are sorted ascendingly, and if there are no repetitions.
//      Examples for permutations:
//      1, 2, 3, 4, 5
//      4, 6, 7
//      11, 55, 77, 78, 79

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        int input;

        do {
            System.out.print("Enter next number (enter 0 to stop): ");
            input = sc.nextInt();
            list.add(input);
        } while (input != 0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get((i+1))) {
                System.out.println("\n----\nList is not in ascending order. (" + list.get((i-1)) + " " + list.get(i) + " " + list.get((i+1)) + ")\n----\n");
                return;
            } else if  (list.get(i) == list.get((i+1))) {
                System.out.println("\n----\nList contains duplicates. (" + list.get(i) + " " + list.get((i+1)) + ")\n----\n");
                return;
            }
        }

        System.out.println("\n----\nYour list is in ascending order with no duplicates.\n----\n");

    }
}
