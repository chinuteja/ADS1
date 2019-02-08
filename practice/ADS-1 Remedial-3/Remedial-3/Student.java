public class Student {
	int rollno;
	String name;
	Double marks;
	Student() {

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
		// System.out.println("this,marks" +this.marks);
		// System.out.println(this.marks);
		// System.out.println("that.marks" +that.marks);
		// System.out.println(that.marks);
		if (this.marks > that.marks) {
			// System.out.println("hello 1");
			return -1;
		}
		if (this.marks < that.marks) {
			// /System.out.println("hello2");
			return 1;
		}
		if (this.marks == that.marks) {
			// if (this.name > that.name) {
			// 	return -1;
			// }
			// int x = this.getName().compareTo(that.name);
			// System.out.println("Value of x");
			// System.out.println(x);
			
		}
		return 0;
	}
	public String toString() {
		String str = "";
		str += this.rollno + "," + this.name + "," + Double.toString(this.marks);
		return str;
	}
}