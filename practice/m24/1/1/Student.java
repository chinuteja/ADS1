/**.
 * Class for student.
 */
class Student {
	String rollno;
	String name;
	Double marks;
    Student(String rollno, String name , Double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public  String getRollno() {
		return this.rollno;
	}
	public  String getName() {
		return this.name;
	}
	public Double marks() {
		return this.marks;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
}
