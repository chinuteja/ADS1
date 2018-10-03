/**.
 * Class for insertionsort.
 */
class Insertionsort {
	/**
	 * { sort method for Insertion sort. It sorts all the elements in asscending order }
	 * Complexity : N**2.
	 * @param      a     { parameter_description }
	 */
	public static void sort(final Comparable[] a) {
		// 
		int N = a.length;
		for (int i = 0; i < N; i++) {
			for (int j = i; j > 0; j--) {
				if (less(a[j], a[j-1])) {
					exchange(a, j, j-1);
				} else {
					break;
				}

			}
			
		}
	}
	/**
	 * { checks if the j th index element is less than or not with jth element }
	 *
	 * @param      i     { ith index element of a }
	 * @param      j     {jth  index element of a }
	 *complexity is 1
	 * @return     { returns true if condition statisfies}
	 */
	private static boolean less(final Comparable i, final Comparable j) {
        return i.compareTo(j) < 0;
    }
    /**
     * { exchanges the elements in ith index with jth indexd}
     *
     * @param      a     { comparable array }
     * @param      i     { index of a }
     * @param      j     { index of a }
     */
    private static void exchange(final Comparable[] a,
        final int i, final int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}