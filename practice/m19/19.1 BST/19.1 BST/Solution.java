/**.
 * imports Scanner pAckage
 */
import java.util.Scanner;
/**.
 * { class for Solution }
 */
public final class Solution {
	/**.
	 * Constructs the object.for solution class
	 */
	private Solution() {

	}
	/**.
	 * demostrates BST operations 
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		BinarySearchT<Book,Integer> binarysearcht = new BinarySearchT<>();
		while (scan.hasNext()) {
			String[] tokens = scan.nextLine().split(",");
			switch (tokens[0]) {
				case "put":
				Book book = new Book(tokens[1],tokens[2],Double.parseDouble(tokens[3]));
				binarysearcht.put(book,Integer.parseInt(tokens[4]));
				break;
				case "get":
				Book book1 = new Book(tokens[1],tokens[2],Double.parseDouble(tokens[3]));
				System.out.println(binarysearcht.get(book1));
				break;
				case "min":
				//Book book2 = new Book(tokens[1],tokens[2],Double.parseDouble(tokens[3]));
				System.out.println(binarysearcht.min());
				break;
				case "max":
				//Book book3 = new Book(tokens[1],tokens[2],Double.parseDouble(tokens[3]));
				System.out.println(binarysearcht.max());
				break;
				case "floor":
				Book book4 = new Book(tokens[1],tokens[2],Double.parseDouble(tokens[3]));
				System.out.println(binarysearcht.floor(book4));
				break;
				case "ceiling":
				Book book5 = new Book(tokens[1],tokens[2],Double.parseDouble(tokens[3]));
				System.out.println(binarysearcht.ceiling(book5));
				break;
				case "select" :
				Book book6 = new Book(tokens[1],tokens[2],Double.parseDouble(tokens[3]));
				System.out.println(binarysearcht.select(Integer.parseInt(tokens[4])));
				break;

			}
			
		}
		
	}

}
