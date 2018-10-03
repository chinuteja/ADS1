
class MergeSort {
	private static void merge(Comparable[] a, Comparable[] aux, int low, int mid, int high) {
		// assert isSorted(a, low, mid);
		// assert isSorted(a, mid + 1, high);
		for (int k = low; k <= high; k++) {
			aux[k] = a[k];
		}
		int i = low, j = mid + 1;
		for (int k = low; k <= high ; k++) {
			if (i > mid) a[k] = a[j++];
			else if (j > high) a[k] = a[i++];
			else if (less(aux[j], aux[i])) a[k] = aux[j++];
			else a[k] = a[i++];
		}
		//assert isSorted(a,low,high);
	}
	private static void sort(Comparable[] a, Comparable[] aux, int low, int high) {
		if (high <= low) return ;
		int mid = low + (high - low) / 2;
		sort(a, aux, low, mid);
		sort(a, aux, mid + 1, high);
		merge(a, aux, low, mid, high);
	}
	public static void sort(Comparable[] a) {
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);
	}
	private static boolean less(final  Comparable i, final Comparable j) {
		return i.compareTo(j) < 0;
	}
}