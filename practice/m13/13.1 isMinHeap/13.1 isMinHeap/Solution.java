/**.
 * impors scanner package
 */
import java.util.Scanner;
/**.
 * Class for solution.
 *
 */
public final class Solution  {
    /**.
     * Constructs the object for Solution
     * @author Teja
     */
    private Solution() {

    }
    /**.
     * main function
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String key = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        switch (key) {
        case "String":
            while (n > 0) {
                String[] token = scan.nextLine().split(",");
                MinPQ<String> data = new MinPQ<String>(token);
                System.out.println(data.isMinPQ());
                n--;
            }
            break;
        case "Integer" :
            while (n > 0) {
                String[] token = scan.nextLine().split(",");
                Integer[] integerarray = new Integer[token.length];
                for (int i = 0; i < token.length; i++) {
                    integerarray[i] = Integer.parseInt(token[i]);
                }
                MinPQ<Integer> data = new MinPQ<Integer>(integerarray);
                System.out.println(data.isMinPQ());
                n--;
            }
            break;
        case "Float" :
            while (n > 0) {
                String input = scan.nextLine();
                if (input.equals("")) {
                    System.out.println("false");
                    break;
                }
                String[] token = input.split(",");
                Float[] floatarray = new Float[token.length];
                for (int i = 0; i < token.length; i++) {
                    floatarray[i] = Float.parseFloat(token[i]);
                }
                MinPQ<Float> data = new MinPQ<Float>(floatarray);
                System.out.println(data.isMinPQ());
                n--;
            }
            break;
        case "Double" :
            while (n > 0) {
                String[] token = scan.nextLine().split(",");
                Double[] doublearray = new Double[token.length];
                for (int i = 0; i < token.length; i++) {
                    doublearray[i] = Double.parseDouble(token[i]);
                }
                MinPQ<Double> data = new MinPQ<Double>(doublearray);
                System.out.println(data.isMinPQ());
                n--;
            }
            break;
            default:
                break;
        }
    }
}
