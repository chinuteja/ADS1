
public class Student  implements Comparable<Student> {

	// Constructor
	String  name, branch;
	int id;
	double percentage;
	public Student(int id, String name, String branch, double percentage) {
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.percentage = percentage;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public int compareTo(Student that) {
		if (this.percentage > that.percentage) {
			return 1;
		}
		if (this.percentage < that.percentage) {
			return -1;
		}
		if (this.id < that.id) {
			return 1;
		}
		if (this.id > that.id) {
			return -1;
		} else {
			return 0;
		}
	}
	public String toString() {
		String str = "";
		str = str + this.id + "," + this.name + "," + this.branch + "," + this.percentage;
		return str;
	}

}