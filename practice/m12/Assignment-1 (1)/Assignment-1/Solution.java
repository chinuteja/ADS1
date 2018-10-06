/**.
 * { imports Scanner package }
 */
import java.util.Scanner;
/**
 * { imports arrays package}
 */
import java.util.Arrays;
/**.
 * Class for solution.
 */
public class Solution {
	/**.
	 * Constructs the object for soluiton class.
	 */
	private Solution() {

	}
	/**
	 * { main function }
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		int stud = scan.nextInt();
		//System.out.println("Student " +stud);
		int vaccany = scan.nextInt();
		//System.out.println("vaccany" +vaccany);
		int unreserved= scan.nextInt();
		//System.out.println("unreserved" +unreserved);
		int bc = scan.nextInt();
		//System.out.println("scan" +bc);
		int sc = scan.nextInt();
		//System.out.println("sc" +sc);
		int st = scan.nextInt();
		//System.out.println("st" +st);
		scan.nextLine();
		StringBuffer sb = new StringBuffer();
        int i = 0;
        while (scan.hasNext()) {
            sb.append(scan.nextLine() + "#");
        }
        String[] str = sb.toString().split("#");
        for(int j=0;j<str.length;j++) {
        	System.out.println(str[j]);
        }
        Student[] students = new Student[str.length];
        //System.out.println("length" +str.length);
        for (String line : str) {
        	
            String[] tokens = line.split(",");
            //System.out.println("tokens " +tokens[i]);
            students[i++] = new Student(tokens[0], tokens[1],Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3]),Integer.parseInt(tokens[4]),Integer.parseInt(tokens[5]),tokens[6]);
        }

        Selectionsort.sort(students);

        // String output = Arrays.toString(students);
        // //System.out.println("String output" +output);
        // output = output.replace("[", "").replace("]", "").
        //                 replace(", ", ",");
        // System.out.println(output);
        for (Student s : students)
           System.out.println(s.toString());

	}
}