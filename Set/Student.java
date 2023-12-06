package wednesday_06_dec;

public class Student implements Comparable<Student>{
	
//	Instance Variable
	private Integer studentId;
	private String studentName;
	private Integer studentSemester;

//	Constructor
    public Student(String studentName, Integer studentSemester, Integer studentId) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentSemester = studentSemester;
	}
    
//  Methods
    public void displayDetails() {
    	System.out.println();
    	System.out.println("Student Id: " + this.getStudentId());
    	System.out.println("Name: " + this.getStudentName());
    	System.out.println("Semester: " + this.getStudentSemester());
    	
    }
    @Override
    public int compareTo(Student student) {
    	
    	if( this.getStudentId() > student.getStudentId() ) {
    		return 1;
    	} else if( this.getStudentId() < student.getStudentId() ) {
    		return -1;
    	} else {
    		return 0;
    	}
    	
    }
    @Override 
    public boolean equals( Object s ) {
    	Student student = null;
    	boolean flag = false;
    	if( s instanceof Student ) {
    		student = (Student)s;
    		flag = this.getStudentId().equals(student.getStudentId());
    	}
    	return flag;
    }
    @Override
    public int hashCode() {
    	return this.getStudentId();
    }

//	Getters and setters
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getStudentSemester() {
		return studentSemester;
	}
	public void setStudentSemester(Integer studentSemester) {
		this.studentSemester = studentSemester;
	}
	
}
