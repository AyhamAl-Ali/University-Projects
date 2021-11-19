/**
 *
 * Insertion Sort Algorithm
 * Name: Ayham Al-Ali
 * UID: 201910486
 * Date: 11/19/2021 (MM/DD/YY)
 *
 */
public class Main {
    public static void main(String[] args)
    {
        int[] myArray = {5, 6, 7, 1, 22, 50, 4, 9, 25};

        // Unsorted
        System.out.print("Unsorted: ");
        printArray(myArray);

        // Ascending order
        InsertionSort(myArray);
        System.out.print("Sorted (Ascending): ");
        printArray(myArray);

        // Descending order
        InsertionSort(myArray, true);
        System.out.print("Sorted (Descending): ");
        printArray(myArray);
    }

    /**
     * Sort using inserting sort method in ascending order
     * @param A integers to sort
     */
    public static void InsertionSort(int[] A) {
        InsertionSort(A, false);
    }

    /**
     * Sort using inserting sort method
     * @param A integers to sort
     * @param isDescending should sort in descending order
     */
    public static void InsertionSort(int[] A, boolean isDescending) {
        int size = A.length;
        if (!isDescending) { // Method: Moving from the left to the right
            for (int i = 1; i < size; i++)
            {
                int key = A[i];
                int j = i - 1;
                //while (j > -1 && A[j] < key) { // Descending Order (Simplest way)
                while (j > -1 && A[j] > key) {
                    A[j+1] = A[j];
                    j--;
                }
//                printArray(A); // Debugging mode
                A[j+1] = key;

            }
        } else { // Method: Moving from the right to the left
            for (int i = size - 1; i >= 0; i--) {
                int oldValue = A[i];
                int nextValue = i + 1; // we begin from the second position after i
                while (nextValue < size && A[nextValue] > oldValue) {
                    A[nextValue - 1] = A[nextValue];
                    nextValue++;
                }
//                printArray(A); // Debugging mode
                A[nextValue-1] = oldValue;
            }
        }
    }

    /**
     * Print objects
     * @param A objects to print
     */
    public static void printArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + "  ");
        }
        System.out.println();
    }

}
