/**.
 * { imports Scanner package }
 */
import java.util.Scanner;
/**.
 * Class for solution.
 */
public class Solution {
	/**.
	 * Constructs the object for solution class.
	 */
	private Solution() {

	}
	/**.
	 * { main function }
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		Linkedlist l = new Linkedlist();
		while (scan.hasNext()) {
			String[] str = scan.nextLine().split(" ");
			switch (str[0]) {
			case "insertAt":
				l.insertAt(Integer.parseInt(str[1]), Integer.parseInt(str[2]));
				System.out.println(l.toString());
				break;
			case "reverse":
				try {
					l.reverse();
					System.out.println(l.toString());
				} catch (Exception e) {
					System.out.println("No elements to reverse.");
				}
				break;
			}
		}
	}
}