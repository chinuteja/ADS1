import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		Student student;
		Student student1 = new Student(n);
		for (int i = 0; i<n ; i++) {
			String line = scan.nextLine();
			String[] tokens = line.split(",");
			student = new Student(tokens[0],tokens[1],Double.parseDouble(tokens[2]));
			student1.addObj(student);
		}
		int query = Integer.parseInt(scan.nextLine());
		for (int i = 0; i< n ;  i++) {
			Double marks = Double.parseDouble(scan.nextLine());
			student1.getResult(marks);
		}
	}
}