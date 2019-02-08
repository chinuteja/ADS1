class Results {
	Student[] student;
	int size;
	Results() {
		student = new Student[20];
		size = 0;
	}
	public void add(Student stud) {
		student[size++ ] = stud;
	}
	public void sort() {
		Insertionsort insertionsort = new Insertionsort();
		insertionsort.sort(student,size);
	}
	public String toString() {
		String str = "";
		for (int i = 0; i < size ; i++ ) {
			str += student[i].getRollno()+"," + student[i].getName() + "," + student[i].getMarks() + "\n";
		}
		return str;
	}

}