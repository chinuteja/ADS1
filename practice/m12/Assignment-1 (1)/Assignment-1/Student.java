/**
 * Class for student.
 */
class Student implements Comparable<Student> {
	String studentname;
	String dob;
	int total, subject1, subject2, subject3;
	String reservation;
	/**
	 * Constructs the object for student class.
	 *
	 * @param      studentname  The studentname
	 * @param      dob          The dob
	 * @param      subject1     The subject 1
	 * @param      subject2     The subject 2
	 * @param      subject3     The subject 3
	 * @param      total        The total
	 * @param      reservation  The reservation
	 */
	Student(String studentname, String dob, int subject1, int subject2, int subject3, int total, String reservation) {
		this.studentname = studentname;
		this.dob = dob;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.total = total;
		this.reservation = reservation;
	}
	public String getstudentname() {
		return this.studentname;
	}
	public String getdob() {
		return this.dob;
	}
	public int gettotal() {
		return this.total;
	}
	public int getsubject1() {
		return this.subject1;
	}
	public int getsubject2() {
		return  this.subject2;
	}
	public int getsubject3() {
		return this.subject3;
	}
	public String getreservation() {
		return this.reservation;
	}
	public void setstudentname(String studentname) {
		this.studentname = studentname;
	}
	public void setdob(String dob) {
		this.dob = dob;
	}
	public void settotal(int total) {
		this.total = total;
	}
	public void setsubject1(int subject1) {
		this.subject1 = subject1;
	}
	public void setsubject2(int subject2) {
		this.subject2 = subject2;
	}
	public void setsubject3(int subject3) {
		this.subject3 = subject3;
	}
	public void setreservation(String reservation) {
		this.reservation = reservation;
	}
	public String toString() {
		String str = "";
        str = str + this.studentname +","+ this.total+","+ this.reservation;
        //System.out.println();
        return str;
		
	}
	public int compareTo(Student that) {
		if (this.total > that.total)            return -1;
		if (this.total < that.total)            return  1;
		if (this.subject3 > that.subject3)      return -1;
		if (this.subject3 < that.subject3)      return 1;
		if (this.subject2 > that.subject2)      return -1;
		if (this.subject2 < that.subject2)      return  1;
		if (this.subject1 > that.subject1)      return -1;
		if (this.dob.equals(that.dob))          return -1;
		if (this.dob.equals(that.dob))          return 1;
		return 0;
	}
}