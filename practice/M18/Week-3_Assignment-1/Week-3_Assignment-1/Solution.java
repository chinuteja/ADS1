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
    /**.
     * to demonstrate the solution
     *
     * @param      args  command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        // BinarySearchST<Stock, Double>  binarysearchst =
        //     new BinarySearchST<Stock, Double>(n);
        MinPQ<Double> minpq = new MinPQ<Double>(n);
        MaxPQ<Double> maxpq = new MaxPQ<Double>(n);
        for (int i = 0; i < n; i++ ) {
            String[] tokens = scan.nextLine().split(",");
            Stock stock = new Stock(tokens[0], Double.parseDouble(tokens[1]));
            minpq.insert(Double.parseDouble(tokens[1]));
            maxpq.insert(Double.parseDouble(tokens[1]));
        }
        // binarysearchst.put(stock, maxpq.delMax());
        // binarysearchst.put(stock, minpq.delMin());
        //     System.out.println(binarysearchst.toString());
        //Stock stock1 = new Stock();
        for (int i = 0; i < 5; i++) {
            System.out.println("top five" +maxpq.delMax());
            //binarysearchst.put(stock1, maxpq.delMax());
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            //System.out.println("min val" + minpq.delMin());
            //binarysearchst.put(stock1,minpq.delMin());
            System.out.println("bottom five" +minpq.delMin());
        }

    }
}
