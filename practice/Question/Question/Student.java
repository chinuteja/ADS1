
public class Student {
	
	// Constructor
	int rollno;
	double percentage;
	Student[] student;
	int size;
	Student(int n) {
		student = new Student[n];
		size = 0;

	}
	public Student(int roll, double percentage){
		this.roll = roll;
		this.percentage = percentage;
		
	}
	 public int getRollno(){
	  return rollno;
	 }
	 
	 public void setRollno(int rollno){
	  this.rollno = rollno;
	 }
	  public double getPercentage(){
	   return percentage;
	  }
	  
	  public void setPercentage(double percentage){
	   this.percentage = percentage;
	  }
	  public void addObj(Student stud) {
	  	student[size++] = stud;
	  }
	  
	
}