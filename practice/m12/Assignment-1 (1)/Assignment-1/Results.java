import java.util.*;
class Results {
	Student[] students;
	int size,vaccancy,unreserved,bc,sc,st;
	Results() {
      students = new Student[100];
      size = 0;
	}
	public void addVac(int vaccancy, int unreserved, int bc, int sc, int st) {
		this.vaccancy = vaccancy;
		this.unreserved = unreserved;
		this.bc = bc;
		this.sc = sc;
		this.st = st;
	}
	public void add(Student obj) {
		students[size++] = obj;
	}
	public void allotment() {
		//int i;
		int countbc = 0;
		int countsc = 0;
		int countst = 0;
		for (int i=0;i<unreserved;i++) {
			//System.out.println("Students" +students[i]);
			System.out.println(students[i].toString());

		}
	// 	for (int j=0;j<size && countbc<bc;j++) {
	// 		if (students[j].getreservation().equals("BC")) {
	// 			System.out.println(students[j].toString());
	// 			countbc++;
	// 		}
	// 	}
	}
}