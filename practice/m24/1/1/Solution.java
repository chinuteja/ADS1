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
		LinearProbingHashST<Integer, String> linearphst = new LinearProbingHashST<>();
		for (int i = 0; i < noofstudents; i++) {
			String[] inputs = scan.nextLine().split(",");
			String str = inputs[1] + "," + inputs[2];
			//Student student = new Student(inputs[0],inputs[1],Double.parseDouble(inputs[2]));
			linearphst.put(Integer.parseInt(inputs[0]), str);
		}
		int quires = Integer.parseInt(scan.nextLine());
        for (int j = 0; j < quires; j++) {
            String[] inputs1 = scan.nextLine().split(" ");
            String s = linearphst.get(Integer.parseInt(inputs1[1]));
            if (s != null) {
                String[] inputs2 = s.split(",");
                if (Integer.parseInt(inputs1[2]) == 1) {
                    System.out.println(inputs2[0]);
                } else {
                    System.out.println(
                        Double.parseDouble(inputs2[1]));
                }
            } else {
                System.out.println("No students");
            }
        }
    }
 }


