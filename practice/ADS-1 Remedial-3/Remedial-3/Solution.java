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
		Student[] stud = new Student[10];
		for (int i = 0; i < n ; i++) {
			String line = scan.nextLine();
			String[] tokens = line.split(",");
			Student student = new Student(Integer.parseInt(tokens[0]), tokens[1], Double.parseDouble(tokens[2]));
			stud[i] = student;
			results.add(student);
		}
		results.sort();
		// scan.nextLine();
		String quires1 = scan.nextLine();
		int quires = Integer.parseInt(quires1);
		for (int i = 0; i < quires; i++) {
			// System.out.println("hello wo");
			String marks1 = scan.nextLine();
			double marks = Double.parseDouble(marks1);
			// System.out.println("hello");
			boolean flag = true;
			for (int j = 0; j < n; j++) {
				if (marks == stud[j].getMarks()) {
					System.out.println(stud[j].toString());
					flag = false;

				}

			}
			if (flag) {
				System.out.println("This marks are not awarded to any student");
			}


		}

		// int quires = scan.nextInt();
		// for (int i = 0; i< quires ; i++) {
		// 	Double mark = scan.nextDouble();
		// 	bsst.get(mark);
		// 	System.out.println(bsst.toString());
		// }
	}
}