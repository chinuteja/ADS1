import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// BinarySearchST bsst = new BinarySearchST();
		Results results  = new Results();
		String n1 = scan.nextLine();
		int n = Integer.parseInt(n1);
		// scan.nextLine();
		Student student1 = new Student();
		// Student[] stud = new Student[10];
		ArrayList<Student> stud = new ArrayList<>();
		for (int i = 0; i < n ; i++) {
			String line = scan.nextLine();
			String[] tokens = line.split(",");
			Student student = new Student(Integer.parseInt(tokens[0]), tokens[1], Double.parseDouble(tokens[2]));
			// stud[i] = student;
			stud.add(student);
			student.add(student);
		}
		student1.sort();
		// scan.nextLine();
		String quires1 = scan.nextLine();
		int quires = Integer.parseInt(quires1);
		for (int i = 0; i < quires; i++) {
			// System.out.println("hello wo");
			String marks1 = scan.nextLine();
			double marks = Double.parseDouble(marks1);
			// System.out.println("hello");

			// if (marks == stud.get(j).getMarks()) {
			// 	System.out.println(stud.get(j).toString());
			// 	flag = false;

			// }
			student1.result(marks);



		}

		// int quires = scan.nextInt();
		// for (int i = 0; i< quires ; i++) {
		// 	Double mark = scan.nextDouble();
		// 	bsst.get(mark);
		// 	System.out.println(bsst.toString());
		// }
	}
}