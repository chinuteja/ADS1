import java.util.*;
public class Student {
	int rollno;
	String name;
	Double marks;
	Student[] student;
	int size;
	Student() {
		student = new Student[10];
		size = 0;

	}
	Student(int rollno, String name, Double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public int getRollno(){
		return this.rollno;

	}
	public String getName() {
		return this.name;
	}
	public Double getMarks() {
		return this.marks;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
	public int compareTo(Student that) {
		// System.out.println("compareTo");
		// System.out.println("this,marks" +this.marks);
		// System.out.println(this.marks);
		// System.out.println("that.marks" +that.marks);
		// System.out.println(that.marks);
		if (this.marks > that.marks) {
			// System.out.println("name " +this.name);
			// System.out.println("marks "+this.marks);
			// System.out.println("name that " +that.name);
			// System.out.println("marks that"+that.marks);
			// System.out.println("hello 1");
			return 1;
		}
		if (this.marks < that.marks) {
			// /System.out.println("hello2");
			return -1;
		}
		if (this.marks == that.marks) {
			int x = this.getName().compareTo(that.name);
			// System.out.println("Value of x");
			// System.out.println(x);
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
	public void add(Student stud) {
		// if (student.length == size) {
		// 	resize();
		// }
		// student[size++ ] = stud;
		for (int i = 0; i< student.length ; i++) {
			if (student[i] == null) {
				student[i] = stud;
				size++;
				break;
			}
		}
	}
	public void sort() {
		Insertionsort insertionsort = new Insertionsort();
		insertionsort.sort(student,size);
	}
	public void resize() {
		student = Arrays.copyOf(student,student.length * 2);
	}
	public void result(double query) {
		for (int i=0; i<size ; i++) {
			if (student[i].getMarks() == query) {
				System.out.println(student[i].toString());
				
			}
			else {
				System.out.println("This marks are not awarded to any student");
			}
		}
	}
	public String toString() {
		String str = "";
		str += this.rollno + "," + this.name + "," + Double.toString(this.marks);
		return str;
	}
}