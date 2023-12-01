package friday_01_dec;

public abstract class RRTechnicalCertification implements Certification {
	
//	Instance Variables
	private String studentName;
	private String courseName;
	private int registrationId;
	private int admissionTestMarks;
	
//	Static Variable
	public static int counter = 1001;
	
//	Constructor
	public RRTechnicalCertification(String studentName, String courseName, int admissionTestMarks) {
		this.studentName = studentName;
		this.courseName = courseName;
		this.admissionTestMarks = admissionTestMarks;
	}
	
//	Methods
	public abstract void generateRegistrationId();
	public void displayCourseDetails() {
		if( this instanceof RegularCourseCertification ) {
			System.out.println("Regular Course Registration Details");
		} else if( this instanceof CrashCourseCertification ) {
			System.out.println("Crash Course Registration Details");
		}
		System.out.println("***********************************");
		System.out.println("Student Name     : " + this.getStudentName());
		System.out.println("Course Name      : " + this.getCourseName());
		if( this instanceof RegularCourseCertification ) {
			System.out.println("Course Duration  : " + ((RegularCourseCertification)this).getCourseDuration() + " months");
		} else if( this instanceof CrashCourseCertification ) {
			System.out.println("Course Duration  : 2 months");
		}
		System.out.println("Registration ID  : " + this.getRegistrationId());
		System.out.println("Fees             : " + this.calculateFee());
		System.out.println();
	}

//	Getters and Setters
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public int getAdmissionTestMarks() {
		return admissionTestMarks;
	}
	public void setAdmissionTestMarks(int admissionTestMarks) {
		this.admissionTestMarks = admissionTestMarks;
	}

}
