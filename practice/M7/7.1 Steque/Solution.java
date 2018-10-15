/**.
 * imports Scanner package
 */
import java.util.Scanner;
/**.
 * class for Solution
 */
public final class Solution {
    /**.
     * default constructor
     * @author Teja
     */
    private Solution() {

    }
    /**
     * main mehtod which describes the operations of steque
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcases = scan.nextInt();
        Steque ss = new Steque();
        scan.nextLine();
        for (int i = 0; i < testcases; i++) {
            while (scan.hasNext()) {
                String[] tokens = scan.nextLine().split(" ");
                switch (tokens[0]) {
                case "pop":
                    ss.pop();
                    System.out.println(ss);
                    //ss.toString();
                    break;
                case "enqueue":
                    ss.enqueue(tokens[1]);
                    System.out.println(ss);
                    //ss.toString();
                    break;
                // //System.out.println();
                case "push" :
                    ss.push(tokens[1]);
                    System.out.println(ss);
                    //ss.toString();
                    break;
                default:
                    break;
                }
            }
        }
    }
}
