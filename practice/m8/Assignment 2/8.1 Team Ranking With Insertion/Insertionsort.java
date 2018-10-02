class Insertionsort {
	public static void sort(final Comparable[] a) {
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
	private static boolean less(final Comparable i, final Comparable j) {
        return i.compareTo(j) < 0;
    }
    private static void exchange(final Comparable[] a,
        final int i, final int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}