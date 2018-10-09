/**.
* Class for minimum pq.
*
* @param      <Key>  The key
*/
public class MinPQ <Key extends Comparable <Key>> {
	/**
	 * pq array of key type
	 */
	private Key[] pq;
	/**
	 * Constructs the object for class MinPQ
	 *
	 * @param      array  The array
	 */
	MinPQ(final Key[] array) {
		this.pq = array;
	}
	/**
	 * Checks if the array is min heap or not
	 * TIme complexityis N because for loop iterates for N times.
	 * @return     True if minimum pq, False otherwise.
	 */
	public boolean isMinPQ() {
		// for (int i = 0; i < pq.length - 1 ; i++) {
		// 	if (less(2*i, i) && less(((2*i)+1),i)){
		// 		return false;
		// 	}
		// }
		for (int i = 1; i < pq.length / 2; i++) {
			if (less(2*i, i) && less(2*i + 1, i)) {
				return false;
			}
			// if (less(i + 2, i)) {
			// 	return false;// here we will check the left child.
			// }
		}
		return true;
	}
	/**
	 * { compares two elements of pq array }
	 *  Time complexity is constant the statement is executed only once
	 * @param      i     { index of pq array }
	 * @param      j     { index of pq array }
	 *
	 * @return     { true if the condition is satisfied else it returns false}
	 */
	public boolean less(int i, int j) {
		return pq[i].compareTo(pq[j]) < 0;
	}
}
