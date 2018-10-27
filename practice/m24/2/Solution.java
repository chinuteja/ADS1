/**.
 * imports Scanner package
 */
import java.util.Scanner;
/**.
 * Solution class
 */
public final class Solution {
	/**.
	 * Constructs the object for solution class
	 * @author Teja
	 */
	private Solution() {

	}
	/**.
	 * main function which demostrates the operations
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		BinarySearchST<Integer, String> binarysearchst =
		    new BinarySearchST<>();
		int noofstudents = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < noofstudents; i++) {
			String[] input = scan.nextLine().split(",");
			String str = input[1] + "," + input[2];
			binarysearchst.put(Integer.parseInt(input[0]), str);
		}
		int quires = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < quires; i++) {
			String[] input = scan.nextLine().split(" ");
			// binarysearchst.BE(Double.parseDouble(input[1]),
		 //                  Double.parseDouble(input[2]));
		}
	}
}
