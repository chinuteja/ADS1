/**
 * Class for selectionsort.
 */
class Selectionsort {
	/**
	 * { method to sort all the elements in array. }
	 *
	 * @param      a     { comparable array}
	 */
	public static void sort(final Comparable[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if (less(a[j], a[min])) {
					min = j;
				}
			}
			exchange(a,i,min);
		}
	}
	/**
	 * { checks if ith index  element is less than jth index element of array a }
	 *
	 * @param      i     { index of a }
	 * @param      j     { index of a }
	 *
	 * @return     { returns 1 if condition is true else -1 }
	 */
	private static boolean less(final Comparable i, final Comparable j) {
        return i.compareTo(j) < 0;
    }
    /**
     * { exchanges the elements of ith index and jth index }
     *
     * @param      a     { comparable array }
     * @param      i     { ith index }
     * @param      j     { jth index }
     */
    private static void exchange(final Comparable[] a,
        final int i, final int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}