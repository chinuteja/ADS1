/**.
 * imports Scanner package
 */
import java.util.Scanner;
/**.
 * class for Solution
 */
public final class Solution {
	/**.
	 * Constructs the object for Solution
	 * @author Teja
	 */
	private Solution() {

	}
	/**.
	 * main method which demostrates the operations
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		int noofstudents = scan.nextInt();
		scan.nextLine();
		LinearProbingHashST<Student, Double> linearphst = new LinearProbingHashST<>();
		for (int i=0;i<noofstudents;i++) {
			String[] tokens = scan.nextLine().split(",");
			Student student = new Student(tokens[0],tokens[1],Double.parseDouble(tokens[2]));
			linearphst.put(student,	Double.parseDouble(tokens[2]));

		}
		// int quires = scan.nextInt();
		// scan.nextLine();
		// for (int i=0;i<quires;i++) {
		// 	String[] tokens1 = scan.nextLine().split(" ");
  //           linearphst.get();
		// }
	}
}