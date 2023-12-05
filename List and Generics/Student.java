package tuesday_05_dec;

public class Student<T1,T2,T3> {
	
//	Instance Variables
	private T1 studentId;
	private T2 studentName;
	private T3 courseRegistered;

//	Constructor
	public Student(T1 studentId, T2 studentName, T3 courseRegistered) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseRegistered = courseRegistered;
	}

//	Getters and Setters
	public T1 getStudentId() {
		return studentId;
	}
	public void setStudentId(T1 studentId) {
		this.studentId = studentId;
	}
	public T2 getStudentName() {
		return studentName;
	}
	public void setStudentName(T2 studentName) {
		this.studentName = studentName;
	}
	public T3 getCourseRegistered() {
		return courseRegistered;
	}
	public void setCourseRegistered(T3 courseRegistered) {
		this.courseRegistered = courseRegistered;
	}

}
