/**
 * { importing Scanner package }
 */
import java.util.Scanner;
/**
 * { importing Array package }
 */
import java.util.Arrays;
/**
 * Class for selectionsort.
 */
final class Selectionsort {
    /**
     * Constructs the object.
     */
    private Selectionsort() {

    }
    /**.
     * { method for sorting elements using Selection sort technique}
     *  The time complexity for this method is : N^2.
     * @param      a     {Comparable array }
     */
    public static void sort(final Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exchange(a, i, min);

        }
    }
    /**.
     * { compares two objects if they are comparable }
     *
     * @param      i     { index of array a }
     * @param      j     { index of array a }
     *
     * @return     { returns true if condition satisfies}
     * The time complexity for this method is :1.
     */
    private static boolean less(final Comparable i, final Comparable j) {
        return i.compareTo(j) < 0;
    }
    /**.
     * { function for swapping elements.Swaps the two elements in an array}
     * @param      i     { index of array a }
     * @param      j     { index of array a }
     * @param      a     { array of comparable type}
     * The complexity for this method is : 1.
     */
    private static void exchange(final Comparable[] a,
        final int i, final int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
/**.
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**.
     * { main method }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        //Selectionsort s = new Selectionsort();
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        for (int i = 0; i < Integer.parseInt(input); i++) {
            String str = scan.nextLine();
            String[] string = str.split(" ");
            //System.out.println(string);
             Selectionsort.sort(string);
            System.out.println(Arrays.toString(string));
        }

    }
}
