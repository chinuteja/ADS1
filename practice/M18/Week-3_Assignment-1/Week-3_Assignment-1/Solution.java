/**.
 * { imports the Scanner packagae }
 */
import java.util.Scanner;
/**.
 * { This is the class used to find the
 *  top five and bottom five stock exchanges of given N companies }
 */
public final class  Solution {
	/**.
	 * Default constructor
	 * @author Teja
	 */
	private Solution() {

	}
	/**
	 * to demonstrate the solution
	 *
	 * @param      args  command line arguments
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		BinarySearchST<String, Double>  binarysearchst =
		   new BinarySearchST<String, Double>(n);
		MinPQ<Double> minpq = new MinPQ<Double>(n);
		MaxPQ<Double> maxpq = new MaxPQ<Double>(n);
		while (scan.hasNext()) {
			String[] tokens = scan.nextLine().split(",");
			Stock stock = new Stock(tokens[0], Double.parseDouble(tokens[1]));
			minpq.insert(Double.parseDouble(tokens[1]));
			maxpq.insert(Double.parseDouble(tokens[1]));
			binarysearchst.put(stock, maxpq.delMax());
			binarysearchst.put(stock, minpq.delMin());
			System.out.println(binarysearchst.toString());
		}
	}
}
