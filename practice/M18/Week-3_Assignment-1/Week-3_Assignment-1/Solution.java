/**
 * @author Teja.
 * { item_description }
 */
import java.util.Scanner;
/**
 * Solution class contain main method.
 */
public final class Solution {
	/**
	 * Constructs the object for solution.
	 */
	private Solution() {

	}
	/**
	 * main method is used to handle the inputs.
	 *
	 * @param      args  The command line arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		 BinarySearchST<String,  Integer> maxObj =
            new BinarySearchST<String, Integer>();
        BinarySearchST<String, Integer> minObj =
            new BinarySearchST<String, Integer>();
		for (int i = 0; i < 6; i++) {
			MaxPQ<Stock> best = new MaxPQ<Stock>(n);
			MinPQ<Stock> least = new MinPQ<Stock>(n);
			for (int j = 0; j < n; j++) {
				String[] tokens = scan.nextLine().split(",");
				Stock stock = new Stock(tokens[0], Double.parseDouble(tokens[1]));
				best.insert(stock);
				least.insert(stock);
			}
			for (int k = 0; k < 5; k++) {
				System.out.println(best.delMax());
				//maxObj.put(best.delMax().getName(),);
			}
			System.out.println();
			//binarysearchst.put(stock1, maxpq.delMax());
			for (int l = 0; l < 5; l++) {
				System.out.println(least.delMin());
			}
			System.out.println();
		}
	}
}
