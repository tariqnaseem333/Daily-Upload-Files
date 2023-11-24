package assignmentSet2;

public class CourseRegistration {
	
//	Instance Variables
	private String studentName;
	private int registrationId;
	private float qualifyingMarks;
	private double courseFee;
	private int courseId;
	private boolean hostelRequired;

//	Methods
	public boolean validateMarks() {
		if( this.getQualifyingMarks() >= 65 && this.getQualifyingMarks() <= 100 ) {
			return true;
		} 
		return false;
	}
	public boolean validateCourseId() {
		if( this.getCourseId() >= 1001 && this.getCourseId() <= 1005 ) {
			return true;
		}
		return false;
	}
	public void calculateCourseFee() {
		this.validateMarks();
		double discount = 0;
		if( this.getQualifyingMarks() >= 65 && this.getQualifyingMarks() <= 69  ) {
			discount = 5;
		} else if( this.getQualifyingMarks() >= 70 && this.getQualifyingMarks() <= 84  ) {
			discount = 10;
		} else if( this.getQualifyingMarks() >= 85  ) {
			discount = 15;
		}
		
		this.validateCourseId();
		double baseFee = 0;
		switch( this.getCourseId() ) {
			case 1001 : this.setCourseFee(55_000); 
			break;
			case 1002 : this.setCourseFee(35_675); 
			break;
			case 1003 : this.setCourseFee(28_300); 
			break;
			case 1004 : this.setCourseFee(22_350); 
			break;
			case 1005 : this.setCourseFee(1_15_000); 
			break;
			default : 
		}
		this.setCourseFee(baseFee * ( 1 - discount / 100.0 ));
	} 
	
	public void displayCourseDetails() {
		if( !this.validateCourseId() ) 
			System.out.println("Invalid Course Id. Please try again!!");
		else if( !this.validateMarks() ) 
			System.out.println("Marks is less than 65. You are not eligible for admission!!");
		else if ( !this.validateCourseId() && !this.validateMarks() ) {
			System.out.println("Invalid Course Id. Please try again!!");
			System.out.println("Marks is less than 65. You are not eligible for admission!!");
		} 
		else {
			System.out.println("********Course Allocation Details********");
			System.out.println("Student Name: "+ this.getStudentName());
			System.out.println("Course Id: " + this.getCourseId());
			System.out.println("Qualifying Exam Marks: " + this.getQualifyingMarks());
			System.out.println("Student's Registration Id: " + this.getRegistrationId());
			System.out.println("Total course fee: " + this.getCourseFee());
			System.out.println("Hostel Required: " + this.isHostelRequired());
		}
	}
	
//	Getters and Setters
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public float getQualifyingMarks() {
		return qualifyingMarks;
	}
	public void setQualifyingMarks(float qualifyingMarks) {
		this.qualifyingMarks = qualifyingMarks;
	}
	public double getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public boolean isHostelRequired() {
		return hostelRequired;
	}
	public void setHostelRequired(boolean hostelRequired) {
		this.hostelRequired = hostelRequired;
	}

}
