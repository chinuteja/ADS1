import java.util.*;
class Solution{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		Student student = new Student(n);
		for (int i = 0;i < n;i++) {
			String[]tokens = scan.nextLine().split(",");
			// System.out.println(Arrays.toString(tokens));
			Student student1 = new Student(Integer.parseInt(tokens[0]),tokens[1],(Double.parseDouble(tokens[2])));
			student.addObj(student1);
		}
		int quires = Integer.parseInt(scan.nextLine());
		// double marks = 0;
		for (int j = 0;j < quires;j++) {
			 String marks = scan.nextLine();
			 double marks1 = Double.parseDouble(marks);
			 student.getResult(marks1);
		}
		
	}

}