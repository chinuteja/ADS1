import java.util.*;
public class Student implements Comparable<Student> {

	// Constructor
	int rollno;
	double marks;
	Student[] student;
	int size;
	Hashtable<Integer, Double> ht = new Hashtable<>();
	Student(int n) {
		student = new Student[n];
		size = 0;

	}
	public Student(int rollno, double marks) {
		this.rollno = rollno;
		this.marks = marks;

	}
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	public void addObj(Student stud) {
		student[size++] = stud;
	}
	public int size() {
		return size;
	}
	public int compareTo(Student that) {
		if (this.marks < that.marks) {
			return 1;
		} else
			return -1;
	}
	public void sorted(Student[] student) {
		Merge.sort(student, size);
	}
	public void result() {
		sorted(student);
		int i;
		// for ( i = 0; i < size() - 1 ; i++ ) {
		// 	double percentage = 0;
		// 	// System.out.println(student[i].getRollno());
		// 	percentage = (double)(size() - i) / size();
		// 	percentage = percentage * 10000;
		// 	// System.out.println("percentage " +percentage);
		// 	percentage = Math.round(percentage);

		// 	ht.put(student[i].getRollno(), percentage / 100);

		// 	if (student[i + 1].getMarks() == student[i].getMarks()) {
		// 		System.out.println("if " );
		// 		ht.put(student[i +1].getRollno(), percentage / 100);
		// 		// i = i + 1;
		// 		System.out.println(ht);
		// 	}
		// }
		// double percentage1 = 0;
		// percentage1 = (double)(size() - i) / size();
		// percentage1 = percentage1 * 10000;
		// // System.out.println("percentage " +percentage);
		// percentage1 = Math.round(percentage1);
		// ht.put(student[i].getRollno(), percentage1 / 100);
		// // System.out.println("HashTable" + ht);
		for (i = 0; i < size() - 1 ; i++ ) {
			double percentage = 0;
			System.out.println("roll no" +student[i].getRollno());
			// boolean flag = true;
			// percentage = (double) (size() - i) / size();
			// percentage = percentage * 10000;
			// percentage = Math.round(percentage);
			// ht.put(student[i].getRollno(), percentage / 100);
			// System.out.println("if block  " + ht  );

			if (student[i + 1].getMarks() == student[i].getMarks()) {
				percentage = (double) (size() - i) / size();
				percentage = percentage * 10000;
				percentage = Math.round(percentage);
				ht.put(student[i].getRollno(), percentage / 100);
				// ht.put(student[i + 1].getRollno(), percentage / 100);
				// i = i + 1;
				System.out.println("if bock  " +ht);


			} else {
				percentage = (double) (size() - i) / size();
				percentage = percentage * 10000;
				percentage = Math.round(percentage);
				ht.put(student[i].getRollno(), percentage / 100);
				System.out.println(ht);
			}

			// System.out.println("HashTable" + ht);

		}
		double percentage1 = 0;
		percentage1 = (double)(size() - i) / size();
		percentage1 = percentage1 * 10000;
		// System.out.println("percentage " +percentage);
		percentage1 = Math.round(percentage1);
		ht.put(student[i].getRollno(), percentage1 / 100);
		System.out.println("Hashtable "+ht);

	}
	public void func(int roll) {
		System.out.println(ht.get(roll));
	}


}