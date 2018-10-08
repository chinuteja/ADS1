public class MinPQ <Key extends Comparable <Key>> {
	private Key[] pq;
	MinPQ(final Key[] array) {
		this.pq = array;
	}
	public boolean isMinPQ() {
		for (int i = 0; i < pq.length - 1 ; i++) {
			if (less(2*i, i) && less(((2*i)+1),i)){
				return false;
			}
		}
		return true;
	}
	public boolean less(int i, int j) {
		return pq[i].compareTo(pq[j]) < 0;
	}
}