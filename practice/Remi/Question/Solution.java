import java.util.*;
public class Solution {



	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int noofstudents = Integer.parseInt(scan.nextLine());
		Student student = new Student(noofstudents);
		for (int i = 0; i < noofstudents ; i++) {
			String line = scan.nextLine();
			String[] tokens = line.split(",");
			student.addObj(new Student(Integer.parseInt(tokens[0]), Double.parseDouble(tokens[1])));
		}
		student.result();
		int quire = Integer.parseInt(scan.nextLine());
		for(int i = 0; i <quire; i++) {
			int rollno = Integer.parseInt(scan.nextLine());
			student.func(rollno);
		}

	}
}