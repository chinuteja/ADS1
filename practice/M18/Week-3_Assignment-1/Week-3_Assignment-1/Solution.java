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
        for (int i = 0; i < n; i++) {
            MaxPQ<Stock> best = new MaxPQ<Stock>(n);
            MinPQ<Stock> least = new MinPQ<Stock>(n);
            for(int j = 0; j < 6; j++) {
            String[] tokens = scan.nextLine().split(",");
            Stock stock = new Stock(tokens[0], Double.parseDouble(tokens[1]));
            best.insert(stock);
            least.insert(stock);
            }
            for (int k = 0; k < 5; k++) {
            System.out.println("top five" +" " +best.delMax());
            //binarysearchst.put(stock1, maxpq.delMax());
        }
        System.out.println();
        for (int l = 0; l < 5; l++) {
            //System.out.println("min val" + minpq.delMin());
            //binarysearchst.put(stock1,minpq.delMin());
            System.out.println("bottom five" +" "+least.delMin());
        }
            

        }

	}
}
