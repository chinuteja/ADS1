/**.
 * 
 * { imports Scanner package }
 */
import java.util.Scanner;
/**.
 * class for solution
 */
public final class Solution {
	/**.
	 *@author Teja
	 * Constructs the object for solution class
	 */
	private Solution() {

	}
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] tokens = scan.nextLine().split(" ");
		int magzinesize = Integer.parseInt(tokens[0]);
		int notesize = Integer.parseInt(tokens[1]);
		String[] magzine = scan.nextLine().split(" ");
		// for(int i=0;i<magzine.length;i++)
		// 	System.out.println(magzine[i]);
		String[] note = scan.nextLine().split(" ");
		// for(int j=0;j<note.length;j++)
		// 	System.out.println(note[j]);
		
	}
} 