import java.util.*;
public class Student {
	int rollno;
	String name;
	double marks;
	Student(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	Student[] stud;
	int size;
	Student(int n) {
		stud = new Student[n];
		size = 0;
	}
	public int getRollNo() {
		return this.rollno;
	}
	public String getName() {
		return this.name;
	}
	public double getMarks() {
		return this.marks;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRollNo(int rollno) {
		this.rollno = rollno;
	}
	public void addObj(Student student) {
		// System.out.println("length " +stud.length);
		for (int i = 0; i<stud.length ; i++) {
			if (stud[i] == null) {
				stud[i] = student;
				size++;
				break;	
			}	
		}		
	}
	public void sort(Student[] stud) {
		Insertionsort.sort(stud, size);
	}
	public void getResult(double marks){
		Insertionsort.sort(stud,size);
		boolean flag = true;
		for (int i = 0; i<size ; i++) {
			if (marks == stud[i].getMarks()) {
				System.out.println(stud[i].toString());
				flag = false;
			}
		}
		if (flag) {
			System.out.println("This marks are not awarded to any student");
		}

	}
	public String toString() {
		String str = "";
		// for (int i = 0; i<size ; i++ ) {
		// 	str += stud[i].getRollNo() + "," + stud[i].getName() + ","  + stud[i].getMarks();
			
		// }
		str += this.rollno + "," + this.name + "," + this.marks;
		return str;
	}
	public int compareTo(Student that) {
		if (this.marks < that.marks) {

			return -1;
		}
		if (this.marks > that.marks) {
			return 1;
		}
		if (this.marks == that.marks) {
			int x = this.name.compareTo(that.name);
			if (x > 0) {
				return 1;
			}
			if (x < 0) {
				return -1;
			}
			if (x == 0) {
				return 0;
			}

		}
		return 0;
	}


}