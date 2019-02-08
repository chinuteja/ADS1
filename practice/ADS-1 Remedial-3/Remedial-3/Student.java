import java.util.*;
class Student implements Comparable<Student>{
	private int rollno;
	private String name;
	private double marks;
	// private int nstuds;
	private int size;
	Student[] student_array;
	public Student(int rollno,String name,double marks){
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public Student(int n){
		student_array = new Student[n];
	}
	 public double getMarks(){
	  return marks;
	 }
	 
	 public void setMarks(double marks){
	  this.marks = marks;
	 }
	  public String getName(){
	   return name;
	  }
	  
	  public void setName(String name){
	   this.name = name;
	  }
	   public int getRollno(){
	    return rollno;
	   }
	   
	   public void setRollno(int rollno){
	    this.rollno = rollno;
	   }
	public void addStudent(Student student){
		student_array[size++] = student;
	}

	// public int indexOf(double query){
	// 	for (int i = 0;i < size;i++) {
	// 		if (sarray[i].getMarks()==query) {
	// 			return 1;
	// 		}
	// 	}
	// 	return 0;

	// }

	public void getResult(double marks){
		Insertionsort.sort(student_array,size);
		boolean flag = false;
		for (int i = 0; i<size ; i++) {
			if (marks == student_array[i].getMarks()) {
				System.out.println(student_array[i].toString());
				flag = true;
			}
		}
		if (flag) {
			System.out.println("This marks are not awarded to any student");
		}

	}

	public int compareTo(Student that) {
		
		if (this.marks > that.marks) {
			return -1;
		}
		if (this.marks < that.marks) {
			return 1;
		}
		if (this.marks == that.marks) {
			if (this.name.compareTo(that.name) > 0) {
				return -1;
			}
			if (this.name.compareTo(that.name) < 0) {
				return 1;
			}
	    }
		if (this.marks == that.marks && this.name.equals(that.name)) {
			if (this.rollno > that.rollno) {
				return -1;
			}
			if (this.rollno < that.rollno) {
				return 1;
			}
		}
		return 0;
	}
	public String toString(){
		return this.rollno+","+this.name+","+ this.marks;
	}




}